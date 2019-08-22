package edu.cwru.rise.vyper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import edu.cwru.rise.hslang.structure.*;
import edu.cwru.rise.vyper.parser.VyperBaseVisitor;
import edu.cwru.rise.vyper.parser.VyperParser;
import edu.cwru.rise.vyper.parser.VyperParser.DecoratorContext;

/**
 * Created by {Jian Shi} on 2019/4/20.
 */
public class VPVistor extends VyperBaseVisitor{
    public HashMap<String, Type> types = new HashMap<>();
    public HashMap<String, Contract> contracts = new HashMap<>();
    public Contract curr =  new Contract();
    int index = 0;
    HashMap<String, List<Field>> structs = new HashMap<>();

    private Type findType(String typename) {
        typename = typename.replaceAll("int128", "uint");
        typename = typename.replaceAll("uint256", "uint");
        typename = typename.replaceAll("decimal", "uint");
        typename = typename.replaceAll("timestamp", "uint");
        typename = typename.replaceAll("timedelta", "uint");
        typename = typename.replaceAll("wei_value", "uint");

        if(typename.contains("(") && !typename.contains("map")){
            typename = typename.substring(0, typename.indexOf("(")).trim();
        }

        if (types.containsKey(typename)) {
            return types.get(typename);
        }
        Type t = new Type();
        if (typename.contains("map")) {
            Mapping mapping = new Mapping();

            String fromtypename = typename.substring(typename.indexOf("(") + 1, typename.indexOf(",")).trim();
            String totypename = typename.substring(typename.indexOf(",")+1, typename.lastIndexOf(")")).trim();

            Type keytype = findType(fromtypename);
            Type valuetype = findType(totypename);
            mapping.keytype = keytype;
            mapping.valuetype = valuetype;
            StringBuffer tmpName = new StringBuffer();
            tmpName.append("map(");
            tmpName.append(keytype.name);
            tmpName.append(",");
            tmpName.append(valuetype.name);
            tmpName.append(")");
            mapping.name = tmpName.toString();
            t = mapping;

        } else {
            if (typename.contains("[") && typename.contains("]")) {
                if(typename.contains("string")){
                    t.name = "string";
                }
                else {
                    Array arr = new Array();
                    Type elemtype = findType(typename.substring(0, typename.indexOf("[")));
                    arr.elemType = elemtype;
                    String size = typename.substring(typename.indexOf("[") + 1, typename.indexOf("]")).trim();
                    arr.length = Integer.parseInt(size);
                    return elemtype;
                }

            } else {
                //Type t = new Type();
                t.name = typename;
                types.put(typename,t);
            }
        }
        return t;
    }

    @Override
    public Object visitStructDefinition(VyperParser.StructDefinitionContext ctx) {
        Struct newStruct = new Struct();
        String name = ctx.structName.getText();
        newStruct.name = name;
        List<Field> tmp = new ArrayList<>();
        for(VyperParser.StructVarContext var : ctx.structVar()){
            Field f = new Field();
            f.type = findType(var.type().getText());
            f.name = var.identifier().getText();
            f.pos = "null";
            tmp.add(f);
        }
        newStruct.fields = tmp;
        structs.put(name,tmp);
        types.put(name, newStruct);
        return super.visitStructDefinition(ctx);
    }

    @Override
    public Object visitStateVariableDeclaration(VyperParser.StateVariableDeclarationContext ctx) {
        if(ctx.getText().contains("constant")){
            return super.visitStateVariableDeclaration(ctx);
        }
        String typeName = ctx.varType.getText();
        Type t = findType(typeName);
        Field f = new Field();
        f.name = ctx.varName.getText();
        f.type = t;
        f.pos = posLocation(typeName);
        curr.fields.add(f);
        return super.visitStateVariableDeclaration(ctx);
    }

  /*
  eference types do not fit into 32 bytes. Because of this,
  copying their value is not as feasible as with value types.
   Therefore only the location, i.e. the reference, of the data is passed. (List, Struct, Map only add 1)?
   */
    private String posLocation(String typeName){
        StringBuffer res = new StringBuffer(""+index);
        index++;
        return res.toString();
    }

    @Override
    public Object visitFunctionDefinition(VyperParser.FunctionDefinitionContext ctx) {
        Function tmp = new Function();
       // tmp.modifiers.add()
        String decTmp = ctx.decorators().dec.getText();
        if(decTmp.equals("public")){
            tmp.modifiers.add(Modifier.PUBLIC);
        }
        else{
            tmp.modifiers.add(Modifier.PRIVATE);
            return super.visitFunctionDefinition(ctx);
        }
        for(DecoratorContext decor : ctx.decorators().decorator()){
            switch (decor.dec.getText()) {
                case "payable":
                    tmp.modifiers.add(Modifier.PAYABLE);
                    break;
                case "constant":
                    tmp.modifiers.add(Modifier.CONSTANT);
                    break;
                case "nonrentant":
                    tmp.modifiers.add(Modifier.NONRENTANT);
                    break;
            }
        }
        tmp.name = ctx.functionArgument().funcName.getText();
        for(VyperParser.ParameterContext par : ctx.functionArgument().parameterList().parameter()){
            Parameter p = new Parameter();
            p.name = par.parName.getText();
            p.type = findType(par.parType.getText());
            tmp.args.add(p);
        }

        if(ctx.functionArgument().typeList() != null) {
            for (VyperParser.TypeContext ret : ctx.functionArgument().typeList().type()) {
                Parameter p = new Parameter();
                p.type = findType(ret.getText());
                tmp.returns.add(p);
            }
        }
        curr.functions.add(tmp);
        return super.visitFunctionDefinition(ctx);
    }
}
