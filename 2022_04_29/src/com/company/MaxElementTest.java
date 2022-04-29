package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxElementTest {

    @Test
    public void test_get_Max_LastElement() {
        int [] array = {15,3,0, 3, 5,19};
        MaxElement maxElement = new MaxElement(array);
        int expected = 10;
        assertEquals(expected, maxElement.getMaxElement());
    }
    @Test
    public void test_get_Max_FirstElement() {
        int [] array = {9, 3, 8,0};
        MaxElement maxElement = new MaxElement(array);
        int expected = 9;
        assertEquals(expected, maxElement.getMaxElement());
    }
    @Test
    public void test_get_Max_Element_Array_isEmpty() {
        int [] array = {};
        MaxElement maxElement = new MaxElement(array);
        int expected = -1;
        assertEquals(expected, maxElement.getMaxElement());
    }
    @Test
    public void test_oneElement() {
        int [] array = {2};
        MaxElement maxElement = new MaxElement(array);
        int expected = 2;
        assertEquals(expected, maxElement.getMaxElement());
    }
    @Test
    public void testTwoElement() {
        int [] array = {2,2};
        MaxElement maxElement = new MaxElement(array);
        int expected = 2;
        assertEquals(expected, maxElement.getMaxElement());
    }
    @Test
    public void testMaxMiddleElement() {
        int [] array = {2,7,1,9,0,8,2};
        MaxElement maxElement = new MaxElement(array);
        int expected = 9;
        assertEquals(expected, maxElement.getMaxElement());
    }



}