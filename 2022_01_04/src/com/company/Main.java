package com.company;

public class Main {

    public static void main(String[] args) {
	// Создать фабрику по производству пиццы. Фабрика должна уметь готовить следующие
        //     * виды пиццы: Гавайи, Моцарелла и Салями
        //     * Каждый вид пиццы должен уметь: подготавливаться(накладывать ингредиенты напр),
        //     печься, упаковываться
        //     * В каждом случае должно быть понятно о какой пицце идет речь.
        //     Класс Solution не должен создавать новый объект пицца,
        //     *  а из него должен поступать "заказ" на изготовление требуемого вида пиццы(объекта)
        //     в класс
        //     * PizzaFactory, который и должен выбрать нужную пиццу для изготовления*/

       PizzaFactory factory = new PizzaFactory();
       Pizza hawaii = factory.createPizza(PizzaType.PIZZA_HAWAII);
       Pizza salami = factory.createPizza(PizzaType.PIZZA_SALAMI);
       Pizza mozzarella = factory.createPizza(PizzaType.PIZZA_MOZZARELLA);

       hawaii.orderPizza();
       salami.orderPizza();
       mozzarella.orderPizza();



    }
}
