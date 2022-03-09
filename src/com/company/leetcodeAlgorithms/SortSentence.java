package com.company.leetcodeAlgorithms;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class SortSentence {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        Map<String, String> name = new Hashtable<>();
        name.put("4", "fhgjh");
        name.put("2", "fhhh");
        name.put("5", "fhhggh");
        name.put("1", "fhhhiii");
        System.out.println(sortSentence(s));
        System.out.println(name);
    }

    public static String sortSentence(String s) {
        String temp = "";
        String[] words = s.split(" ");
        Map<Integer, String> sentence = new TreeMap<>();
        for (int i = 0; i < words.length; i++) {
            char num = words[i].charAt(words[i].length()-1);
            int number = Integer.parseInt(String.valueOf(num));

            sentence.put(number, words[i].substring(0, words[i].length()-1));
        }
        for (Map.Entry<Integer, String> entry : sentence.entrySet()) {
           temp += entry.getValue() + " ";
        }
        return temp.trim();
    }
}

