package com.company;

public class MaxElement {
    private int [] array;

    public MaxElement(int[] array) {
        this.array = array;
    }

    //Написать метод, находящий макс. элемент массива целых чисел и протестировать его.

    public int getMaxElement() {
        if (array.length==0) return -1;

        int maxElement = array[0];
        for (int i = 1; i <array.length ; i++) {
            if (array[i] > maxElement) {
                maxElement = array[i];
            }
        }
        return maxElement;
    }
}
