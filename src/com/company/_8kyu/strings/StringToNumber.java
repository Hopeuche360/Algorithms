package com.company._8kyu.strings;

public class StringToNumber {
    public static void main(String[] args) {
        System.out.println(convertToNum("-567"));
//        System.out.println(ascii('0'));
    }

    public static int convertToNum(String str) {
        int i = 0;
        int num = 0;
        boolean isNegative = false;

        if (str.charAt(0) == '-') {
            isNegative = true;
            i = 1;
        }

        while (i < str.length()) {
            num = num * 10;
            num = num + str.charAt(i++) - '0';
        }

        if (isNegative) {
            num = -num;
        }
        return num;
    }

    // method to check the int value of ascii characters
    public static int ascii(char value) {
        return value;
    }
}
