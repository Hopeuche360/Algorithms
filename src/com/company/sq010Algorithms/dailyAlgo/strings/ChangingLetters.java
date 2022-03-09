package com.company.sq010Algorithms.dailyAlgo.strings;

import java.util.Arrays;
import java.util.List;

public class ChangingLetters {
    public static void main(String[] args) {
        System.out.println(swap("event"));
    }

    //method 1
    public static String swap(String st){
        String change = "";
        String[] str = st.split("");
        String vowels = "aeiou";
        for (String letter : str) {
            if (vowels.contains(letter)) {
                change += letter.toUpperCase();
            } else {
                change += letter;
            }
        }
        return change;
    }

}
