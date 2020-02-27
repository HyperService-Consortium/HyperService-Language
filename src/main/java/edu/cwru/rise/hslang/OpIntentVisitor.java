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
import edu.cwru.rise.hslang.parser.HSlangParser.BlockOpSpecContext;
import edu.cwru.rise.hslang.parser.HSlangParser.BlockVarSpecContext;
import edu.cwru.rise.hslang.parser.HSlangParser.CompareUnitContext;
import edu.cwru.rise.hslang.parser.HSlangParser.ElseStatementContext;
import edu.cwru.rise.hslang.parser.HSlangParser.IfStatemntContext;
import edu.cwru.rise.hslang.parser.HSlangParser.IfcontractSpcContext;
import edu.cwru.rise.hslang.parser.HSlangParser.IfpaymentSpecContext;
import edu.cwru.rise.hslang.parser.HSlangParser.LoopSpecContext;
import edu.cwru.rise.hslang.parser.HSlangParser.REL_OPContext;
import edu.cwru.rise.hslang.structure.Contract;
import edu.cwru.rise.hslang.structure.ContractInvocation;
import edu.cwru.rise.hslang.structure.Dependencies;
import edu.cwru.rise.hslang.structure.Field;
import edu.cwru.rise.hslang.structure.Function;
import edu.cwru.rise.hslang.structure.IfCondition;
import edu.cwru.rise.hslang.structure.Inputs;
import edu.cwru.rise.hslang.structure.Maccount;
import edu.cwru.rise.hslang.structure.Mcontract;
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
    public StringBuilder contractMap = new StringBuilder(), accountMap = new StringBuilder();
    public int numOp;
    public Set<String> visitedIf = new HashSet<>();


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
            Mcontract addContract = new Mcontract(contractName, ctx.chain.getText(),ctx.contractAddr().address.getText().replaceAll("\"",""));
            contractMap.append(addContract.toJson());
            contractMap.append(",\n");
        }catch (Exception e) {
            System.err.println("Contract exception: " + e);
            e.printStackTrace();
        }
        return super.visitContractSpc(ctx);
    }

    private void contractSpec(IfcontractSpcContext ctx, Map<String, String> ifVar, Map<String, String> ifVarAddr) throws HSLParsingException{
        String addr = ctx.contractAddr().contract.getText();
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

        ifVar.put(contractName, ctx.chain.getText());
        ifVarAddr.put(contractName, ctx.contractAddr().address.getText());
        defiVrAddr.put(contractName, ctx.contractAddr().address.getText());
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
            StringBuilder amount = new StringBuilder();
            if(ctx.amt != null) {
                 amount.append(ctx.amt.getText());
            }
            else{
                amount.append(ctx.stateField().getText());
            }
            String unit = ctx.unit.getText().replace("\"","");
            StringBuffer rati = new StringBuffer();
            if(ctx.newuint != null) {
                String newuint = ctx.newuint.getText().replace("\"", "");
                rati.append(ctx.amtuint.getText() + " ");
                rati.append(unit + " as " + ctx.newamt.getText()+ " "+ newuint);
            }
            Payment opPay = new Payment(opName,src,dst, amount.toString(), unit, rati.toString());

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
    public String visitIfSpec(HSlangParser.IfSpecContext ctx){
        try {
            if(!visitedIf.contains(ctx.opname.getText())) {
                visitedIf.add(ctx.opname.getText());
                int size = ctx.ifStatemnt().ifSpec().size();
                if( size!= 0) {
                    for(int i = 0; i < size; i++) {
                        visitedIf.add(ctx.ifStatemnt().ifSpec().get(i).opname.getText());
                    }
                }
               StringBuilder res = visitif(ctx);
                output.append(res.toString());
            }
        }catch (Exception e){
            System.err.println("IfSpec exception: " + e);
            e.printStackTrace();
            return super.visitIfSpec(ctx);
        }
        return super.visitIfSpec(ctx);
    }

    private StringBuilder visitif(HSlangParser.IfSpecContext ctx) throws HSLParsingException{
        StringBuilder res = new StringBuilder();
            visitedIf.add(ctx.opname.getText());
            IfStatemntContext ifstate = ctx.ifStatemnt();
            CompareUnitContext cond1 = ifstate.condExpression().cond1;
            CompareUnitContext cond2 = ifstate.condExpression().cond2;
            if(!conditionExpression(cond1) || !conditionExpression(cond2)){
                throw new HSLParsingException("wrong condition");
            }
            REL_OPContext rel_opContext = ifstate.condExpression().compare;
            String operation = operationCompare(rel_opContext);
            res.append("{\n");
            res.append("  \"name\":\"if-op\",\n");
            res.append("  \"type\":\"IfStatement\",\n");
            res.append("  \"if\":[");
            Map<String, String> ifVar = new HashMap<>();
            Map<String, String> ifVarAddr = new HashMap<>();
            int size = ctx.ifStatemnt().ifSpec().size();
            if( size!= 0) {
                for(int i = 0; i < size; i++) {
                    StringBuilder tmp = visitif(ctx.ifStatemnt().ifSpec().get(i));
                    visitedIf.add(ctx.ifStatemnt().ifSpec().get(i).opname.getText());
                    res.append(tmp);
                }
            }
            List<BlockVarSpecContext> varList = ifstate.blockVarSpec();
            blockVarSt(varList,ifVar,ifVarAddr);
            List<BlockOpSpecContext> ifOpers = ifstate.blockOpSpec();
            blockOper(ifOpers, ifVar, ifVarAddr, res);
            res.setLength(res.length()-2);
            res.append("],\n");
            if(ctx.elseStatement().size() != 0){
                res.append("  \"else\" : [\n");
                List<ElseStatementContext> elseS = ctx.elseStatement();
                for(int k = 0; k < elseS.size(); k++) {
                    List<BlockVarSpecContext> elsevarList = ctx.elseStatement().get(k).blockVarSpec();
                    Map<String, String> elseVar = new HashMap<>();
                    Map<String, String> elseVarAddr = new HashMap<>();
                    blockVarSt(elsevarList, elseVar,elseVarAddr);
                    List<BlockOpSpecContext> elseVarList = ctx.elseStatement().get(k).blockOpSpec();
                    blockOper(elseVarList, ifVar, ifVarAddr,res);
                }
                res.setLength(res.length()-2);
                res.append("],\n");
            }
            res.append("\"condition\":");
            Value leftV = new Value();
            Value rightV = new Value();
            String leftType = Typecheck(cond1.getText(),leftV);
            String rightType =Typecheck(cond2.getText(),rightV);
            Inputs left = new Inputs(leftType, leftV);
            Inputs right = new Inputs(rightType, rightV);
            IfCondition ifcd = new IfCondition(left, right,operation);
            //Condition cd = new Condition(cond1.getText(),cond2.getText(),operation);
            res.append(ifcd.toJson().toString());
            res.append("\n},");
        return res;
    }

    @Override
    public String visitLoopSpec(LoopSpecContext ctx){
        try {
            if(!visitedIf.contains(ctx.opname.getText())){
                visitedIf.add(ctx.opname.getText());
                StringBuilder res = visitLoop(ctx);
                output.append(res.toString());
            }
        }catch (Exception e){
            System.err.println("IfSpec exception: " + e);
            e.printStackTrace();
            return super.visitLoopSpec(ctx);
        }
        return super.visitLoopSpec(ctx);
    }

    public StringBuilder visitLoop(HSlangParser.LoopSpecContext ctx) throws HSLParsingException{
        StringBuilder res = new StringBuilder();
        visitedIf.add(ctx.opname.getText());
        String loopTime = ctx.times.getText();
        res.append("\n{\n");
        res.append("  \"name\":\"loop\",\n");
        res.append("  \"type\":\"loopFunction\",\n");
        res.append("  \"loop\":[\n");
        int size = ctx.ifSpec().size();
        if( size!= 0) {
            for(int i = 0; i < size; i++) {
                StringBuilder tmp = visitif(ctx.ifSpec().get(i));

                visitedIf.add(ctx.ifSpec().get(i).opname.getText());
                res.append(tmp);
            }
        }
        Map<String, String> ifVar = new HashMap<>();
        Map<String, String> ifVarAddr = new HashMap<>();
        List<BlockVarSpecContext> varList = ctx.blockVarSpec();
        blockVarSt(varList,ifVar,ifVarAddr);
        List<BlockOpSpecContext> lists = ctx.blockOpSpec();
        blockOper(lists, ifVar, ifVarAddr, res);
        res.setLength(res.length()-2);
        res.append("],\n");
        res.append(" \"loopTime\" : " +  "\"" + loopTime + "\" ");
        res.append("\n},\n");
        return res;
    }

    private void blockVarSt(List<BlockVarSpecContext> varList, Map<String, String> ifVar, Map<String, String> ifVarAddr) throws HSLParsingException{
        for(BlockVarSpecContext var : varList){
            if(var.ifaccountSpc()!= null){
                String chainId = var.ifaccountSpc().chain.getText(); //get chain id
                String id = var.ifaccountSpc().id.getText(); // get name
                String addr = var.ifaccountSpc().address.getText(); // get address
                accountSpec(chainId, id, addr, ifVar, ifVarAddr);
            }
            else{
                contractSpec(var.ifcontractSpc(),ifVar, ifVarAddr);
            }
        }
    }

    private void blockOper(List<BlockOpSpecContext> ifOpers, Map<String, String> ifVar, Map<String, String> ifVarAddr, StringBuilder res) throws HSLParsingException{
        for(int j = 0; j < ifOpers.size(); j++){
            BlockOpSpecContext ifopSpec = ifOpers.get(j);
            if(ifopSpec.ifcontractInvocationSpec() != null){
                String opName = ifopSpec.ifcontractInvocationSpec().opname.getText();
                ContractInvocation conIn = contractInvocation(ifopSpec.ifcontractInvocationSpec(),ifVar, ifVarAddr);
                res.append(conIn.toJson());
                    res.append(",\n");

                setNum.put(opName, numOp++);
                inDegree = new int[numOp];
            }
            else{
                String opName = ifopSpec.ifpaymentSpec().opname.getText();
                Payment opPay = paymentSpec(ifopSpec.ifpaymentSpec(), ifVar);
                res.append(opPay.toJson());
                    res.append(",\n");

                setNum.put(opName,numOp++);
                inDegree = new int[numOp];
                opCheck(opName);
            }
        }
        //res.append("}");
    }

    private Payment paymentSpec(IfpaymentSpecContext ctx, Map<String, String> ifVar) throws HSLParsingException {
        Sources src = new Sources();
        Sources dst = new Sources();
        String srctmp = ctx.fromacct.getText();
        src.user_name = srctmp;
        String dstmp = ctx.toacct.getText();
        dst.user_name = dstmp;
        // source account is not exist
        if(defiVar.get(src.user_name) == null && ifVar.get(src.user_name) == null){
            throw new HSLParsingException("src " + srctmp + " is not defined");
        }
        // receiver account is not exist
        if(defiVar.get(dstmp)== null && ifVar.get(dstmp)== null){
            throw new HSLParsingException("dst " + dstmp + " is not defined");
        }
        boolean blocVar = false;
        if(defiVar.get(dstmp)== null) blocVar = true;
        if(blocVar) {
            src.domain = ifVar.get(srctmp);
            dst.domain = ifVar.get(dstmp);
        }
        else{
            src.domain = defiVar.get(srctmp);
            dst.domain = defiVar.get(dstmp);
        }
        StringBuilder amount = new StringBuilder();
        if(ctx.amt != null) {
            amount.append(ctx.amt.getText());
        }
        else{
            amount.append(ctx.stateField().getText());
        }
        String unit = ctx.unit.getText().replace("\"","");
        StringBuffer rati = new StringBuffer();
        if(ctx.newuint != null) {
            String newuint = ctx.newuint.getText().replace("\"", "");
            rati.append(ctx.amtuint.getText() + " ");
            rati.append(unit + " as " + ctx.newamt.getText() + " "+ newuint);
        }
        return new Payment(ctx.opname.getText(),src,dst, amount.toString(), unit, rati.toString());
    }

    private boolean conditionExpression(CompareUnitContext ctx){
        if(ctx.number != null) return true;
        else{
            String contractName = ctx.recv.getText();
            String filedName = ctx.method.getText();
            Contract tmp = contracts.get(contractName);
            if(tmp == null) return false;
            for(Field t : tmp.fields){
                if(t.name.equals(filedName)){
                    return true;
                }
            }
        }
        return false;
    }

    private String operationCompare(REL_OPContext ctx){
        if(ctx.equal != null) return " Equal ";
        if(ctx.neq != null) return " Inequal ";
        if(ctx.smal != null) return " Less ";
        if(ctx.smequ != null) return " Less than or Equal ";
        if(ctx.larg != null) return " Greater ";
        else return " Greater than or Equal ";
    }
   /*
    private char operationCompare(REL_OPContext ctx){
        if(ctx.equal != null) return '=';
        if(ctx.neq != null) return " Inequal ";
        if(ctx.smal != null) return " Less ";
        if(ctx.smequ != null) return " Less than or Equal ";
        if(ctx.larg != null) return " Greater ";
        else return " Greater than or Equal ";
    }*/

    private ContractInvocation contractInvocation(HSlangParser.IfcontractInvocationSpecContext ctx, Map<String, String> ifVar, Map<String, String> ifVarAddr) throws HSLParsingException {
        String opName = ctx.opname.getText();
        String invoker = ctx.acct.getText();  // account id

        // account is not exist
        if (defiVrAddr.get(invoker) == null && ifVarAddr.get(invoker) == null) {
            throw new HSLParsingException(invoker + " is not exist");
        }

        boolean inblockVar = false;
        if(defiVrAddr.get(invoker) == null) inblockVar = true;

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
        if(inblockVar){
            contract.domain = ifVar.get(contract_code);
            contract.address = ifVarAddr.get(contract_code).replace("\"", "");
        } else {
            contract.domain = defiVar.get(contract_code);
            contract.address = defiVrAddr.get(contract_code).replace("\"", "");
        }
        List<Inputs> in = new ArrayList<>();
        if (res.args.isEmpty()) {
            // function has none inputs
            if (ctx.args != null) {
                throw new HSLParsingException("Invaid inputs");
            }
            opCheck(opName);
            return new ContractInvocation(name, invoker, contract, funcName, in);

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
            return new ContractInvocation(name, invoker, contract, funcName, in);
        }
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

            Maccount add = new Maccount(id, chainId,addr.replaceAll("\"",""));
               accountMap.append(add.toJson());
               accountMap.append(",\n");

        }catch (Exception e) {
            System.err.println(e);
            e.printStackTrace();
        }
        return super.visitAccountSpc(ctx);
    }

    private void accountSpec(String chainId, String id, String addr, Map<String, String> ifVar, Map<String, String> ifVarAddr) throws HSLParsingException{
        HashMap<String,String> tmp = chainAccount.getOrDefault(chainId,new HashMap<String, String>());
        // account name is already taken
        if(ifVar.get(id)!= null){
            throw new HSLParsingException("the account name " + id  +" is already taken");
        }
        // account address is been used
        if(tmp.containsValue(addr)){
            throw new HSLParsingException("the address is already taken");
        }
        tmp.put(id,addr);
        ifVar.put(id,chainId);
        ifVarAddr.put(id, addr);

    }

    /**
     * Get dependencies and check whether it is correct
     * @param ctx dependencies statement
     * @return string
     */
    @Override
    public String visitDepSpec(HSlangParser.DepSpecContext ctx) {
        if(ctx.isEmpty())
            return super.visitDepSpec(ctx);
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
