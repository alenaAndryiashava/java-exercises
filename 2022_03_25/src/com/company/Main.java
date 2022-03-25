package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    //      1.создать классы содержащие методы для подсчета площади прямоугольника
        //     * квадрата и круга. Кроме результата подсчета должно выводиться также
        //     * название соответствующей фигуры. Создать массив таких объектов и вывести
        //     * его на экран
        //     * Прямоугольник1 имеет площадь 50
        //     * Круг имеет площадь 20
        Rectangle rectangle1 = new Rectangle (3,6);
        Square square1 = new Square(5);
        Circle circle1 = new Circle(3);

        Figure[] figures = {rectangle1,square1,circle1};
            System.out.println(Arrays.toString(figures));




    }
}
