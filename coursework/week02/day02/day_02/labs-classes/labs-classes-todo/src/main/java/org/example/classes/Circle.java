package org.example.classes;

import java.lang.Math;

public class Circle {
    private double radius;

    public Circle(double radius){

        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public double getCircumference(){
        return 2*Math.PI*radius;
    }
}