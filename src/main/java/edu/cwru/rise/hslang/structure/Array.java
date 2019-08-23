package edu.cwru.rise.hslang.structure;

import java.util.Objects;

public class Array extends Type {
    //elemType stores the data type that will be store in the array
    public Type elemType;
    // length stores the array length
    public int length;

    /**
     * override equals function, compare with elemType and length
     * @param o An object
     * @return whether array is equal to the input object
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Array array = (Array) o;
        return length == array.length &&
                Objects.equals(elemType, array.elemType);
    }

    /**
     * Override hashCode funtion to get the hash code
     * @return hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), elemType, length);
    }
}
