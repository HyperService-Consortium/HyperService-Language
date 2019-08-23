package edu.cwru.rise.vyper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import edu.cwru.rise.hslang.structure.Array;
import edu.cwru.rise.hslang.structure.Contract;
import edu.cwru.rise.hslang.structure.Field;
import edu.cwru.rise.hslang.structure.Function;
import edu.cwru.rise.hslang.structure.Mapping;
import edu.cwru.rise.hslang.structure.Modifier;
import edu.cwru.rise.hslang.structure.Parameter;
import edu.cwru.rise.hslang.structure.Struct;
import edu.cwru.rise.hslang.structure.Type;
import edu.cwru.rise.vyper.parser.VyperBaseVisitor;
import edu.cwru.rise.vyper.parser.VyperParser;

/**
 * Created by {Jian Shi} on 2019/4/20.
 */
public class VPOpIntentVisitor extends VyperBaseVisitor{
    public HashMap<String, Type> types = new HashMap<>(); // store contracts' type
    public HashMap<String, Contract> contracts = new HashMap<>(); // store all imported contracts
    public Contract curr =  new Contract();
    int index = 0; // the order of field
    public HashMap<String, List<Field>> structs = new HashMap<>(); // store struct

    /**
     * find the state variable
     * @param ctx State variable declaration
     * @return object
     */
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
        f.pos = posLocation();
        curr.fields.add(f);
        return super.visitStateVariableDeclaration(ctx);
    }

    /**
     * find function and store it modifiers, input statments and return types
     * @param ctx function declaration
     * @return object
     */
    @Override
    public Object visitFunctionDefinition(VyperParser.FunctionDefinitionContext ctx) {
        Function tmp = new Function();
        String decTmp = ctx.decorators().dec.getText();
        if(decTmp.equals("public")){
            tmp.modifiers.add(Modifier.PUBLIC);
        }
        else{
            tmp.modifiers.add(Modifier.PRIVATE);
            return super.visitFunctionDefinition(ctx);
        }
        for(VyperParser.DecoratorContext decor : ctx.decorators().decorator()){
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

    /**
     * find the struct statment and store it fields
     * @param ctx struct statement
     * @return object
     */
    @Override
    public Object visitStructDefinition(VyperParser.StructDefinitionContext ctx) {
        Struct newStruct = new Struct();
        String name = ctx.structName.getText();
        newStruct.name = name;
        List<Field> tmp = new ArrayList<>();
        // get the fields in the sturct
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

    /**
     * rank the order
     * @return order
     */
    private String posLocation(){
        StringBuffer res = new StringBuffer(""+index);
        index++;
        return res.toString();
    }


    /**
     * mapping the type to our defined type
     * @param typename input type
     * @return self defined type
     */
    private Type findType(String typename) {
        // convert the type to basic type
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
        // map type
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

        }
        // array type
        else {
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
}
