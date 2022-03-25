package com.company;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
    return radius*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "\n"+ "Circle: " +"\n"+
                " radius = " + radius +
                 " area = " +getArea();
    }
}
