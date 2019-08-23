package edu.cwru.rise.golang;

import java.util.HashMap;

import edu.cwru.rise.golang.parser.GolangBaseVisitor;
import edu.cwru.rise.golang.parser.GolangParser;
import edu.cwru.rise.golang.parser.GolangParser.FieldDeclContext;
import edu.cwru.rise.golang.parser.GolangParser.MethodDeclContext;
import edu.cwru.rise.golang.parser.GolangParser.ParameterDeclContext;
import edu.cwru.rise.golang.parser.GolangParser.StructTypeContext;
import edu.cwru.rise.hslang.structure.*;

/**
 * Created by {Jian Shi} on 2019/4/27.
 */
public class GoOpIntentVisitor extends GolangBaseVisitor{
    public Contract cur; // contract been imported
    public HashMap<String, Type> types = new HashMap<>();  // store contrats' type
    public HashMap<String, Contract> contracts = new HashMap<>(); // store all contratcs that been imported
    int count = 0; // rank field order

    /**
     * find the struct and get all the fields in the struct
     * @param ctx struct
     * @return object
     */
    @Override
    public Object visitTypeSpec(GolangParser.TypeSpecContext ctx) {
        String tyName = ctx.IDENTIFIER().getText();
        // Only record the struct that name's first letter is Capital letter
        if(!Character.isUpperCase(tyName.charAt(0))){
            return super.visitTypeSpec(ctx);
        }
        StructTypeContext tmp = ctx.type().typeLit().structType();
        if(tmp != null){
            Contract cur = new Contract();
            cur.name = tyName;
            contracts.put(tyName, cur);
            //Get field information
            for(FieldDeclContext fieldDec : tmp.fieldDecl()){
                if(fieldDec.anonymousField()!= null){
                    Field f = new Field();
                    f.name = "anonymousField";
                    f.type = findType(fieldDec.anonymousField().getText());
                    f.pos = String.valueOf(count++);
                    cur.fields.add(f);
                }
                else{
                    if(fieldDec.identifierList() != null){
                        if(fieldDec.type().getText().contains("cmn")){
                            continue;
                        }
                        Field f = new Field();
                        f.name = fieldDec.identifierList().getText();
                        f.type  = findType(fieldDec.type().getText());
                        f.pos = String.valueOf(count++);
                        cur.fields.add(f);
                    }
                }
            }
        }
        return super.visitTypeSpec(ctx);
    }

    /**
     * Get the function declaration
     * @param ctx function statment
     * @return object
     */
    @Override
    public Object visitMethodDecl(MethodDeclContext ctx) {
        String contrName =ctx.receiver().type().getText().replace("*", "");
        Contract contr = contracts.get(contrName);
        Function func = new Function();
        String funcName = ctx.IDENTIFIER().getText();
        // Only record the function that name's first letter is Capital letter
        if(!Character.isUpperCase(funcName.charAt(0))){
            return super.visitMethodDecl(ctx);
        }
        func.name = funcName;

        if(ctx.function() != null){
            // get inputs type
            if(ctx.function().signature().parameters().parameterList() != null) {
                for (ParameterDeclContext par : ctx.function().signature().parameters().parameterList().parameterDecl()) {
                    Parameter parameter = new Parameter();
                    parameter.name = par.identifierList().getText();
                    parameter.type = findType(par.type().getText());
                    func.args.add(parameter);
                }
            }

            //get return type
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

    /**
     * mapping the type to our defined type
     * @param typename input type
     * @return self defined type
     */
    private Type findType(String typename) {
        // convert the type to basic type
        typename = typename.replace("*","");
        typename = typename.replace("[]byte","address");
        typename = typename.replace("math.Uint256","uint");
        typename = typename.replace("localstorage.BytesMap","map[address]bool");
        typename = typename.replace("localstorage.Int64Map","address[]");
        if (types.containsKey(typename)) {
            return types.get(typename);
        }
        Type t = new Type();
        // find the mapping type
        if (typename.contains("map") && typename.contains("[")) {
            typename = typename.replace("string","address");
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

        }
        // find array type
        else {
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
                t.name = typename;
                types.put(typename,t);
            }
        }
        return t;
    }

    /**
     * find the index
     * @param name type
     * @return the index of A in situation [ A,B]
     */
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
