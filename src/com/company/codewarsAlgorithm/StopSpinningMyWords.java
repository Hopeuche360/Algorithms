package com.company.codewarsAlgorithm;

public class StopSpinningMyWords {
    public static void main(String[] args) {
        String sentence = "Hey fellow warriors";
        System.out.println(spinWords(sentence));
    }
    public static String spinWords(String sentence) {
        //TODO: Code stuff here
        String [] splitSentence = sentence.split(" ");
        for (String word : splitSentence) {
            if (word.length() >= 5) {
                StringBuilder wordSb = new StringBuilder(word);
                wordSb.reverse();
                sentence = sentence.replace(word, wordSb);
            }
        }
    return sentence;
    }
}
