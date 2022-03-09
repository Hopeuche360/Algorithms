package com.company.codewarsAlgorithm;

import java.util.Arrays;

public class RemovingParentheses {
    public static void main(String[] args) {
        String str = "(first group) (second group) (third group)";
        System.out.println(removeParentheses(str));

    }

    /**
     * The following method actually captures my thought process
     * in dealing with the question.
     */
//    public static String removeParentheses(final String str) {
////        String unwantedPartOfStr = "";
//        String[] strArray = str.split("()");
//        for (int i = 0; i < strArray.length; i++) {
//
//        }
//        String portion = Arrays.toString(strArray);
//        String subPortion = portion.substring(portion.indexOf("("), portion.indexOf(")")+1);
////        StringBuilder sb = new StringBuilder(portion);
//        System.out.println(portion);
//        String newGuy = portion.replace(subPortion, "");
//
//        System.out.println(newGuy.toString());
//        System.out.println(subPortion);
//
//        return newGuy;
//    }

//    public static String removeParentheses(final String str1) {
//        StringBuilder str = new StringBuilder(str1);
//        str.delete(str1.indexOf("("), str1.lastIndexOf(")")+1);
//
//        return str.toString(); // your code here
//    }
    public static String removeParentheses(final String str1) {
        int parenthesesChecker = 0;
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i)== '(') parenthesesChecker++;
            else if (str1.charAt(i)== ')') parenthesesChecker--;
            else if (parenthesesChecker == 0) {
                str.append(str1.charAt(i));
            }
        }
        return str.toString(); // your code here
    }
}
