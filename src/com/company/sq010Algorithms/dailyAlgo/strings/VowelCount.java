package com.company.sq010Algorithms.dailyAlgo.strings;

import java.util.Arrays;
import java.util.List;

public class VowelCount {
    public static void main(String[] args) {
        System.out.println(getCountII("chijuka"));
    }

    public static int getCount(String str) {
        int vowelsCount = 0;
        // your code here
        String vowels = "aeiou";
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < vowels.length(); j++) {
                if (str.charAt(i) == vowels.charAt(j)) {
                    vowelsCount++;
                }
            }
        }

        return vowelsCount;
    }

    //method 2
    public static int getCountII(String str) {
        int vowelsCount = 0;
        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');
        for (int i = 0; i < str.length(); i++) {
            if (vowels.contains(str.charAt(i))) vowelsCount++;
        }
        return vowelsCount;
    }
}
