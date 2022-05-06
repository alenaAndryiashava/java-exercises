package com.company;

public class Circle extends Shape {
    public static double PI = 3.14;
    private double radius;

    public Circle(String displayName, double radius) {
        super(displayName);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public Double getArea(){
        return PI*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }


}
