package com.company;

public class PizzaSalami extends Pizza{
    private static final String TYPE = "Pizza Salami";

    public PizzaSalami() {
        super(TYPE);
    }

    @Override
    public void prepare() {
        System.out.println("Preparing pizza with salami.");
    }
}
