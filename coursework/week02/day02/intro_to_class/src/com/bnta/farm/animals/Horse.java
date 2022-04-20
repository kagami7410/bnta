package com.bnta.farm.animals;

import java.util.ArrayList;
import java.util.List;

public class Horse {
    private String name;
    private int age;
    private double height;


    public Horse(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(short height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }
}



