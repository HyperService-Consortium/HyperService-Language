package edu.cwru.rise.solidity;

import java.util.Objects;

public class Mapping extends Type {
    Type keytype;
    Type valuetype;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mapping mapping = (Mapping) o;
        return Objects.equals(keytype, mapping.keytype) &&
                Objects.equals(valuetype, mapping.valuetype);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), keytype, valuetype);
    }
}
