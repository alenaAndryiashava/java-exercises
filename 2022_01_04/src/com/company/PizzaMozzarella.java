package com.company;

public class PizzaMozzarella extends Pizza{
    private static final String TYPE = "Pizza Mozzarella";

    public PizzaMozzarella() {
        super(TYPE);

    }

    @Override
    public void prepare() {
        System.out.println("Preparing pizza with Mozzarella cheese. ");

    }
}
