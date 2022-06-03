package com.company;
//Есть массив с положительными целыми числами.
// найти элемент(если он есть), который встречается
// в массиве > length/2  (доминантный). В противном случае вернуть -1


import java.util.*;

public class MapAndHashTasks {

    //1. Дана Map<String,String>. написать метод, возвращающий мапу такую,
    // что если в исходной мапе
    // есть ключи "a" и "b" то нужно создать новый ключ "ав"
    // с суммой значений от ключей а и в.
    // Если нет, то ничего не нужно менять
    //mapAB({"a":"Hi","b":"There"}->{"a":"Hi","ab":HiThere, "b":"There"}
    //mapAB({"a":"Hi"}-> {a:Hi}

    public static Map<String, String> joinABMap(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            map.put("ab", map.get("a") + map.get("b"));

        }
        return map;
    }

    //2 Дан не пустой массив строк, вернуть мапу Map<String,Boolean>,
    // где каждая строка является ключом,
    // а значением является true  если строка в массиве встречается больше одного раза
    // и false  если только один раз
    // wordmultiple(["a","b","a","c","b"])->{a:true,b:true, c:false}

    public static Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> map = new HashMap<>();
        for (String string : strings) {
            if (!map.containsKey(string)) {
                map.put(string, false);
            } else
                map.replace(string, true);
        }
        return map;
    }
    // 3. Дан список имен, где некоторые имена повторяются.
    // Написать метод, который по имени вернет количество
    // вхождений этого имени в список
    // int nameByNumberOccurence(List<String> list, String name) Vasia->3

    public static int nameByNumberOccurrence(List<String> list, String name) {
        Map<String, Integer> map = new HashMap<>();
        for (String string : list) {
            if (map.containsKey(string)) {
                map.put(string, map.get(string) + 1);
            }else map.put(string,1);
        }
        return  map.containsKey(name)?map.get(name):0;
        //return map.getOrDefault(name, 0);
    }
    //4. С использованием множеств написать метод, который вернет список без повторяющихся
    // элементов
    // List<String> removeDuplicates(List<String>input
    // {Ivan,Maria,Piotr,Anna,Maria,Ivan}->{Ivan,Maria,Piotr;Anna}

    public static List<String> removeDuplicates(List<String> input){
        Set<String> set = new HashSet<>(input);
        return new ArrayList<>(set);
    }

    //5.C использованием множеств написать метод, возвращающий повторяющиеся элементы из списка
    // {Ivan,Maria,Piotr,Anna,Maria,Ivan}->{Ivan,Maria}
    public static List<String> getDuplicates(List<String>input){
        Set<String> set1 = new HashSet<>();
        List<String>list = new ArrayList<>();
        for (String string:input){
            if(set1.contains(string)){
                list.add(string);
            }
            set1.add(string);
        }
        return list;
    }
    public static List<String> getDuplicates1(List<String>input){
        Set<String> set = new HashSet<>();
        List<String> duplicates = new ArrayList<>();
        for (String s:input){
            if(!set.add(s) &&!duplicates.contains(s))duplicates.add(s);
        }
        return duplicates;
    }

    //6. Есть массив с положительными целыми числами.
   // Найти элемент(если он есть), который встречается в массиве > length/2  (доминантный).
    // В противном случае вернуть -1
    public static int getDominantNumber(int[] numbers){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(numbers[i])){
                map.put(numbers[i],map.get(numbers[i])+1);
            }else map.put(numbers[i],1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > numbers.length/2) {
                return entry.getKey();
            }
        }

        return -1;
    }
    public static int findDominant(int[] numbers){
        Map<Integer,Integer> map = new HashMap<>();

        for (int i= 0;i<numbers.length;i++){
            if(map.containsKey(numbers[i]))
                map.put(numbers[i],map.get(numbers[i]+1));
            else map.put((numbers[i]),1);
        }
        for (int key:map.keySet()){
            if(map.get(key)>numbers.length/2)
                return key;
        }
        return -1;
    }
}

