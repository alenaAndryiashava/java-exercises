package com.company;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static java.util.Arrays.sort;
import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {
    Rectangle rectangle = new Rectangle ("Rectangle",4.0,2.0);
    Square square = new Square("Square",4.0);
    Circle circle = new Circle("Circle", 2.0);



    @Test
    void sortOfArea() {
        Shape[] expected = {circle,rectangle,square};
        Shape[] actual = new Shape[]{rectangle,square,circle};
         Arrays.sort(actual);

         assertArrayEquals(expected,actual);

    }
}