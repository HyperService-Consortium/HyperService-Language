package edu.cwru.rise.golang;

import java.util.HashMap;

import edu.cwru.rise.golang.parser.GolangBaseVisitor;
import edu.cwru.rise.golang.parser.GolangParser;
import edu.cwru.rise.golang.parser.GolangParser.FieldDeclContext;
import edu.cwru.rise.golang.parser.GolangParser.MethodDeclContext;
import edu.cwru.rise.golang.parser.GolangParser.ParameterDeclContext;
import edu.cwru.rise.golang.parser.GolangParser.StructTypeContext;
import edu.cwru.rise.hslang.Array;
import edu.cwru.rise.hslang.Contract;
import edu.cwru.rise.hslang.Field;
import edu.cwru.rise.hslang.Function;
import edu.cwru.rise.hslang.Mapping;
import edu.cwru.rise.hslang.Parameter;
import edu.cwru.rise.hslang.Type;

/**
 * Created by {Jian Shi} on 2019/4/27.
 */
public class GoVistor extends GolangBaseVisitor{
    Contract cur;
    public HashMap<String, Type> types = new HashMap<>();
    public HashMap<String, Contract> contracts = new HashMap<>();

    @Override
    public Object visitTypeSpec(GolangParser.TypeSpecContext ctx) {
        String tyName = ctx.IDENTIFIER().getText();
        StructTypeContext tmp = ctx.type().typeLit().structType();
        if(tmp != null){
            Contract cur = new Contract();
            cur.name = tyName;
            contracts.put(tyName, cur);
            for(FieldDeclContext fieldDec : tmp.fieldDecl()){
                if(fieldDec.anonymousField()!= null){
                    Field f = new Field();
                    f.name = "anonymousField";
                    f.type = findType(fieldDec.anonymousField().getText());
                    cur.fields.add(f);
                }
                else{
                    if(fieldDec.identifierList() != null){
                        Field f = new Field();
                        f.name = fieldDec.identifierList().getText();
                        f.type  = findType(fieldDec.type().getText());
                        cur.fields.add(f);
                    }
                }
            }
        }
        return super.visitTypeSpec(ctx);
    }

    @Override
    public Object visitMethodDecl(MethodDeclContext ctx) {
        String contrName =ctx.receiver().type().getText().replace("*", "");
        Contract contr = contracts.get(contrName);
        Function func = new Function();
        func.name = ctx.IDENTIFIER().getText();

        if(ctx.function() != null){
            if(ctx.function().signature().parameters().parameterList() != null) {
                for (ParameterDeclContext par : ctx.function().signature().parameters().parameterList().parameterDecl()) {
                    Parameter parameter = new Parameter();
                    parameter.name = par.identifierList().getText();
                    parameter.type = findType(par.type().getText());
                    func.args.add(parameter);
                }
            }

            if(ctx.function().signature().result().parameters()!= null) {
                for (ParameterDeclContext par : ctx.function().signature().result().parameters().parameterList().parameterDecl()) {
                    Parameter parameter = new Parameter();
                    parameter.type = findType(par.type().getText());
                    func.returns.add(parameter);
                }
            }
            else{
                if(ctx.function().signature().result().type()!= null){
                    Parameter parameter = new Parameter();
                    parameter.type = findType(ctx.function().signature().result().type().getText());
                    func.returns.add(parameter);
                }
            }
        }
        contr.functions.add(func);
        return super.visitMethodDecl(ctx);
    }

    private Type findType(String typename) {
        // may be need change?
        typename = typename.replace("*","");

        if (types.containsKey(typename)) {
            return types.get(typename);
        }
        Type t = new Type();
        if (typename.contains("map") && typename.contains("[")) {
            Mapping mapping = new Mapping();
            int i = findIndex(typename);
            String fromtypename = typename.substring(typename.indexOf("[") + 1, i).trim();
            String totypename = typename.substring(i+1, typename.length()).trim();

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
                Array arr = new Array();
                arr.name = typename;
                Type elemtype = findType(typename.substring(typename.lastIndexOf("]")+1, typename.length()));
                arr.elemType = elemtype;
                String size = typename.substring(typename.indexOf("[") + 1, typename.indexOf("]")).trim();
                if(size.length()!= 0) {
                    arr.length = Integer.parseInt(size);
                }
                return arr;

            } else {
                //Type t = new Type();
                t.name = typename;
                types.put(typename,t);
            }
        }
        return t;
    }

    private int findIndex(String name){
        int index = name.indexOf("[");
        int count = 1;
        while(count != 0){
            index++;
            if(name.charAt(index)== '['){
                count++;
            }else{
                if(name.charAt(index) == ']'){
                    count--;
                }
            }
        }
        return index;
    }
}
