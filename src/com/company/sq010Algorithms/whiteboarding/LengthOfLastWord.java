package com.company.sq010Algorithms.whiteboarding;

public class LengthOfLastWord {
    public static void main(String[] args) {
        System.out.println(lastWordLength("Hope Chijuka is a woman"));
    }
    public static int lastWordLength(String words) {
        String[] wordArray = words.split(" ");
        return wordArray[wordArray.length-1].length();
    }
}
