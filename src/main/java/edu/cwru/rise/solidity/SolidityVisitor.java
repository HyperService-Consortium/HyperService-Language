package edu.cwru.rise.solidity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import edu.cwru.rise.hslang.Array;
import edu.cwru.rise.hslang.Contract;
import edu.cwru.rise.hslang.Field;
import edu.cwru.rise.hslang.Function;
import edu.cwru.rise.hslang.Mapping;
import edu.cwru.rise.hslang.Modifier;
import edu.cwru.rise.hslang.Parameter;
import edu.cwru.rise.hslang.Struct;
import edu.cwru.rise.hslang.Type;
import edu.cwru.rise.solidity.parser.SolidityBaseVisitor;
import edu.cwru.rise.solidity.parser.SolidityParser;

public class SolidityVisitor extends SolidityBaseVisitor {

    public HashMap<String, Type> types = new HashMap<>();
    public HashMap<String, Contract> contracts = new HashMap<>();
    Contract curr;
    int i = 0;
    public Contract getContract() {
        return curr;
    }
    HashMap<String, List<Field>> structs = new HashMap<>();

    @Override
    public Object visitContractDefinition(SolidityParser.ContractDefinitionContext ctx) {
        Contract contract = new Contract();
        contract.name = ctx.identifier().getText();
        curr = contract;

        contracts.put(contract.name, contract);
        return super.visitContractDefinition(ctx);
    }

    Type findType(String typename) {
        if(typename.equals("int") && !typename.contains("uint")){
            typename = typename.replaceAll("int", "uint");
        }
        //typename = typename.replaceAll("uint", "integer");
        typename = typename.replaceAll("addresspayable", "address");
        if (types.containsKey(typename)) {
            return types.get(typename);
        }
        Type t = new Type();
        if (typename.contains("mapping")) {
            Mapping mapping = new Mapping();

            String fromtypename = typename.substring(typename.indexOf("(") + 1, typename.indexOf("=>")).trim();
            String totypename = typename.substring(typename.indexOf("=>")+2, typename.lastIndexOf(")")).trim();

            Type keytype = findType(fromtypename);
            Type valuetype = findType(totypename);

            mapping.name = typename;
            mapping.keytype = keytype;
            mapping.valuetype = valuetype;

            t = mapping;

        } else {
            if (typename.contains("[") && typename.contains("]")) {
                Array a = new Array();
                Type elemtype = findType(typename.substring(0, typename.indexOf("[")));
                a.elemType = elemtype;
                String size = typename.substring(typename.indexOf("[") + 1, typename.indexOf("]")).trim();
                if (size.length() != 0) {
                    a.length = Integer.parseInt(size);
                }
                return elemtype;

            } else {
                //Type t = new Type();
                t.name = typename;
                types.put(typename,t);
            }
        }
        return t;
    }

    @Override
    public Object visitStructDefinition(SolidityParser.StructDefinitionContext ctx) {
        Struct t = new Struct();
        t.name = ctx.identifier().getText();
        List<Field> tmp = new ArrayList<>();
        for (SolidityParser.VariableDeclarationContext vdecl : ctx.variableDeclaration()) {
            Field f = new Field();
            f.type = findType(vdecl.typeName().getText());
            f.name = vdecl.identifier().getText();
            f.pos = "null";
            tmp.add(f);
        }
        structs.put(t.name,tmp);
        types.put(t.name, t);
        return super.visitStructDefinition(ctx);
    }



    @Override
    public Object visitStateVariableDeclaration(SolidityParser.StateVariableDeclarationContext ctx) {
        String typename = ctx.typeName().getText();
        Type t = findType(typename);
        Field f = new Field();
        f.name = ctx.identifier().getText();
        f.type = t;

        f.pos = posLocation(typename);
        //System.out.println("fields: " + f.type + " ouput " +f.name);
        curr.fields.add(f);

        return super.visitStateVariableDeclaration(ctx);
    }

    private String posLocation(String typename){
        String tmp = Integer.toString(i);
        StringBuffer res = new StringBuffer(tmp);
        if(typename.contains("[") && typename.contains("]")){
            String size = typename.substring(typename.indexOf("[") + 1, typename.indexOf("]")).trim();
            if (size.length() != 0) {
                if(structs.containsKey(typename)){
                    int counts = structs.get(typename).size()-1;
                    i += counts * Integer.parseInt(size);
                    res.append("-" + i);
                }
                else {
                    i += Integer.parseInt(size);
                    res.append('-');
                }
                i--;
            }
        }
        else{
            if(structs.containsKey(typename)){
                i += structs.get(typename).size()-1;
                res.append("-" + i);
                i--;
            }
        }
        i++;
        return res.toString();
    }

    @Override
    public Object visitFunctionDefinition(SolidityParser.FunctionDefinitionContext ctx) {
        Function f = new Function();
        if (ctx.identifier() != null) {
            f.name = ctx.identifier().getText();
        }else{
            f.name = "_callback_";
        }
        for (SolidityParser.ParameterContext pc : ctx.parameterList().parameter()) {
            Parameter p = new Parameter();
            p.type = findType(pc.typeName().getText());
            p.name = pc.identifier().getText();
            f.args.add(p);
        }

        if (ctx.returnParameters() != null) {
            for (SolidityParser.ParameterContext pc : ctx.returnParameters().parameterList().parameter()) {
                Parameter p = new Parameter();
                p.type = findType(pc.typeName().getText());
                if (pc.identifier() != null) {
                    p.name = pc.identifier().getText();
                }
                f.returns.add(p);
            }
        }


        if (ctx.modifierList().PublicKeyword().size() > 0) {
            f.modifiers.add(Modifier.PUBLIC);
        }

        if (ctx.modifierList().PrivateKeyword().size() > 0) {
            f.modifiers.add(Modifier.PRIVATE);
        }
        if (ctx.modifierList().ExternalKeyword().size() > 0) {
            f.modifiers.add(Modifier.EXTERNAL);
        }
        if (ctx.modifierList().InternalKeyword().size() > 0) {
            f.modifiers.add(Modifier.INTERNAL);
        }
        for (SolidityParser.StateMutabilityContext sm : ctx.modifierList().stateMutability()) {
            switch (sm.getText()) {
                case "view":
                    f.modifiers.add(Modifier.VIEW);
                    break;
                case "payable":
                    f.modifiers.add(Modifier.PAYABLE);
                    break;
                case "constant":
                    f.modifiers.add(Modifier.CONSTANT);
                    break;
                case "pure":
                    f.modifiers.add(Modifier.PURE);
                    break;
            }
        }


        curr.functions.add(f);
        return super.visitFunctionDefinition(ctx);
    }
}