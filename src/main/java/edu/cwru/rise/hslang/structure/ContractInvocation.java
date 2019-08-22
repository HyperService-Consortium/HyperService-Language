package edu.cwru.rise.hslang.structure;

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
    public String func;
    public Sources contract;
    public List<Inputs> parameters;

    public ContractInvocation(String name, String invoker, Sources contract,
                              String func, List<Inputs> parameters){
        this.name = name;
        this.type = "ContractInvocation";
        this.invoker = invoker;
        this.contract = contract;
        this.func = func;
        this.parameters = parameters;
    }

    public String toJson() {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(this);
    }

}
