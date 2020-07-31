package ru.ifmo.se.karlson;

public class Boy extends Create {
    public Boy(int age, String name) {
        super(name, age);
        System.out.println("Created person " + name);
    }

    @Override
    public String toString() {
        return "Boy{" + this.GetName() + '}';
    }
}
