package edu.cwru.rise.hslang;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Created by {Jian Shi} on 2019/3/27.
 */
public class Payment {
    public String name;
    public String type;
    public String src_domain;
    public String src;
    public String dst_domain;
    public String dsg;
    public String amount;
    public String unit;

    public Payment(String name, String src_domain, String src, String dst_domain, String dsg, String amount, String unit){
        this.name = name;
        this.type = "Payment";
        this.src_domain = src_domain;
        this.src = src;
        this.dst_domain = dst_domain;
        this.dsg = dsg;
        this.amount= amount;
        this.unit = unit;
    }

    public String toJson() {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(this);
    }
}
