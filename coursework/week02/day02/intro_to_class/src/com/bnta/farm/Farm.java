package com.bnta.farm;

import com.bnta.farm.animals.Horse;
import com.bnta.farm.animals.Pig;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Farm {
    //static members belong to the class itself.
    // ArrayList storing farm objects.
    public static List<Farm> farms = new ArrayList<>();
    public static List<Horse> horses = new ArrayList<>();
    public static List<Pig> pigs = new ArrayList<>();

    private String name;
    private double acres;

//this.name is a instance property of the farm class
    //name is the property assigned
    public Farm(String name, double acres){
        this.name = name;
        this.acres = acres;
        Farm.farms.add(this);
    }

    // adding horse object to the ArrayList
    public void addHorse(Horse horse){
        this.horses.add(horse);
    }
    public void addPig(Pig pig){
        this.pigs.add(pig);
    }

    public List<Horse> getHorses(){
        return this.horses;
    }

    public List<Pig> getPigs(){
        return this.pigs;
    }

    @Override
    public String toString() {
        return "Farm{" +
                "name='" + name + '\'' +
                ", acres=" + acres +
                ", horses=" + horses +
                ". pigs=" + pigs +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Farm farm = (Farm) o;
        return Double.compare(farm.acres, acres) == 0 && name.equals(farm.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, acres);
    }





    public String getName(){
        return this.name;
    }

    public double getAcres(){
        return this.acres;
    }
// instance members belong to specific object created from the class
}
