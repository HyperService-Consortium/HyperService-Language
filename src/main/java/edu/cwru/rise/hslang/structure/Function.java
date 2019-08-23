package edu.cwru.rise.hslang.structure;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Function {
    // args stores input arguments
    public List<Parameter> args = new ArrayList<>();
    public List<Parameter> returns = new ArrayList<>();
    public String name;
    // modifiers stores information like public, private, etc
    public Set<Modifier> modifiers = new HashSet<>();

    /**
     * Override toString function
     * @return modifiers + function + return
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        for (Modifier m : modifiers
                ) {
            sb.append(m + ",");
        }

        sb.append(" function " + name + "(");
        for (Parameter p : args
                ) {
            sb.append(p.type + " " + p.name + ",");
        }
        sb.append(") returns (");

        for (Parameter p : returns) {
            sb.append(p.type + " " + p.name + ',');
        }
        sb.append(")");
        return sb.toString();
    }
}
