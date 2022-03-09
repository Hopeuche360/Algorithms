package com.company.sq010Algorithms.dailyAlgo.strings;

public class SentenceSmash {
    public static void main(String[] args) {
        String[] words = {"Hope", "has", "a", "dog"};
        System.out.println(smashII(words));
    }

    //method 1
    public static String smash(String... words) {
        // TODO Write your code below this comment please
        String sentence = "";
        for (String word : words) {
            sentence += word + " ";
        }
        return sentence.trim();
    }

    //method 2
    public static String smashII(String... words) {
        return String.join(" ", words);
    }
}
