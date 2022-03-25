package com.company;

public abstract class Figure {
    @Override
    public String toString() {
        return ", area = " +getArea();
    }
    public abstract double getArea();
}
