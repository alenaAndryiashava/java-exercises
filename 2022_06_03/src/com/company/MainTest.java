package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private Main main;

    @BeforeEach
    public void init(){main = new Main();
    }

    @Test
    void testFindMaxOccuredElement() {
        List<Integer> actual = Arrays.asList(1,5,-10,1);
        assertEquals(1, main.findMaxOccuredElement(actual));
    }

    @Test
    void testMaxNoPositiveOccuredElement() {
        List<Integer> actual = Arrays.asList(-10,-5,-10,-5);
        assertEquals(-10, main.findMaxOccuredElement(actual));
    }

    @Test
    void findSingleNumber() {
        List<Integer> actual = Arrays.asList(1,2,1);
        assertEquals(2, main.findSingleNumber(actual));
    }
    @Test
    void findSingle_equalsNumber() {
        List<Integer> actual = Arrays.asList(1,1,1);
        assertEquals(1, main.findSingleNumber(actual));
    }
}