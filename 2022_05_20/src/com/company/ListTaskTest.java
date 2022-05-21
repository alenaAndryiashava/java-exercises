package com.company;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListTaskTest {

    @Test
    void testFindIndex() {
        List<Integer> actual = Arrays.asList(3,2,1,4,1);
        assertEquals(2,ListTask.pivotSum(actual));
    }
    @Test
    void test_indexNotFound() {
        List<Integer> actual = Arrays.asList(3,2,1, 7,1);
        assertEquals(0,ListTask.pivotSum(actual));
    }
    @Test
    void test_pivot_3elt() {
        List<Integer> actual = Arrays.asList(3,2,3);
        assertEquals(1,ListTask.pivotSum(actual));
    }
    @Test
    void test_pivot_secondElement() {
        List<Integer> actual = Arrays.asList(3,3,1,1,1);
        assertEquals(1,ListTask.pivotSum(actual));
    }
    void test_pivot_lastElement() {
        List<Integer> actual = Arrays.asList(3,2,1,10,6);
        assertEquals(3,ListTask.pivotSum(actual));
    }

}