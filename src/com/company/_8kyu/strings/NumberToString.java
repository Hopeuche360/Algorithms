package com.company._8kyu.strings;

public class NumberToString {
    public static void main(String[] args) {
        System.out.println(numberToString(17));
    }

    public static String numberToString(int num) {
//        return Integer.toString(num);
//        return String.valueOf(num);
        return String.format("%d", num);
    }
}
