package edu.cwru.rise.hslang.structure;

import java.util.Objects;

public class Type {
    public String name;

    /**
     * override equals function, compare with name
     * @param o An object
     * @return whether Type is equal to the input object
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Type type = (Type) o;
        return Objects.equals(name, type.name);
    }

    /**
     * Override hashCode funtion to get the hash code
     * @return hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    /**
     * Override toString function
     * @return name
     */
    @Override
    public String toString() {
        return name;
    }
}
