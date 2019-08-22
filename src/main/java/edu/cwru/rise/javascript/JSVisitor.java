package edu.cwru.rise.javascript;

import java.util.HashMap;


import edu.cwru.rise.hslang.structure.*;
import edu.cwru.rise.javascript.parser.JavaScriptParser;
import edu.cwru.rise.javascript.parser.JavaScriptParserBaseVisitor;
import edu.cwru.rise.javascript.parser.JavaScriptParser.*;

public class JSVisitor extends JavaScriptParserBaseVisitor {
    public HashMap<String, Type> types = new HashMap<>();
    public HashMap<String, Contract> contracts = new HashMap<>();
    Contract curr;

    @Override
    public Object visitContractDefinition(JavaScriptParser.ContractDefinitionContext ctx) {
        Contract contract = new Contract();
        contract.name =ctx.Identifier().getText();
        curr = contract;
        System.out.println("contract name: " + contract.name);
        contracts.put(contract.name, contract);
        return super.visitContractDefinition(ctx);
    }

    @Override
    public Object visitVarFunDefinition(JavaScriptParser.VarFunDefinitionContext ctx) {
       // String name = ctx.funName.getText();
        return super.visitVarFunDefinition(ctx);
    }

    @Override
    public Object visitVarFunPrototype(JavaScriptParser.VarFunPrototypeContext ctx) {
        String name = ctx.Identifier().getText();


        for(FunctionContext func :ctx.prototypeBody().functionList().function()){
            String funName = func.Identifier().getText();
            Function function = new Function();
            function.name = funName;
            System.out.println("function name: " +  function.name);
            if(func.formalParameterList()!=null) {
                for (FormalParameterArgContext pc : func.formalParameterList().formalParameterArg()) {
                    Parameter p = new Parameter();
                    p.name = pc.getText();
                    System.out.println("arg: " + p.name);
                }
            }
        }

        return super.visitVarFunPrototype(ctx);
    }

    @Override
    public Object visitVariableDeclaration(JavaScriptParser.VariableDeclarationContext ctx) {
        return super.visitVariableDeclaration(ctx);
    }
}
