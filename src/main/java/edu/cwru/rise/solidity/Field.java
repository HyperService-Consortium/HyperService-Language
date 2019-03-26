package edu.cwru.rise.solidity;

import java.util.Objects;

public class Field {
    Type type;
    String name;
    int pos;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Field field = (Field) o;
        return Objects.equals(type, field.type) &&
                Objects.equals(name, field.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(type, name);
    }
}
