package com.company.codewarsAlgorithm;

public class Challenge {
    public static void main(String[] args) {
        String str = "abcdbbefg";
        System.out.println(hasUniqueChars(str));
    }

    public static boolean hasUniqueChars(String str) {
        String temp="";
        for (int i = 0; i < str.length(); i++) {
            String presentCharacter = str.substring(i, i+1);
            String remainingCharacters = str.substring(i+1);
            if (remainingCharacters.contains(presentCharacter)){
                temp += presentCharacter;
                return false;
            }
        }
        return true;
    }
}
