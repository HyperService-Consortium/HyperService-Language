package edu.cwru.rise.hslang;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;

import edu.cwru.rise.golang.GoParser;
import edu.cwru.rise.golang.GoVistor;
import edu.cwru.rise.hslang.parser.HSlangBaseVisitor;
import edu.cwru.rise.hslang.parser.HSlangParser;
import edu.cwru.rise.solidity.SolidityTypeAnalyzer;
import edu.cwru.rise.solidity.SolidityVisitor;
import edu.cwru.rise.vyper.VPParser;
import edu.cwru.rise.vyper.VPVistor;


public class OpIntentVisitor extends HSlangBaseVisitor<String> {
    SolidityTypeAnalyzer solidityParser = new SolidityTypeAnalyzer();
    VPParser vyperParser = new VPParser();
    GoParser goParser = new GoParser();
    HashMap<String, Contract> contracts = new HashMap<>();
    HashMap<String, Type> contTypes = new HashMap<>();

    HashMap<String, HashMap<String,String>> chainAccount = new HashMap<>(); // chainID / id address
    HashMap<String, String> defiVar = new HashMap<>();  //id chainID
    HashMap<String, String> defiVrAddr = new HashMap<>(); // id / address
    HashSet<String> opSet = new HashSet<>(); // store operation

    public StringBuffer output = new StringBuffer("[\n");
    public StringBuffer res = new StringBuffer("\"dependencies\":[");
    public int numOp = 0;
    HashMap<String, Integer> setNum = new HashMap<>();
    HashMap<Integer, List<Integer>> adjList = new HashMap<>();
    int[] inDegree = new int[1];
    HashSet<String> visted = new HashSet<>();


    @Override
    public String visitPaymentSpec(HSlangParser.PaymentSpecContext ctx) {
        String opName = ctx.opname.getText();
        try {
            Sources src = new Sources();
            Sources dst = new Sources();
            String srctmp = ctx.fromacct.getText();
            src.user_name = srctmp;
            String dstmp = ctx.toacct.getText();
            dst.user_name = dstmp;
            if(defiVar.get(src.user_name) == null){
                throw new HSLParsingException("src " + srctmp + " is not defined");
            }
            if(defiVar.get(dstmp)== null){
                throw new HSLParsingException("dst " + dstmp + " is not defined");
            }
            src.domain = defiVar.get(srctmp);


            dst.domain = defiVar.get(dstmp);
            String amount = ctx.amt.getText();
            String unit = ctx.unit.getText().replace("\"", "");
            Payment opPay = new Payment(opName,src,dst, amount, unit);

            output.append(opPay.toJson());
            output.append(",\n");

            setNum.put(opName,numOp++);
            inDegree = new int[numOp];
            opCheck(opName);

        }catch (Exception e) {
            System.err.println("Payment exception: " + e);
            e.printStackTrace();
            return super.visitPaymentSpec(ctx);
        }
        return super.visitPaymentSpec(ctx);
    }

    @Override
    public String visitContractInvocationSpec(HSlangParser.ContractInvocationSpecContext ctx){
        String opName = ctx.opname.getText();
        try {
            String invoker = ctx.acct.getText();  // account id

            if (defiVrAddr.get(invoker) == null) {
                throw new HSLParsingException(invoker + " is not exist");
            }

            String contractName = ctx.recv.getText();
            Contract tmp = contracts.get(contractName);

            if (tmp == null) {
                throw new HSLParsingException("the contract " + contractName + " is not defined");
            }

            List<Function> funcs = tmp.getFunctions();
            boolean flag = true;
            String funcName = ctx.method.getText();
            Function res = new Function();
            for (Function f : funcs) {  // find whether the function is defined in the contract
                // if the function exist, set the flag as false
                if (f.name.equals(funcName)) {
                    flag = false;
                    res = f;
                    break;
                }
            }

            if (flag) {
                throw new HSLParsingException("the function " + funcName + " is not defined in the " + contractName + " contract");
            }

            String name = ctx.opname.getText();
            String contract_code = ctx.recv.getText();
            String contract_domain = defiVar.get(contract_code);  // chainID
            String contract_addr = defiVrAddr.get(contract_code).replace("\"", "");

            List<Inputs> in = new ArrayList<>();
            if (res.args.isEmpty()) {
                if (ctx.args != null) {
                    throw new HSLParsingException("Invaid inputs");
                }
                opCheck(opName);
                ContractInvocation conIn = new ContractInvocation(name, invoker, contract_domain, contract_addr, funcName, in);
                output.append(conIn.toJson());
                output.append(",\n");
                setNum.put(opName, numOp++);
                inDegree = new int[numOp];
            } else {
                List<Parameter> parameters = res.args;
                String[] args = ctx.args.getText().split(",");
                if (parameters.size() != args.length) {
                    throw new HSLParsingException("Invaid inputs");
                }

                for (int i = 0; i < args.length; i++) {

                    String tmpArg = args[i];
                    String requireType = parameters.get(i).type.name;
                    Value value = new Value();
                    String typeRes = Typecheck(tmpArg, value);
                    if (typeRes == null) {
                        throw new HSLParsingException("Operation " + name + " have wrong function inputs");
                    }
                    if (!requireType.equals(typeRes)) {
                        throw new HSLParsingException("find: " + tmpArg + ", Wrong Input Type, needs: " + requireType);
                    }
                    Inputs arg = new Inputs(typeRes, value);
                    in.add(arg);
                }
                opCheck(opName);
                ContractInvocation conIn = new ContractInvocation(name, invoker, contract_domain, contract_addr, funcName, in);
                output.append(conIn.toJson());
                output.append(",\n");
                setNum.put(opName, numOp++);
                inDegree = new int[numOp];

            }
        }catch (Exception e) {
                System.err.println("ContractInvocation exception: " + e);
                e.printStackTrace();
                return super.visitContractInvocationSpec(ctx);
        }

        return super.visitContractInvocationSpec(ctx);
    }


