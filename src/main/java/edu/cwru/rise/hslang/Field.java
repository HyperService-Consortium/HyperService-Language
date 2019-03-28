package edu.cwru.rise.hslang;

import java.util.Objects;

public class Field {
    public Type type;
    public String name;
    public int pos;

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
