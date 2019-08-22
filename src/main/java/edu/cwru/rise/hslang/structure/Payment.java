package edu.cwru.rise.hslang.structure;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Created by {Jian Shi} on 2019/3/27.
 */
public class Payment {
    public String name;
    public String type;
    public Sources src;
    public Sources dst;
    public String amount;
    public String unit;
    public String ratio;

    public Payment(String name,Sources src, Sources dst, String amount, String unit, String ratio){
        this.name = name;
        this.type = "Payment";
        this.src = src;
        this.dst = dst;
        this.amount= amount;
        this.unit = unit;
        this.ratio = ratio;
    }

    public String toJson() {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(this);
    }
}
