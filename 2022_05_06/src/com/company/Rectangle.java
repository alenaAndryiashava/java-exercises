package com.company;

public class Rectangle extends Shape {
    private double length;
    private double breadth;

    public Rectangle(String displayName,double a,double b){
        super(displayName);
        this.length = a;
        this.breadth = b;
    }

    public double getLength() {
        return length;
    }

    public double getBreadth() {
        return breadth;
    }

    public Double getArea(){
        return length*breadth;
    }


    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", breadth=" + breadth +
                '}';
    }
}
