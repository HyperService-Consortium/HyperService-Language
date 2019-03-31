package edu.cwru.rise.hslang;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Pattern;

import edu.cwru.rise.hslang.parser.HSlangBaseVisitor;
import edu.cwru.rise.hslang.parser.HSlangParser;
import edu.cwru.rise.solidity.SolidityTypeAnalyzer;
import edu.cwru.rise.solidity.SolidityVisitor;


public class OpIntentVisitor extends HSlangBaseVisitor<String> {
    SolidityTypeAnalyzer tmp = new SolidityTypeAnalyzer();
    HashMap<String, Contract> contracts = new HashMap<>();
    HashMap<String, Type> contTypes = new HashMap<>();

    HashMap<String, HashMap<String,String>> chainAccount = new HashMap<>(); // chainID / id address
    HashMap<String, String> defiVar = new HashMap<>();  //id chainID
    HashMap<String, String> defiVrAddr = new HashMap<>(); // id / address
    HashSet<String> opSet = new HashSet<>(); // store operation

    public StringBuffer output = new StringBuffer("[\n");
    public StringBuffer res = new StringBuffer("\"dependencies\":[");

    @Override
    public String visitPaymentSpec(HSlangParser.PaymentSpecContext ctx) {
        String opName = ctx.opname.getText();
        opCheck(opName);
        try {
            String src = ctx.fromacct.getText();
            String dsg = ctx.toacct.getText();
            if(defiVar.get(src) == null){
                throw new HSLParsingException("src " + src + " is not defined");
            }
            if(defiVar.get(dsg)== null){
                throw new HSLParsingException("dsg " + dsg + " is not defined");
            }
            String src_domain = defiVar.get(src);


            String dst_domain = defiVar.get(dsg);
            String amount = ctx.amt.getText();
            String unit = ctx.unit.getText().replace("\"", "");
            Payment opPay = new Payment(opName, src_domain, src, dst_domain, dsg, amount, unit);

            output.append(opPay.toJson());
            output.append(",\n");
        }catch (Exception e) {
            System.err.println("Payment exception: " + e);
            e.printStackTrace();
        }
        return super.visitPaymentSpec(ctx);
    }

    @Override
    public String visitContractInvocationSpec(HSlangParser.ContractInvocationSpecContext ctx){
        String opName = ctx.opname.getText();
        opCheck(opName);
        String invoker = ctx.acct.getText();  // account id
        try{
            if(defiVrAddr.get(invoker) == null){
                throw new HSLParsingException(invoker + " is not exist");
            }

        }catch (Exception e) {
            System.err.println("function exception: " + e);
            e.printStackTrace();
        }
        String contractName = ctx.recv.getText();
        Contract tmp = contracts.get(contractName);

        try{
            if(tmp == null){
                throw new HSLParsingException("the contract " + contractName + " is not defined");
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
                throw new HSLParsingException("the function " + funcName + " is not defined in the " + contractName+ " contract");
            }
        }catch (Exception e) {
            System.err.println("function exception: " + e);
            e.printStackTrace();
        }

        String name = ctx.opname.getText();
        String contract_code = ctx.recv.getText();
        String contract_domain = defiVar.get(contract_code);  // chainID
        String contract_addr = defiVrAddr.get(contract_code).replace("\"","");

        List<Inputs> in = new ArrayList<>();
        if(res.args.isEmpty()){
            try {
                if (ctx.args != null) {
                    throw new HSLParsingException("Invaid inputs");
                }
            } catch (Exception e) {
                System.err.println("function exception: " + e);
                e.printStackTrace();
            }
            ContractInvocation conIn = new ContractInvocation(name, invoker,contract_domain,contract_addr,contract_code,funcName, in);
            output.append(conIn.toJson());
            output.append(",\n");
        }
        else {
            List<Parameter> parameters = res.args;
            String[] args = ctx.args.getText().split(",");
            try {
                if (parameters.size() != args.length) {
                    throw new HSLParsingException("Invaid inputs");
                }
            } catch (Exception e) {
                System.err.println("function exception: " + e);
                e.printStackTrace();
            }
            for (int i = 0; i < args.length; i++) {

                String tmpArg = args[i];
                String requireType = parameters.get(i).type.name;

                List<String> typeRes = Typecheck(tmpArg);

                try {
                    if (typeRes == null) {
                        throw new HSLParsingException("Operation " + name + " have wrong function inputs");
                    }
                    if (!requireType.equals(typeRes.get(0))) {
                        throw new HSLParsingException("find: " + tmpArg + ", Wrong Input Type, needs: " + requireType);
                    }
                    Inputs arg = new Inputs(typeRes.get(0), typeRes.get(1));
                    in.add(arg);
                } catch (Exception e) {
                    System.err.println("function exception: " + e);
                    e.printStackTrace();
                }
            }
            ContractInvocation conIn = new ContractInvocation(name, invoker,contract_domain,contract_addr,contract_code,funcName, in);
            output.append(conIn.toJson());
            output.append(",\n");
        }


        return super.visitContractInvocationSpec(ctx);
    }


