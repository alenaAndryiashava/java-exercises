package com.company;

public  class PizzaFactory {

  public Pizza createPizza(PizzaType type) {

        switch (type) {
            case PIZZA_HAWAII:
                return new PizzaHawaii();

            case PIZZA_SALAMI:
                return new PizzaSalami();

            case PIZZA_MOZZARELLA:
                return new PizzaMozzarella();

            default:
                return null;
        }
    }
}



