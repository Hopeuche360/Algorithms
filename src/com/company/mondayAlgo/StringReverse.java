package com.company.mondayAlgo;

public class StringReverse {
    public static void main(String[] args) {
        String word = "Palindrome";
        System.out.println(reverseStringI(word));
        System.out.println(reverseStringII("Process"));
    }
    //method one using String array method
    public static String reverseStringI(String word) {
        String[] str = word.split("");
        String temp = "";
        for (int i = str.length-1; i >= 0 ; i--) {
            temp = temp.concat(str[i]);
        }
        return temp;
    }

    public static String reverseStringII(String word) {
        String temp = "";
        for (int i = word.length()-1; i >= 0; i--) {
            temp += word.charAt(i);
        }
        return temp;
    }
}
