package edu.cwru.rise.hslang.structure;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Created by {Jian Shi} on 2020/2/21.
 */
public class IfCondition {
    public Inputs left;
    public Inputs right;
    public String sign;

    public IfCondition(Inputs left, Inputs right, String sign){
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
