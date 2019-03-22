package edu.cwru.rise.solidity;

import edu.cwru.rise.solidity.parser.SolidityBaseVisitor;
import edu.cwru.rise.solidity.parser.SolidityParser;

import java.util.*;


class Type {
    String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Type type = (Type) o;
        return Objects.equals(name, type.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return name;
    }
}

class Mapping extends Type {
    Type keytype;
    Type valuetype;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mapping mapping = (Mapping) o;
        return Objects.equals(keytype, mapping.keytype) &&
                Objects.equals(valuetype, mapping.valuetype);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), keytype, valuetype);
    }
}

class Array extends Type {
    Type elemType;
    int length;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Array array = (Array) o;
        return length == array.length &&
                Objects.equals(elemType, array.elemType);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), elemType, length);
    }
}


class Field {
    Type type;
    String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Field field = (Field) o;
        return Objects.equals(type, field.type) &&
                Objects.equals(name, field.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(type, name);
    }
}

class Parameter {
    Type type;
    String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Parameter parameter = (Parameter) o;
        return Objects.equals(type, parameter.type) &&
                Objects.equals(name, parameter.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(type, name);
    }
}

enum Modifier {
    EXTERNAL,
    PUBLIC,
    PRIVATE,
    INTERNAL,
    PAYABLE,
    PURE,
    CONSTANT,
    VIEW
}

class Function {
    List<Parameter> args = new ArrayList<>();
    List<Parameter> returns = new ArrayList<>();
    String name;
    Set<Modifier> modifiers = new HashSet<>();

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        for (Modifier m : modifiers
                ) {
            sb.append(m + ",");
        }

        sb.append(" function " + name + "(");
        for (Parameter p : args
                ) {
            sb.append(p.type + " " + p.name + ",");
        }
        sb.append(") returns (");

        for (Parameter p : returns
                ) {
            sb.append(p.type + " " + p.name + ",");
        }
        sb.append(")");
        return sb.toString();
    }
}

class Struct extends Type {
    List<Field> fields = new ArrayList<>();

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer(name + "(struct{");
        for (Field f: fields
             ) {
            sb.append(f.type + " " + f.name+",");
        }
        sb.append("})");
        return sb.toString();
    }
}

class Contract {
    String name;
    List<Field> fields = new ArrayList<>();
    List<Function> functions = new ArrayList<>();

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("Contract " + name + "{ \n");
        for (Field f : fields
                ) {
            sb.append("\t " + f.type.toString() + " " + f.name + "\n");
        }
        for (Function f : functions
                ) {
            sb.append("\t " + f.toString() + "\n");
        }
        sb.append("}");
        return sb.toString();
    }
}


public class SolidityVisitor extends SolidityBaseVisitor {

    HashMap<String, Type> types = new HashMap<>();
    HashMap<String, Contract> contracts = new HashMap<>();
    Contract curr;

    @Override
    public Object visitContractDefinition(SolidityParser.ContractDefinitionContext ctx) {
        Contract contract = new Contract();
        contract.name = ctx.identifier().getText();
        curr = contract;

        contracts.put(contract.name, contract);
        return super.visitContractDefinition(ctx);
    }

    Type findType(String typename) {
        if (types.containsKey(typename)) {
            return types.get(typename);
        }

        Type t = null;
        if (typename.contains("mapping")) {
            Mapping mapping = new Mapping();

            String fromtypename = typename.substring(typename.indexOf("(") + 1, typename.indexOf("=>")).trim();
            String totypename = typename.substring(typename.indexOf("=>"), typename.indexOf(")")).trim();

            Type keytype = findType(fromtypename);
            Type valuetype = findType(totypename);

            mapping.name = typename;
            mapping.keytype = keytype;
            mapping.valuetype = valuetype;

            t = mapping;

        } else if (typename.contains("[") && typename.contains("]")) {
            Array a = new Array();
            Type elemtype = findType(typename.substring(0, typename.indexOf("[")));
            a.elemType = elemtype;
            String size = typename.substring(typename.indexOf("["), typename.indexOf("]")).trim();
            if (size.length() != 0) {
                a.length = Integer.parseInt(size);
            }

        } else {
            t = new Type();
            t.name = typename;
        }
        return t;
    }

    @Override
    public Object visitStructDefinition(SolidityParser.StructDefinitionContext ctx) {
        Struct t = new Struct();
        t.name = ctx.identifier().getText();

        for (SolidityParser.VariableDeclarationContext vdecl : ctx.variableDeclaration()) {
            Field f = new Field();
            f.type = findType(vdecl.typeName().getText());
            f.name = vdecl.identifier().getText();
            t.fields.add(f);
        }

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
        curr.fields.add(f);

        return super.visitStateVariableDeclaration(ctx);
    }

    @Override
    public Object visitFunctionDefinition(SolidityParser.FunctionDefinitionContext ctx) {
        Function f = new Function();
        f.name = ctx.identifier().getText();
        for (SolidityParser.ParameterContext pc : ctx.parameterList().parameter()) {
            Parameter p = new Parameter();
            p.type = findType(pc.typeName().getText());
            p.name = pc.identifier().getText();
            f.args.add(p);
        }

        for (SolidityParser.ParameterContext pc : ctx.returnParameters().parameterList().parameter()) {
            Parameter p = new Parameter();
            p.type = findType(pc.typeName().getText());
            if (pc.identifier() != null) {
                p.name = pc.identifier().getText();
            }
            f.returns.add(p);
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
