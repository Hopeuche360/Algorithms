package com.company._8kyu.strings;

import java.util.Arrays;

public class AbbreviateName {
    public static void main(String[] args) {
        System.out.println(abbrevName("Hope Chijuka Onyeka Baby"));
//        System.out.println(evenlySpaced(4, 6, 2));
    }

    public static String abbrevName(String name) {
        String initials = "";
        String[] strings = name.split(" ");
        for (int i = 0; i < name.length(); i++) {
            for (int j = 0; j < strings.length; j++) {

            }
        }
        return initials.toUpperCase();
    }

    public static boolean evenlySpaced(int a, int b, int c) {
        int[] array = {a, b, c};
        Arrays.sort(array);
        return array[1]-array[0] == array[2]-array[1];
    }
}
