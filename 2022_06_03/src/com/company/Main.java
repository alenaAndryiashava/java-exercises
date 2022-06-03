package com.company;


import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
    }
    //написать метод, возвращающий элемент из списка, встречающийся наибольшее количество раз
    // 1,5, -10,1-> 1

    public int findMaxOccuredElement(List<Integer> numbers) {
        int maxElement = Integer.MIN_VALUE;
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer number : numbers) {
            if (map.containsKey(number)) {
                map.put(number, map.get(number) + 1);
            } else map.put(number, 1);

            for (int key : map.keySet()) {
                if (map.get(key) > maxElement)
                    maxElement = key;

            }

        }
        return maxElement;
    }

    //написать метод, возвращающий элемент из списка не имеющий пары
    // 1,2,1->2,  1,1,1->1
    public int findSingleNumber(List<Integer> numbers) {
        Set<Integer> set = new HashSet<>();
        for (Integer number : numbers) {
            if (set.contains(number)) {
                set.remove(number);
            } else set.add(number);
        }
        return set.stream().findFirst().orElse(-1);

    }

}