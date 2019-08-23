package edu.cwru.rise.hslang.structure;

import java.util.ArrayList;
import java.util.List;

public class Contract implements Cloneable {
    // contract's name
    public String name;
    // contract's fields
    public List<Field> fields = new ArrayList<>();
    // contract's function
    public List<Function> functions = new ArrayList<>();

    /**
     * Override clone funtion
     * @return clone object
     */
    @Override
    public Object clone() {
        Contract newContra = null;
        try {
            newContra = (Contract) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return newContra;
    }

    /**
     * Override toString function
     * @return Contract name + fields + functions
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("Contract " + name + "{ \n");
        for (Field f : fields
                ) {
            sb.append("\t " + f.type + " " + f.name + "{pos# " + f.pos + "}\n");
        }
        for (Function f : functions
                ) {
            sb.append("\t " + f.toString() + "\n");
        }
        sb.append("}");
        return sb.toString();
    }

    /**
     * Get the contract's functions
     * @return contract's functions
     */
    public List<Function> getFunctions(){
        return this.functions;
    }

}
