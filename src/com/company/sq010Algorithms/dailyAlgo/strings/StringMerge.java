package com.company.sq010Algorithms.dailyAlgo.strings;

public class StringMerge {
    public static void main(String[] args) {
        System.out.println(stringMergeII("jason", "samson", 's'));
    }
//    method 1
    public static String stringMerge(String s1, String s2, char letter) {
        //write your adorable code here
        int s1_index = 0;
        int s2_index = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == letter) {
                s1_index = i;
                break;
            }
        }
        for (int i = 0; i < s2.length(); i++) {
            if (s2.charAt(i) == letter) {
                s2_index = i;
                break;
            }
        }
        return s1.substring(0, s1_index) + s2.substring(s2_index);
    }
    //method 2
    public static String stringMergeII(String s1, String s2, char letter) {
        return s1.substring(0, s1.indexOf(letter)) + s2.substring(s2.indexOf(letter));
    }
}
