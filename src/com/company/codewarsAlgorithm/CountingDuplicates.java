package com.company.codewarsAlgorithm;

public class CountingDuplicates {
    public static void main(String[] args) {
        String text = "daddy";
        System.out.println(duplicateCount(text));
    }

    public static int duplicateCount(String text) {
        //initialise count to hold the number of times valid duplicates appear
        int count = 0;
        //initialise temp to hold the checked duplicated characters
        String temp = "";
        //loop through the given string of text
        for (int i = 0; i < text.length(); i++) {
            //initialise present character and remaining characters
            String presentCharacter = text.toLowerCase().substring(i, i+1);
            String remainingCharacters = text.toLowerCase().substring(i+1);
            //check the conditions
            if (remainingCharacters.contains(presentCharacter)){
                if (!temp.contains(presentCharacter)) {
                    //store dplicate characters in temp an increase count
                    temp += presentCharacter;
                    count++;
                }
            }
        }
        return count;
    }
}
