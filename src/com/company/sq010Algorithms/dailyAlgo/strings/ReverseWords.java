package com.company.sq010Algorithms.dailyAlgo.strings;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWords {
    public static void main(String[] args) {
//        System.out.println(reverseWords("Hope is a beautiful, black girl"));
        System.out.println(reverseWordsII("Pod C algorithm session"));
    }

    //method 1
    public static String reverseWords(String str){
        //write your code here...
        String reversedWords = "";
        String[] words = str.split(" ");
        for (int i = words.length-1; i >= 0; i--) {
            reversedWords += words[i] + " ";
        }
        return reversedWords.trim();
    }

    public static String reverseWordsII(String str) {
        List words = Arrays.asList(str.split(" "));
        Collections.reverse(words);
        return String.join(" ", words);
    }

    //a work in progress
    public static String reverseWordsIII(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }

}
