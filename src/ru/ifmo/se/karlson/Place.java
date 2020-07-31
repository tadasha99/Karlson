package ru.ifmo.se.karlson;

import java.util.ArrayList;

public class Place {
    private String name;
    private Location location;
    private ArrayList<Create> objects = new ArrayList<Create>();
    public Place(String name, Location location) {
        this.name = name;
        this.location = location;
        System.out.println("Created place " + name + " at " + location.getLocation());
    }
    public void addObject(Create create) {
        objects.add(create);
        System.out.println("Added new object " + create.GetName());
    }

    public void remObject(Create create) {
    objects.remove(create);
        System.out.println("Removed object " + create.GetName());
    }
}
