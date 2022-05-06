package com.company;

public abstract class Shape implements Comparable<Shape> {
    private String displayName;

    public Shape(String displayName) {
        this.displayName = displayName;
    }
    public abstract Double getArea();

    @Override
    public int compareTo(Shape other) {
        return getArea().compareTo(other.getArea());
    }


}

