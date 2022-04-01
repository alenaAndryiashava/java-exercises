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

        //Task 2. написать игру Угадай число, в которой за ограниченное число попыток
        //        ввода числа с клавиатуры нужно угадать секретное число от 0 до 9.
        //     * Условия:
        //     * -Код игры должен находиться в классе GameGuessNumber
        //     * -Класс GameGuessNumber должен содержать две статические переменные
        //     scanner для ввода чисел с клавиатуры и secret, в которой записано секретное число
        //     * -Класс GameGuessNumber должен содержать следующие методы (могут быть и другие по
        //     * желанию): int readNumberOfAttempts()-считывает количество предоставляемых попыток
        //     *           int readNumber() - считывает вводимое число
        //     *           void guessNumber(int attempts) содержит логику игры

        Rectangle rectangle1 = new Rectangle (3,6);
        Square square1 = new Square(5);
        Circle circle1 = new Circle(3);

        Figure[] figures = {rectangle1,square1,circle1};
            System.out.println(Arrays.toString(figures));


        System.out.println("Task 2");
        GameGuessNumber gameGuessNumber = new GameGuessNumber();
        // int attempts = gameGuessNumber.readNumberOfAttempts();
        // gameGuessNumber.guessNumber(attempts);

        gameGuessNumber.start();
    }
}
