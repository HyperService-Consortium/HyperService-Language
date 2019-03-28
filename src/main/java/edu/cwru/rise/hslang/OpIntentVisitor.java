package edu.cwru.rise.hslang;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import edu.cwru.rise.hslang.parser.HSlangBaseVisitor;
import edu.cwru.rise.hslang.parser.HSlangParser;
import edu.cwru.rise.solidity.SolidityTypeAnalyzer;
import edu.cwru.rise.solidity.SolidityVisitor;


public class OpIntentVisitor extends HSlangBaseVisitor<String> {
    SolidityTypeAnalyzer tmp = new SolidityTypeAnalyzer();
    HashMap<String, Contract> impContracts = new HashMap<>();
    HashMap<String,HashMap<String, Type>> contTypes = new HashMap<>();
    HashMap<String, HashSet<String>> chainAccount = new HashMap<>();
    HashMap<String, Contract> defiContracts = new HashMap<>();


    @Override
    public String visitContractInvocationSpec(HSlangParser.ContractInvocationSpecContext ctx) {
        String contractName = ctx.recv.getText();
        Contract tmp = defiContracts.get(contractName);
        try{
            if(tmp == null){
                throw new Exception("the contract" + contractName + "is not defined");
            }
        }catch (Exception e) {
            System.err.println("contract exception: " + e);
            e.printStackTrace();
        }
        assert tmp != null;
        List<Function> funcs = tmp.getFunctions();
        boolean flag = true;
        String funcName = ctx.method.getText();
        for(Function f : funcs){  // find whether the function is defined in the contract
                                 // if the function exist, set the flag as false
            if(f.name.equals(funcName)){
                flag = false;
                break;
            }
        }
        try{
            if(flag){
                throw new Exception("the function" + funcName + "is not defined in the contract");
            }
        }catch (Exception e) {
            System.err.println("function exception: " + e);
            e.printStackTrace();
        }

        return super.visitContractInvocationSpec(ctx);
    }

    @Override
    public String visitContractSpc(HSlangParser.ContractSpcContext ctx) {
        String tmp = ctx.contractAddr().contract.getText();
        try{
            if(!impContracts.containsKey(tmp)){  // whether the contract is been import
                throw new Exception("the contract" + tmp + "is not imported");
            }
        }catch (Exception e) {
            System.err.println("contract exception: " + e);
            e.printStackTrace();
        }

        Contract newContra = (Contract)impContracts.get(tmp).clone(); // shallow copy
        String contractName = ctx.id.getText();
        newContra.name = contractName;
        try {
            if (defiContracts.get(contractName) == null) {  // whether the variable name is been used
                defiContracts.put(contractName, newContra);
            }
            else{
                throw new Exception("the contract's name \"" + contractName + "\" is used");
            }
        }catch (Exception e) {
            System.err.println("contract's name exception: " + e);
            e.printStackTrace();
        }

        return super.visitContractSpc(ctx);
    }

    @Override
    public String visitAccountSpc(HSlangParser.AccountSpcContext ctx) {
        String chainId = ctx.chain.getText(); //get chain id
        HashSet<String> tmp = chainAccount.getOrDefault(chainId,new HashSet<String>());
        try {
            if(!tmp.add(ctx.address.getText())){  // throw an exception when the address is already been used
                throw new Exception("the address is already taken");
            }
        }catch (Exception e) {
            System.err.println("address exception: " + e);
            e.printStackTrace();
        }
        return super.visitAccountSpc(ctx);
    }

    @Override
    public String visitImportDecl(HSlangParser.ImportDeclContext ctx) {
        String contractName = ctx.importSpec().getText(); //get import contract name
        contractName = contractName.replace("\"",""); // remove the " "
        SolidityVisitor visitor = tmp.sol(contractName); // invoke solidity parse to oarse the contract file
        Contract tmp = visitor.getContract();
        //Store contracts and contract's types
        impContracts.put(tmp.name, tmp);
        contTypes.put(tmp.name,visitor.types);
        return super.visitImportDecl(ctx);
    }



}
