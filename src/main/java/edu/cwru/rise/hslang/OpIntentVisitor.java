package edu.cwru.rise.hslang;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

import edu.cwru.rise.golang.GoOpIntentParser;
import edu.cwru.rise.golang.GoOpIntentVisitor;
import edu.cwru.rise.hslang.parser.HSlangBaseVisitor;
import edu.cwru.rise.hslang.parser.HSlangParser;
import edu.cwru.rise.hslang.structure.Contract;
import edu.cwru.rise.hslang.structure.ContractInvocation;
import edu.cwru.rise.hslang.structure.Dependencies;
import edu.cwru.rise.hslang.structure.Field;
import edu.cwru.rise.hslang.structure.Function;
import edu.cwru.rise.hslang.structure.Inputs;
import edu.cwru.rise.hslang.structure.Parameter;
import edu.cwru.rise.hslang.structure.Payment;
import edu.cwru.rise.hslang.structure.Sources;
import edu.cwru.rise.hslang.structure.Type;
import edu.cwru.rise.hslang.structure.Value;
import edu.cwru.rise.solidity.SolOpIntentParser;
import edu.cwru.rise.solidity.SolOpIntentVisitor;
import edu.cwru.rise.vyper.VPOpIntentParser;
import edu.cwru.rise.vyper.VPOpIntentVisitor;


public class OpIntentVisitor extends HSlangBaseVisitor<String> {

    private SolOpIntentParser solidityParser;
    private VPOpIntentParser vyperParser;
    private GoOpIntentParser goParser;

    private Map<String, Contract> contracts; //Store imported contracts
    private Map<String, Type> contTypes;//Store Type
    private Map<String, HashMap<String,String>> chainAccount;// chainId / name & address
    private Map<String, String> defiVar, defiVrAddr; //defiVar: name/ chainID; defiVrAddr: name / address
    private Map<Integer, List<Integer>> adjList;// dependencies
    private int[] inDegree;
    public Map<String, Integer> setNum; // name / order
    public Set<String> opSet, visited;// opSet:store operations
    public StringBuffer output, res;
    public int numOp;


    public OpIntentVisitor(){
        this.solidityParser = new SolOpIntentParser();
        this.vyperParser = new VPOpIntentParser();
        this.goParser = new GoOpIntentParser();
        this.contracts = new HashMap<>();
        this.contTypes = new HashMap<>();

        this.chainAccount = new HashMap<>();
        this.defiVar = new HashMap<>();
        this.defiVrAddr = new HashMap<>();
        this.opSet = new HashSet<>();

        this.output = new StringBuffer("[\n");
        this.res = new StringBuffer("\"dependencies\":[");
        this.numOp = 0;
        this.setNum = new HashMap<>();
        this.adjList = new HashMap<>();
        this.inDegree = new int[1];
        this.visited = new HashSet<>();
    }


    /**
     * Get import contract information
     * @param ctx import statment
     * @return string
     */
    @Override
    public String visitImportDecl(HSlangParser.ImportDeclContext ctx) {
        //long start = System.currentTimeMillis();
        String contractName = ctx.importSpec().getText(); //get import contract name
        //System.out.print(contractName);
        contractName = contractName.replace("\"",""); // remove the " "

        if(contractName.contains(".sol")) {
            SolOpIntentVisitor visitor = solidityParser.sol(contractName); // invoke solidity parse to parse the contract file

            contracts.putAll(visitor.contracts);
            contTypes.putAll(visitor.types);
        }
        if(contractName.contains(".vy")) {
            VPOpIntentVisitor visitor = vyperParser.vy(contractName);
            //tmp = System.currentTimeMillis();
            contracts.putAll(visitor.contracts);
            contTypes.putAll(visitor.types);
        }
        if(contractName.contains(".go")){
            GoOpIntentVisitor vistor = goParser.go(contractName);
            //tmp = System.currentTimeMillis();
            contracts.putAll(vistor.contracts);
            contTypes.putAll(vistor.types);
        }
        /*
        long tmp = System.currentTimeMillis();
        long lexerTime = tmp-start;
        System.out.println("import " + contractName + " costs: " + lexerTime);
        */
        return super.visitImportDecl(ctx);
    }

