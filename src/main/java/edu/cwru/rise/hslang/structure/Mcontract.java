package edu.cwru.rise.hslang.structure;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Created by {Jian Shi} on 2020/2/21.
 */
public class Mcontract {
    public String contractName;
    public String domain;
    public String address;

    public Mcontract(String contractName,String domain,String address){
        this.contractName = contractName;
        this.domain = domain;
        this.address = address;
    }

    public String toJson() {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(this);
    }
}
