package edu.cwru.rise.hslang.structure;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Created by {Jian Shi} on 2020/2/21.
 */
public class Maccount {
    public String userName;
    public String domain;
    public String address;

    public Maccount(String userName,String domain,String address){
        this.userName = userName;
        this.domain = domain;
        this.address = address;
    }

    public String toJson() {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(this);
    }
}
