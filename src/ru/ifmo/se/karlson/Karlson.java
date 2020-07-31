package ru.ifmo.se.karlson;

public class Karlson extends Create implements IKarlson {

    public Karlson(String name, int age) {
        super(name, age);
        System.out.println("Created person " + name);
    }

    @Override
    public void see(Boy boy, Things things) {
        System.out.println(this.GetName() + " saw " + boy.GetName() + " and " + things);
    }

    @Override
    public void chew(Things things) {
        System.out.println(this.GetName() + " started chew " + things);
    }

    @Override
    public void fly(Things things) {
        if (clickTheButton("on")) {
            System.out.println(this.GetName() + " clicked the button");
            System.out.println(things + " worked and " + this.GetName() + " flew");
        }
    }

    @Override
    public boolean clickTheButton(String turn) {
        if (turn == "on" || turn == "ON" || turn == "On" || turn == "oN") {
            return true;
        }
        return false;
    }

    @Override
    public void took(Things things) {
        System.out.println(this.GetName() + " took " + things);
    }
}
