package edu.cwru.rise.hslang;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Created by {Jian Shi} on 2019/3/28.
 */
public class dependencies {
    public String left;
    public String right;
    public String dep;

    public dependencies(String left, String right, String dep){
        this.left = left;
        this.right = right;
        this.dep = dep;
    }

    public String toJson() {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(this);
    }
}
