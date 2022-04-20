package org.example.classes;


public class Rectangle {
    private float length;
    private float width;


    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }


    public double getDiagonal() {
        double a = length * length;
        double b = width * width;
        double c = Math.sqrt(a+b);
        return c;
    }

    public float getLength() {
        return length;
    }

    public double getPerimeter(){
        return 2*(length + width);

    }

    public float getWidth(){
        return width;
    }

}