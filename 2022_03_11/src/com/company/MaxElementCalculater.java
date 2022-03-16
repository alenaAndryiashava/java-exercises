package com.company;

//Create a class, which will have a method to find max element of int array. T
//he class must have a constructor accepting int array.

import java.util.Arrays;

public class MaxElementCalculater {
    private int[] array;

    public MaxElementCalculater(int[] array) {
        this.array = array;
    }

    public int getMaxElement(){
        int maxElement = Integer.MIN_VALUE;
        for (int j : array) {
            if (j > maxElement) {
                maxElement = j;
            }
        }
        return maxElement;
    }
    public void printMaxElement(){
        System.out.println(Arrays.toString(array)+" -> max element is: "+getMaxElement());
    }
}