    private String Typecheck(String input, Value value){         // may need to add more pattern

        Pattern uintType = Pattern.compile("[0-9]*(\\.?)[0-9]*");

        if (uintType.matcher(input).matches()) {
            value.constant = input;
            return "uint";
        }

        if(input.contains(".")) {
            String[] tmp = input.split("\\.");
            Contract contract = contracts.get(tmp[0]);
            if(contract == null){
                return null;
            }
            for(Field t : contract.fields){
                if(t.name.equals(tmp[1])){
                    value.contract = tmp[0];
                    value.field = tmp[1];
                    value.pos = String.valueOf(t.pos);
                    return t.type.name;
                }
            }
            return null;
        }

        if(input.equals("true") || input.equals("false")){
            value.constant = input;
            return "boolean";
        }

        return null;
    }

    @Override
    public String visitContractSpc(HSlangParser.ContractSpcContext ctx) {
        String tmp = ctx.contractAddr().contract.getText();
        try {
            if (!contracts.containsKey(tmp)) {  // whether the contract is been import
                throw new HSLParsingException("the contract " + tmp + " is not imported");
            }

            Contract newContra = (Contract) contracts.get(tmp).clone(); // shallow copy
            String contractName = ctx.id.getText();
            newContra.name = contractName;

            if (contracts.get(contractName) == null) {  // whether the variable name is been used
                contracts.put(contractName, newContra);
            } else {
                throw new HSLParsingException("the contract's name \"" + contractName + "\" is used");
            }

            defiVar.put(contractName, ctx.chain.getText());
            defiVrAddr.put(contractName, ctx.contractAddr().address.getText());
        }catch (Exception e) {
            System.err.println("Contract exception: " + e);
            e.printStackTrace();
        }

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
        long start = System.currentTimeMillis();
        String contractName = ctx.importSpec().getText(); //get import contract name
        //System.out.print(contractName);
        contractName = contractName.replace("\"",""); // remove the " "

        if(contractName.contains(".sol")) {
            SolidityVisitor visitor = solidityParser.sol(contractName); // invoke solidity parse to parse the contract file

            contracts.putAll(visitor.contracts);
            contTypes.putAll(visitor.types);
        }
        if(contractName.contains(".vy")) {
            VPVistor visitor = vyperParser.vy(contractName);
            //tmp = System.currentTimeMillis();
            contracts.putAll(visitor.contracts);
            contTypes.putAll(visitor.types);
        }
        if(contractName.contains(".go")){
            GoVistor vistor = goParser.go(contractName);
            //tmp = System.currentTimeMillis();
            contracts.putAll(vistor.contracts);
            contTypes.putAll(vistor.types);
        }
        long tmp = System.currentTimeMillis();
        long lexerTime = tmp-start;
        System.out.println("import " + contractName + " costs: " + lexerTime);
        return super.visitImportDecl(ctx);
    }

    @Override
    public String visitDepSpec(HSlangParser.DepSpecContext ctx) {
        String left = ctx.left.getText();
        String right = ctx.right.getText();
        String rights[] = ctx.right.getText().split(",");
        String dep = ctx.dep.getText();

        try {
            if(!dep.equals("before") && !dep.equals("after")){
                throw new HSLParsingException("Wrong dependencies");
            }

            if (!opSet.contains(left)) {
                throw new HSLParsingException(left + " is not exist");
            }
            visted.add(left);
            int preNode = setNum.get(left);
            for(String r : rights) {
                if(r.equals(left)){
                    throw new HSLParsingException("Operation " + r + " cannot point to itself");
                }

                if (!opSet.contains(r)) {
                    throw new HSLParsingException(r + " is not exist");
                }
                visted.add(r);
                int node = setNum.get(r);
                if(dep.equals("before")) {
                    if(adjList.containsKey(preNode)) {
                        List<Integer> edges = adjList.get(preNode);
                        if(edges.contains(node)){
                            throw new HSLParsingException("Duplicate dependencies");
                        }
                    }
                    adjList.computeIfAbsent(preNode, k -> new LinkedList<>()).add(node);
                    inDegree[node]++;
                }
                else{
                    if(adjList.containsKey(node)) {
                        List<Integer> edges = adjList.get(node);
                        if(edges.contains(preNode)){
                            throw new HSLParsingException("Duplicate dependencies");
                        }
                    }
                    adjList.computeIfAbsent(node, k -> new LinkedList<>()).add(preNode);
                    inDegree[preNode]++;
                }


            }
            int[] tmp = inDegree.clone();
           // boolean flg = checklop(tmp);
            if(!checklop(tmp)){
                throw new HSLParsingException("Wrong dependencies");
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

    private void opCheck(String opName) throws HSLParsingException{

        if(!opSet.add(opName)) {
            throw new HSLParsingException(opName + " is been used");
        }
    }

    private boolean checklop(int[] tmps){
        int count = 0;
        int zeroDegree = -1;
        for(int i = 0; i < numOp; i++){
            // Keep track the last inDegree == 0's place
            if(tmps[i] == 0){
                tmps[i] = zeroDegree;
                zeroDegree = i;
            }
        }

        while(zeroDegree != -1){
            int tmp = zeroDegree;
            count++;
            zeroDegree = tmps[tmp];
            List<Integer> preCourse = adjList.get(tmp);
            if(preCourse == null){
                continue;
            }
            for(int j : preCourse){
                tmps[j]--;
                if(tmps[j]==0){
                    tmps[j] = zeroDegree;
                    zeroDegree = j;
                }
            }
        }
        return (count == numOp);
    }
}
