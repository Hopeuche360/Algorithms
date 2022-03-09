package com.company._8kyu.strings;

import java.util.Arrays;

public class StringToArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(stringToArray("Our Father who lives in us")));
    }

    public static String[] stringToArray(String s) {
        //your code;
        return s.split(" ");
    }

}
