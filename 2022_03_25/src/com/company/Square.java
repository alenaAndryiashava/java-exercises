package com.company;

public class Square extends Figure {
    double length;

    public Square(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "\n"+ "Square: "+"\n" +" length= " + getLength()+ ", area = " + getArea();
    }

    @Override
    public double getArea() {
        return getLength()*getLength();
    }
}
