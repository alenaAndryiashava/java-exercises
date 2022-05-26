package com.company;

import java.util.HashSet;
import java.util.Set;

// Given a String, write method to check if all its characters are unique.
    // The string consists only of English letters.
    //Solve the task at least by two different ways:
    //
    //by using methods of String class
    //by using ascii value of characters.
public class UniqueCharChecker {

    public static boolean checkAllCharsUnique(String string){
        int[] lowerCounter = new int[26];
        int[] upperCounter = new int[26];
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if(Character.isUpperCase(ch)) {
                int index = ch - 'A';
                if (upperCounter[index] > 0) {
                    return false;
                }
                upperCounter[index]++;
            } else {
                int index = ch - 'a';
                if (lowerCounter[index] > 0) {
                    return false;
                }
                lowerCounter[index]++;
            }
        }
        return true;
    }

    public static boolean checkAllCharsUniqueHashSet(String string){
        Set<Character> chars = new HashSet<>();
        for (int i = 0; i < string.length(); i++) {
            if (chars.contains(string.charAt(i))) {
                return false;
            }
            chars.add(string.charAt(i));
        }

        return true;
    }

    public static boolean checkAllCharsUniqueString(String string) {
        for (int i = 0; i < string.length(); i++) {
            int result = string.indexOf(string.charAt(i), i + 1);
            if (result != -1)
                return false;
        }
        return true;
    }

}
