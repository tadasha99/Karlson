package ru.ifmo.se.karlson;

public class Main {

    public static void main(String[] args) {
        Location location = new Location(0, 0);
        Place place = new Place("Room", location);
        Boy boy = new Boy(12, "Kid");
        Karlson karlson = new Karlson("Karl", 7);
        place.addObject(boy);
        place.addObject(karlson);
        karlson.see(boy, Things.RISSOLE);
        karlson.fly(Things.ENGINE);
        karlson.took(Things.RISSOLE);
        karlson.chew(Things.RISSOLE);
    }
}