    private List<String> Typecheck(String input){         // may need to add more pattern
        List<String> res = new ArrayList<>();
        StringBuffer value = new StringBuffer("{ ");
        Pattern uintType = Pattern.compile("[0-9]*(\\.?)[0-9]*");

        if (uintType.matcher(input).matches()) {
            res.add("uint");
            value.append("uint: " + input + " }");
            res.add(value.toString());
            return res;
        }

        if(input.contains(".")) {
            String[] tmp = input.split("\\.");
            Contract contract = contracts.get(tmp[0]);
            if(contract == null){
                return null;
            }
            Field field = new Field();
            for(Field t : contract.fields){
                if(t.name.equals(tmp[1])){
                    res.add(t.type.name);
                    value.append("contract: " + tmp[0] + ", field: " + tmp[1] + ", pos: " + t.pos + " }");
                    res.add(value.toString());
                    return res;
                }
            }
            return null;
        }

        if(input.equals("true") || input.equals("false")){
            res.add("boolean");
            value.append("boolean: " + input + " }");
            res.add(value.toString());
            return res;
        }

        return null;
    }

    @Override
    public String visitContractSpc(HSlangParser.ContractSpcContext ctx) {
        String tmp = ctx.contractAddr().contract.getText();
        try{
            if(!contracts.containsKey(tmp)){  // whether the contract is been import
                throw new HSLParsingException("the contract " + tmp + " is not imported");
            }
        }catch (Exception e) {
            System.err.println("contract exception: " + e);
            e.printStackTrace();
        }

        Contract newContra = (Contract)contracts.get(tmp).clone(); // shallow copy
        String contractName = ctx.id.getText();
        newContra.name = contractName;

        try {
            if (contracts.get(contractName) == null) {  // whether the variable name is been used
                contracts.put(contractName, newContra);
            }
            else{
                throw new HSLParsingException("the contract's name \"" + contractName + "\" is used");
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
            if(defiVar.get(id)!= null){
                throw new HSLParsingException("the account name " + id  +" is already taken");
            }
            if(tmp.containsValue(addr)){
                throw new HSLParsingException("the address is already taken");
            }
            tmp.put(id,addr);
            defiVar.put(id,chainId);
            defiVrAddr.put(id, addr);
        }catch (Exception e) {
            System.err.println(e);
            e.printStackTrace();
        }
        return super.visitAccountSpc(ctx);
    }

    @Override
    public String visitImportDecl(HSlangParser.ImportDeclContext ctx) {
        String contractName = ctx.importSpec().getText(); //get import contract name
        contractName = contractName.replace("\"",""); // remove the " "
        SolidityVisitor visitor = tmp.sol(contractName); // invoke solidity parse to parse the contract file
        contracts = visitor.contracts;
        contTypes = visitor.types;
        return super.visitImportDecl(ctx);
    }

    @Override
    public String visitDepSpec(HSlangParser.DepSpecContext ctx) {
        String left = ctx.left.getText();
        String right = ctx.right.getText();
        String rights[] = ctx.right.getText().split(",");
        String dep = ctx.dep.getText();

        try {
            if (!opSet.contains(left)) {
                throw new HSLParsingException(left + " is not exist");
            }
            for(String r : rights)
            if (!opSet.contains(r)) {
                throw new HSLParsingException(r + " is not exist");
            }

            Dependencies deps = new Dependencies(left,right,dep);

            res.append(deps.toJson());
            res.append(",\n");
        }catch (Exception e) {
            System.err.println("operation exception: " + e);
            e.printStackTrace();
        }
        return super.visitDepSpec(ctx);
    }

    private void opCheck(String opName){
        try{
            if(!opSet.add(opName)) {
                throw new HSLParsingException(opName + " is been used");
            }
        }catch (Exception e) {
            System.err.println("function exception: " + e);
            e.printStackTrace();
        }
    }
}
