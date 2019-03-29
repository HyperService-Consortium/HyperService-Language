package edu.cwru.rise.hslang;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;

import edu.cwru.rise.hslang.parser.HSlangBaseVisitor;
import edu.cwru.rise.hslang.parser.HSlangParser;
import edu.cwru.rise.solidity.SolidityTypeAnalyzer;
import edu.cwru.rise.solidity.SolidityVisitor;


public class OpIntentVisitor extends HSlangBaseVisitor<String> {
    SolidityTypeAnalyzer tmp = new SolidityTypeAnalyzer();
    HashMap<String, Contract> impContracts = new HashMap<>();
    HashMap<String,HashMap<String, Type>> contTypes = new HashMap<>();


    HashMap<String, HashMap<String,String>> chainAccount = new HashMap<>(); // chainID / id address
    HashMap<String, String> defiVar = new HashMap<>();  //id chainID
    HashMap<String, Contract> defiContracts = new HashMap<>(); // id / contract
    HashMap<String, String> defiVrAddr = new HashMap<>(); // id / address

    public String output = "[\n";
    public String res = "\"dependencies\":[";

    @Override
    public String visitPaymentSpec(HSlangParser.PaymentSpecContext ctx) {
        String opName = ctx.opname.getText();
        String src = ctx.fromacct.getText();
        String src_domain = defiVar.get(src) + " " + src;
        String dsg = ctx.toacct.getText();
        String dst_domain = defiVar.get(dsg) + " " + dsg;
        String amount = ctx.amt.getText();
        String unit = ctx.unit.getText().replace("\"","");
        Payment opPay = new Payment(opName,src_domain,src,dst_domain,dsg,amount,unit);

        output += opPay.toJson() + ",\n";
        //System.out.println(opPay.toJson());
        return super.visitPaymentSpec(ctx);
    }

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
        Function res = new Function();
        for(Function f : funcs){  // find whether the function is defined in the contract
                                 // if the function exist, set the flag as false
            if(f.name.equals(funcName)){
                flag = false;
                res = f;
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
        String name = ctx.opname.getText();
        String invoker = ctx.acct.getText();  // account id
        String contract_code = ctx.recv.getText();
        String contract_domain = defiVar.get(contract_code);  // chainID
        String contract_addr = defiVrAddr.get(contract_code).replace("\"","");
        //String func = ctx.method.getText();  funcName
        List<Parameter> parameters = res.args;
        String[] args = ctx.args.getText().split(",");
        List<Inputs> in = new ArrayList<>();
        try{
            if(parameters.size() != args.length){
                throw new Exception("Invaid inputs");
            }
        }catch (Exception e) {
            System.err.println("function exception: " + e);
            e.printStackTrace();
        }
        for(int i = 0; i < args.length; i++){
            String tmpArg = args[i].replace("\"","");
            String requireType = parameters.get(i).type.toString();
            try{
                if(!requireType.equals(Typecheck(tmpArg))){
                    throw new Exception("find: " +tmpArg+ "Wrong Input Type, needs: " +requireType );
                }
            }catch (Exception e) {
                System.err.println("function exception: " + e);
                e.printStackTrace();
            }
            Type t = new Type();
            t.name = tmpArg;
            Inputs arg = new Inputs(Typecheck(tmpArg),tmpArg);
            in.add(arg);
        }

        ContractInvocation conIn = new ContractInvocation(name, invoker,contract_domain,contract_addr,contract_code,funcName, in);
        output += conIn.toJson() + ",\n";
        //System.out.print(output);
        return super.visitContractInvocationSpec(ctx);
    }

    private String Typecheck(String input){         // may need to add more pattern
        Pattern uint = Pattern.compile("[0-9]*(\\.?)[0-9]*");


        if(uint.matcher(input).matches()){
            return "uint";
        }

        if(input.equals("address")){
            return "addresspayable";
        }

        if(input.equals("true") || input.equals("false")){
            return "boolean";
        }

        return "String";
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
        defiVar.put(contractName,ctx.chain.getText());
        defiVrAddr.put(contractName, ctx.contractAddr().address.getText());

        return super.visitContractSpc(ctx);
    }

    @Override
    public String visitAccountSpc(HSlangParser.AccountSpcContext ctx) {
        String chainId = ctx.chain.getText(); //get chain id
        String id = ctx.id.getText();
        String addr = ctx.address.getText();
        HashMap<String,String> tmp = chainAccount.getOrDefault(chainId,new HashMap<String, String>());
        try {
            if(tmp.get(id)!= null){
                throw new Exception("the account name is already taken");
            }
            if(tmp.containsValue(addr)){
                throw new Exception("the address is already taken");
            }
            tmp.put(id,addr);
            defiVar.put(id,chainId);
        }catch (Exception e) {
            System.err.println(e);
            e.printStackTrace();
        }
        defiVrAddr.put(id, addr);
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

    @Override
    public String visitDepSpec(HSlangParser.DepSpecContext ctx) {
        String left = ctx.left.getText();
        String right = ctx.right.getText();
        String dep = ctx.dep.getText();
        dependencies deps = new dependencies(left,right,dep);

        res += deps.toJson() + "]";
        //System.out.print(res);
        return super.visitDepSpec(ctx);
    }
}
