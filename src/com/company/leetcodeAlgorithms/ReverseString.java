package com.company.leetcodeAlgorithms;

public class ReverseString {
    public static void main(String[] args) {
        char[] s = {'h','e', 'l', 'b', 'o'};
        System.out.println(stringReversal("algorithm"));
        System.out.println(stringReversalII("algorithm"));
        System.out.println(stringReversalIII("algorithm"));
//        System.out.println(reverseString(s));
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

    public static String stringReversal(String input) {
        StringBuilder sb = new StringBuilder(input);
        sb.reverse();
        return sb.toString();
    }

    public static String stringReversalII(String input) {
        String[] inputArr = input.split("");
        String output = "";
        for (int i = inputArr.length-1; i >= 0; i--) {
            output += inputArr[i];
        }
        return output;
    }

    public static String stringReversalIII(String input) {
        String output = "";
        for (int i = input.length()-1; i >= 0; i--) {
            output += input.charAt(i);
        }
        return output;
    }
}
