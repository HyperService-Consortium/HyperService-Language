package edu.cwru.rise.hslang.structure;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Created by {Jian Shi} on 2020/1/11.
 */
public class Condition {
    public String left;
    public String right;
    public String sign;

    public Condition(String left, String right, String sign){
        this.left = left;
        this.right = right;
        this.sign = sign;
    }
    /**
     * convert the object to json
     * @return A json string
     */
    public String toJson() {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(this);
    }
}
