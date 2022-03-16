package com.company.sq010Algorithms.dailyAlgo.strings;

import java.util.HashSet;

public class CharacterCounter {
    public static void main(String[] args) {
        System.out.println(validateWord("?^"));
    }

    public static boolean validateWord(String word) {
        // your code here
        HashSet<String> word_set = new HashSet<>();
        for (int i = 0; i < word.length(); i++) {
            word_set.add(String.valueOf(word.toLowerCase().charAt(i)));
        }
        return word.length() != 2 && word.length() % word_set.size() == 0;
    }
}
