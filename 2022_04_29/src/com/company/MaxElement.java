package com.company;

public class MaxElement {
    private int [] array;

    public MaxElement(int[] array) {
        this.array = array;
    }

    //Написать метод, находящий макс. элемент массива целых чисел и протестировать его.

    public int getMaxElement() {
        int maxElement = 0;
        for (int i : array) {
            if (i > maxElement) {
                maxElement = i;
            }
        }
        return maxElement;
    }
}
