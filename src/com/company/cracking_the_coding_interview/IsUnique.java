package com.company.cracking_the_coding_interview;

public class IsUnique {
    /**
     * Implement an algorithm to determine if a string has all unique characters.
     * What if you cannot use additional data structures?
     */
    public static void main(String[] args) {
        System.out.println(isUnique("Chijuka"));
    }


    // time complexity = O(n), space complexity = O(1)
    static boolean isUnique(String str) { //assume string comprises 128 ascii characters only
        if (str.length() > 128) return false;

        boolean[] char_set = new boolean[128];
        for (int i =0; i < str.length(); i++) {
            char value = str.charAt(i);
            if (char_set[value]) return false;
            char_set[value] = true;
        }
        return true;
    }

    /**
     * Compare every character of the string to every other character of the string.
     * This will take 0(n^2) time and 0(1) space.
     *
     * Use a hashset and compare the length if using extra data structure is allowed,
     *
     * Sort the string and compare each character with the next, this will take O(nlogn) time and O(1) space
     */

}
