package edu.cwru.rise.hslang.structure;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.List;

/**
 * Created by {Jian Shi} on 2020/1/10.
 */
public class If {
    public List<Payment> payOp;
    public List<ContractInvocation> invOp;

    public If(List<Payment> payOp, List<ContractInvocation> invOp){
        this.payOp = payOp;
        this.invOp = invOp;
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
