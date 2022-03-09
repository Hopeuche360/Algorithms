package com.company.sq010Algorithms.mondayAlgo;

public class HasUniqueCharacter {
    public static void main(String[] args) {
        System.out.println(hasUniqueCharsII("abbcdefg"));
        System.out.println(hasUniqueChars("dfghjklkjhgfcvbnm"));
    }

    //method 1 O(n^2) time complexity
    public static boolean hasUniqueChars(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) return false;
            }
        }
        return true;
    }

    //method 2 O(n) time complexity
    public static boolean hasUniqueCharsII(String str) {
        for (int i = 0; i < str.length()-1; i++) {
            if (str.charAt(i) == str.charAt(i+1)) return false;
        }
        return true;
    }
}
