package com.company;

public class Rectangle extends Figure {
    double length;
    double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    @Override
    public String toString() {
        return "Rectangle: "+'\n' + "length = "+ getLength()+" breadth = "+ getBreadth()+super.toString();
    }

    @Override
    public double getArea(){
        return getLength()*getBreadth();
    }
}
