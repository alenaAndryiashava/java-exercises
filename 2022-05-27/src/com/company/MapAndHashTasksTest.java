package com.company;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class MapAndHashTasksTest {

    @Test
    void testJoinABMap() {
        Map<String, String> expected = new HashMap<>();
        expected.put("a", "Hi");
        expected.put("b", "There");
        expected.put("ab", "HiThere");
        Map<String, String> actual = new HashMap<>();
        actual.put("a", "Hi");
        actual.put("b", "There");
        MapAndHashTasks.joinABMap(actual);
        assertEquals(expected, actual);

    }

    @Test
    void testJoinABMapMissingArgument() {
        Map<String, String> expected = new HashMap<>();
        expected.put("a", "Hi");
        expected.put("c", "There");

        Map<String, String> actual = new HashMap<>();
        actual.put("a", "Hi");
        actual.put("c", "There");
        MapAndHashTasks.joinABMap(actual);
        assertEquals(expected, actual);
    }

    @Test
    void testWordMultiple() {
        Map<String, Boolean> expected = new HashMap<>();
        String[] strings = {"a", "b", "a", "c"};
        expected.put("a", true);
        expected.put("b", false);
        expected.put("c", false);
        assertEquals(expected, MapAndHashTasks.wordMultiple(strings));


    }

    @Test
    void testNameByNumberOccurrence() {
        List input = Arrays.asList("Ivan", "Maria", "Piotr", "Ivan");
        assertEquals(2, MapAndHashTasks.nameByNumberOccurrence(input, "Ivan"));

    }

    @Test
    void testNameByNumberOccurrence_2_Ivan() {
        List input = Arrays.asList("Ivan", "Ivan");
        assertEquals(2, MapAndHashTasks.nameByNumberOccurrence(input, "Ivan"));

    }

    @Test
    void testNameByNumberOccurrence_empty() {
        List input = Arrays.asList();
        assertEquals(0, MapAndHashTasks.nameByNumberOccurrence(input, "Ivan"));

    }

    @Test
    void testRemoveDuplicates_one_element() {
        List<String> actual = Arrays.asList("Ivan");
        List<String> expected = Arrays.asList("Ivan");

        assertEquals(expected, MapAndHashTasks.removeDuplicates(actual));

    }

    @Test
    void testRemoveDuplicates_no_duplicates() {
        List<String> actual = Arrays.asList("Ivan","Piotr");
        List<String> expected = Arrays.asList("Ivan","Piotr");

        assertEquals(expected, MapAndHashTasks.removeDuplicates(actual));
    }

    @Test
    void testRemoveDuplicates_() {
        List<String> actual = Arrays.asList("Ivan", "Maria", "Piotr", "Anna", "Maria", "Ivan");
        List<String> expected = Arrays.asList("Ivan", "Maria", "Piotr", "Anna");

        assertEquals(expected, MapAndHashTasks.removeDuplicates(actual));
    }

    @Test
    void testGetDuplicates() {
        List<String> input = Arrays.asList("Ivan", "Maria", "Piotr", "Anna", "Maria", "Ivan");
        Set<String> expected = new HashSet<>();
        expected.add("Maria");
        expected.add("Ivan");
        Set<String>actual = new HashSet<>(MapAndHashTasks.getDuplicates(input));
        assertEquals(expected,actual);
    }
    @Test
    void testGetDuplicates_no_duplicates() {
        List<String> input = Arrays.asList("Ivan", "Maria", "Piotr", "Anna");
        List<String> expected = Arrays.asList();

        assertEquals(expected,MapAndHashTasks.getDuplicates(input));
    }

    @Test
    void testGetDominantNumber() {
        int[] actual = {2,2,2,4};
        int expected = 2;
        assertEquals(expected,MapAndHashTasks.getDominantNumber(actual));
    }
    @Test
    void testGetDominantNumber_no_dominantNumber() {
        int[] actual = {2,2,3,4};
        int expected = -1;
        assertEquals(expected,MapAndHashTasks.getDominantNumber(actual));
    }
}