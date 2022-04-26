package models;

import interfaces.Cyclable;
import interfaces.IRun;
import interfaces.Swimable;

public class Triathlete implements Swimable, Cyclable, IRun {

    private String name;

    public Triathlete(String name) {
        this.name = name;
    }

    public String swim(int distance){
        return this.name + " swam " + distance + "m after cycling";
    }

    public String cycle(int distance){
        return this.name+ " cycled " + distance + "m";
    }

    public String run(int distance){
        return this.name + " ran " + "m";
    }
}
