package edu.cwru.rise.hslang;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

/**
 * Created by {Jian Shi} on 2019/3/27.
 */
public class ContractInvocation {
    public String name;
    public String type;
    public String invoker;
    public String contract_domain;
    public String contract_addr;
    public String func;
    public List<Inputs> parameters;

    public ContractInvocation(String name, String invoker, String contract_domain, String contract_addr,
                              String func, List<Inputs> parameters){
        this.name = name;
        this.type = "ContractInvocation";
        this.invoker = invoker;
        this.contract_domain = contract_domain;
        this.contract_addr = contract_addr;
        this.func = func;
        this.parameters = parameters;
    }

    public String toJson() {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(this);
    }

}
