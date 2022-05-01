package com.company;

public class PizzaHawaii extends Pizza {
    private static final String TYPE = "Pizza Hawaii";

    public PizzaHawaii() {
        super(TYPE);
    }

    @Override
    public String getType() {
        return super.getType();
    }

    @Override
    public void prepare() {
        System.out.println("Preparing Pizza with Ananas and Cheese ");
    }

}
