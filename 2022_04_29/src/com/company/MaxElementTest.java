package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxElementTest {


    @Test
    public void test_get_Max_Element_sorted_Array() {
        int [] array = {2, 3, 5,10};
        MaxElement maxElement = new MaxElement(array);
        int expected = 10;
        assertEquals(expected, maxElement.getMaxElement());
    }
    @Test
    public void test_get_Max_Element_unsorted_Array() {
        int [] array = {2, 8, 3,9};
        MaxElement maxElement = new MaxElement(array);
        int expected = 9;
        assertEquals(expected, maxElement.getMaxElement());
    }
    @Test
    public void test_get_Max_Element_Array_isEmpty() {
        int [] array = {};
        MaxElement maxElement = new MaxElement(array);
        int expected = 0;
        assertEquals(expected, maxElement.getMaxElement());
    }


}