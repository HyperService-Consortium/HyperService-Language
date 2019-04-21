package edu.cwru.rise.vyper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import edu.cwru.rise.hslang.Array;
import edu.cwru.rise.hslang.Contract;
import edu.cwru.rise.hslang.Field;
import edu.cwru.rise.hslang.Mapping;
import edu.cwru.rise.hslang.Type;
import edu.cwru.rise.vyper.parser.VyperBaseVisitor;
import edu.cwru.rise.vyper.parser.VyperParser;
import edu.cwru.rise.hslang.Struct;

/**
 * Created by {Jian Shi} on 2019/4/20.
 */
public class VPVistor extends VyperBaseVisitor{
    public HashMap<String, Type> types = new HashMap<>();
    public HashMap<String, Contract> contracts = new HashMap<>();
    public Contract curr =  new Contract();

    HashMap<String, List<Field>> structs = new HashMap<>();

    Type findType(String typename) {
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

            mapping.name = typename;
            mapping.keytype = keytype;
            mapping.valuetype = valuetype;

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
                    if (size.length() != 0) {
                        arr.length = Integer.parseInt(size);
                    }
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
        List<Field> tmp = new ArrayList<>();
        for(VyperParser.StructVarContext var : ctx.structVar()){
            Field f = new Field();
            f.type = findType(var.type().getText());
            f.name = var.identifier().getText();
            f.pos = "null";
            tmp.add(f);
        }
        structs.put(name,tmp);
        types.put(name, newStruct);
        return super.visitStructDefinition(ctx);
    }

    @Override
    public Object visitStateVariableDeclaration(VyperParser.StateVariableDeclarationContext ctx) {
        return super.visitStateVariableDeclaration(ctx);
    }
}
