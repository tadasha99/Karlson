package ru.ifmo.se.karlson;

import java.util.Objects;

public abstract class Create implements IHuman {
    private String name;
    private int age;


    public Create(String name, int age) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int GetAge() {
        return age;
    }

    @Override
    public String GetName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Create create = (Create) o;
        return age == create.age &&
                Objects.equals(name, create.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
