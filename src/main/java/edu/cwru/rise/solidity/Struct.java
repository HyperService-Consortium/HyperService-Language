package edu.cwru.rise.solidity;

import java.util.ArrayList;
import java.util.List;

public class Struct extends Type {
    List<Field> fields = new ArrayList<>();

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer(name + "(struct{");
        for (Field f: fields
             ) {
            sb.append(f.type + " " + f.name+",");
        }
        sb.append("})");
        return sb.toString();
    }
}
