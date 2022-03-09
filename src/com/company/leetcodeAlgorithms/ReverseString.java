package com.company.leetcodeAlgorithms;

public class ReverseString {
    public static void main(String[] args) {
        char[] s = {'h','e', 'l', 'b', 'o'};
        System.out.println(reverseString(s));
    }

    public static String reverseString(char[] s) {
        String str = String.valueOf(s);
        String temp = "";
        int index = str.length()-1;
        for (int i = 0; i < str.length(); i++) {
            temp += str.charAt(index);
            index--;
        }
        return temp;
    }

    public static char[] reversedString(char[] sentence) {
        char[] temp = new char[sentence.length];
        int index = sentence.length-1;
        for (int i = 0; i < sentence.length; i++) {
            temp[i] += sentence[index];
            index--;
        }
        return temp;
    }
}
