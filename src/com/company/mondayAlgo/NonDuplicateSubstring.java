package com.company.mondayAlgo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class NonDuplicateSubstring {
    public static void main(String[] args) {
        String str = "amaka";
        System.out.println(longestSubstringWithoutDuplication(str));
    }

    public static String longestSubstringWithoutDuplication(String str) {
        String temp = "";
        int count = 0;
        if (str.length() == 1) {
            return str;
        } else if (str.equals("")) {
            return "";
        } else {
            for (int i = 0; i < str.length(); i++) {
                for (int j = i + 1; j < str.length(); j++) {
                    String strSubstrring = str.substring(i, j+1);
                    String[] stArr = strSubstrring.split("");
                    for (String value : stArr) {
                        if (strSubstrring.indexOf(value) != strSubstrring.lastIndexOf(value)) {
                            count++;
                        }
                    }
                    if (count == 0) {
                        if (strSubstrring.length() > temp.length()) {
                            temp = strSubstrring;
                        }
                    }
                }
            }
        }
        return temp;
    }

    public static String longestSubstringWithoutDuplicates(String str) {
        // Write your code here

        String temp = "";
        for (int i = 0; i < str.length(); i++) {
            String presentCharacter = str.toLowerCase().substring(i, i + 1);
            String remainingCharacters = str.toLowerCase().substring(i + 1);

            if (!remainingCharacters.contains(presentCharacter)) {
                return str;
            } else {
                temp += presentCharacter;
                if (!temp.contains(presentCharacter)) {
                    break;
                }
            }
        }
        return temp;
    }

//    public static int duplicateCount(String text) {
//        //initialise count to hold the number of times valid duplicates appear
//        int count = 0;
//        //initialise temp to hold the checked duplicated characters
//        String temp = "";
//        //loop through the given string of text
//        for (int i = 0; i < text.length(); i++) {
//            //initialise present character and remaining characters
//            String presentCharacter = text.toLowerCase().substring(i, i+1);
//            String remainingCharacters = text.toLowerCase().substring(i+1);
//            //check the conditions
//            if (remainingCharacters.contains(presentCharacter)){
//                if (!temp.contains(presentCharacter)) {
//                    //store dplicate characters in temp an increase count
//                    temp += presentCharacter;
//                    count++;
//                }
//            }
//        }
//        return count;
//    }
}
