package com.company.cracking_the_coding_interview;

import java.util.Arrays;

/**
 * Given two strings, write a method to decide if one is a permutation of the other.
 * permutation is when two words have the same character counts
 */
public class CheckPermutation {
    public static void main(String[] args) {
        System.out.println(isPermutation("abcd", "dabc"));
    }

    static boolean checkPermutation(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        char[] str1_array = str1.toCharArray();
        char[] str2_array = str2.toCharArray();

        Arrays.sort(str1_array);
        Arrays.sort(str2_array);

        return Arrays.toString(str1_array).equals(Arrays.toString(str2_array));
    }

    static boolean isPermutation(String str1, String str2) { // str1: "read", str2: "dear"
        if (str1.length() != str2.length()) return false;

        int[] letters = new int[128];

        //convert string one to a character array
        char[] str1_array = str1.toCharArray();
        // store 1 in place of
        for (char character : str1_array) {
            letters[character]++;
        }

        for (int i = 0; i < str2.length(); i++) {
            int character = str2.charAt(i);
            letters[character]--;
            if (letters[character] < 0) return false;
        }
        return true;
    }
}
