package edu.cwru.rise.hslang.structure;

import java.util.Objects;

public class Array extends Type {
    public Type elemType;
    public int length;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Array array = (Array) o;
        return length == array.length &&
                Objects.equals(elemType, array.elemType);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), elemType, length);
    }
}
