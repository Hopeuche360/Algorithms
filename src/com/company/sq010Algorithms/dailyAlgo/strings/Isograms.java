package com.company.sq010Algorithms.dailyAlgo.strings;

public class Isograms {
    public static void main(String[] args) {
        System.out.println(isIsogram("isograms"));
    }
    public static boolean isIsogram(String str) {
        // ...
        if (str.equals("")) return true;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) return false;
            }
        }
        return true;
    }
}
