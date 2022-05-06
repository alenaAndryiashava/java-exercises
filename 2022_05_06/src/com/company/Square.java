package com.company;

public class Square extends Shape {
    private double length;


    public Square(String displayName,double a){
        super(displayName);
        this.length = a;

    }

    public double getLength() {
        return length;
    }

    public Double getArea(){
        return length*length;
    }

    @Override
    public String toString() {
        return "Square{" +
                "length=" + length +
                '}';
    }
}