    /**
     * check the contract is validation and get contract information
     * @param ctx Contract statement
     * @return string
     */
    @Override
    public String visitContractSpc(HSlangParser.ContractSpcContext ctx) {
        String addr = ctx.contractAddr().contract.getText();
        try {
            if (!contracts.containsKey(addr)) {  // whether the contract is been import
                throw new HSLParsingException("the contract " + addr + " is not imported");
            }

            Contract newContra = (Contract) contracts.get(addr).clone(); // shallow copy
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

    /**
     * check whether payment statement is correct defined and convert it into json string
     * @param ctx payment statement
     * @return string
     */
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
            // source account is not exist
            if(defiVar.get(src.user_name) == null){
                throw new HSLParsingException("src " + srctmp + " is not defined");
            }
            // receiver account is not exist
            if(defiVar.get(dstmp)== null){
                throw new HSLParsingException("dst " + dstmp + " is not defined");
            }
            src.domain = defiVar.get(srctmp);
            dst.domain = defiVar.get(dstmp);

            String amount = ctx.amt.getText();
            String unit = ctx.unit.getText().replace("\"","");
            String newuint = ctx.newuint.getText().replace("\"","");
            StringBuffer rati = new StringBuffer();
            rati.append(ctx.amtuint.getText() + " ");
            rati.append(unit + " as " + newuint);
            Payment opPay = new Payment(opName,src,dst, amount, unit, rati.toString());

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

    /**
     * check whether the contract invocation statement is correct and convert statement into json string
     * @param ctx Contract Invocation statement
     * @return String
     */
    @Override
    public String visitContractInvocationSpec(HSlangParser.ContractInvocationSpecContext ctx){
        String opName = ctx.opname.getText();
        try {
            String invoker = ctx.acct.getText();  // account id

            // account is not exist
            if (defiVrAddr.get(invoker) == null) {
                throw new HSLParsingException(invoker + " is not exist");
            }

            String contractName = ctx.recv.getText();
            Contract tmp = contracts.get(contractName);

            // contract is not exist
            if (tmp == null) {
                throw new HSLParsingException("the contract " + contractName + " is not defined");
            }

            List<Function> funcs = tmp.getFunctions();
            boolean flag = true;
            String funcName = ctx.method.getText();
            Function res = new Function();
            for (Function f : funcs) {
                // find whether the function is defined in the contract
                // if the function exist, set the flag as false
                if (f.name.equals(funcName)) {
                    flag = false;
                    res = f;
                    break;
                }
            }

            if (flag) {
                throw new HSLParsingException("the function " + funcName
                        + " is not defined in the " + contractName + " contract");
            }

            String name = ctx.opname.getText();
            String contract_code = ctx.recv.getText();

            Sources contract = new Sources();
            contract.domain = defiVar.get(contract_code);
            contract.address = defiVrAddr.get(contract_code).replace("\"", "");
            List<Inputs> in = new ArrayList<>();
            if (res.args.isEmpty()) {
                // function has none inputs
                if (ctx.args != null) {
                    throw new HSLParsingException("Invaid inputs");
                }
                opCheck(opName);
                ContractInvocation conIn = new ContractInvocation(name, invoker, contract, funcName, in);
                output.append(conIn.toJson());
                output.append(",\n");
                setNum.put(opName, numOp++);
                inDegree = new int[numOp];
            } else {
                //function has multi inputs
                List<Parameter> parameters = res.args;
                String[] args = ctx.args.getText().split(",");
                if (parameters.size() != args.length) {
                    throw new HSLParsingException("Invaid inputs");
                }

                //check the input is matching the function's requirment
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
                ContractInvocation conIn = new ContractInvocation(name, invoker, contract, funcName, in);
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

    /**
     * Baisc Type check, will return the input's type
     * @param input input statement
     * @param value input information
     * @return type
     */
    private String Typecheck(String input, Value value){
        Pattern uintType = Pattern.compile("[0-9]*(\\.?)[0-9]*");
        // input is number
        if (uintType.matcher(input).matches()) {
            value.constant = input;
            return "uint";
        }

        // input is the reference
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

        // input is boolean
        if(input.equals("true") || input.equals("false")){
            value.constant = input;
            return "boolean";
        }

        return null;
    }

    /**
     * check whether the account statement is correct and convert statement into json string
     * @param ctx account statement
     * @return String
     */
    @Override
    public String visitAccountSpc(HSlangParser.AccountSpcContext ctx) {
        String chainId = ctx.chain.getText(); //get chain id
        String id = ctx.id.getText(); // get name
        String addr = ctx.address.getText(); // get address
        HashMap<String,String> tmp = chainAccount.getOrDefault(chainId,new HashMap<String, String>());
        try {
            // account name is already taken
            if(defiVar.get(id)!= null){
                throw new HSLParsingException("the account name " + id  +" is already taken");
            }
            // account address is been used
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

    /**
     * Get dependencies and check whether it is correct
     * @param ctx dependencies statement
     * @return string
     */
    @Override
    public String visitDepSpec(HSlangParser.DepSpecContext ctx) {
        String left = ctx.left.getText();
        String right = ctx.right.getText();
        String rights[] = ctx.right.getText().split(",");
        String dep = ctx.dep.getText();

        try {
            // did not point out dependencies relation
            if(!dep.equals("before") && !dep.equals("after")){
                throw new HSLParsingException("Wrong dependencies");
            }

            if (!opSet.contains(left)) {
                throw new HSLParsingException(left + " is not exist");
            }
            visited.add(left);
            int preNode = setNum.get(left);
            for(String r : rights) {
                // loop
                if(r.equals(left)){
                    throw new HSLParsingException("Operation " + r + " cannot point to itself");
                }
                // operation is not exist
                if (!opSet.contains(r)) {
                    throw new HSLParsingException(r + " is not exist");
                }
                visited.add(r);
                int node = setNum.get(r);
                // operation a before b, add the relation to the map
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
                // operation a after b
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

    /**
     * check the operation name is vaild
     * @param opName operation name
     * @throws HSLParsingException
     */
    private void opCheck(String opName) throws HSLParsingException{

        if(!opSet.add(opName)) {
            throw new HSLParsingException(opName + " is been used");
        }
    }

    /**
     * check whether there exist the situation that a-> b, b-> a
     * @param tmps operations relation
     * @return whether there is a loop
     */
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
