package edu.cwru.rise.hslang.structure;

import java.util.Objects;

public class Parameter {
    public Type type;
    public String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Parameter parameter = (Parameter) o;
        return Objects.equals(type, parameter.type) &&
                Objects.equals(name, parameter.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(type, name);
    }
}
