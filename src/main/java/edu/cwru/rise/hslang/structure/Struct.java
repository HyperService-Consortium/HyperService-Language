package edu.cwru.rise.hslang.structure;

import java.util.ArrayList;
import java.util.List;

public class Struct extends Type {
    public List<Field> fields = new ArrayList<>();

    /**
     * Override toString function
     * @return name + struct
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer(name + "(struct{");
        for (Field f: fields
             ) {
            sb.append(f.type + " " + f.name+",");
        }
        if(sb.charAt(sb.length()-1) == ',') {
            sb.deleteCharAt(sb.length() - 1);
        }
        sb.append("})");
        return sb.toString();
    }
}
