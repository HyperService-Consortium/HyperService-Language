package edu.cwru.rise.solidity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Function {
    List<Parameter> args = new ArrayList<>();
    List<Parameter> returns = new ArrayList<>();
    public String name;
    Set<Modifier> modifiers = new HashSet<>();

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
