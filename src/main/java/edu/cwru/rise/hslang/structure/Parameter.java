package edu.cwru.rise.hslang.structure;

import java.util.Objects;

public class Parameter {
    public Type type;
    public String name;

    /**
     * override equals function, compare with type and name
     * @param o An object
     * @return whether parameter is equal to the input object
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Parameter parameter = (Parameter) o;
        return Objects.equals(type, parameter.type) &&
                Objects.equals(name, parameter.name);
    }

    /**
     * Override hashCode funtion to get the hash code
     * @return hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(type, name);
    }
}
