package edu.cwru.rise.hslang.structure;

import java.util.Objects;

public class Field {
    public Type type;
    public String name;
    // pos indicate the this field's order in the contract
    public String pos;

    /**
     * override equals function, compare with type and name
     * @param o An object
     * @return whether field is equal to the input object
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Field field = (Field) o;
        return Objects.equals(type, field.type) &&
                Objects.equals(name, field.name);
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
