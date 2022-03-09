package com.company.sq010Algorithms.dailyAlgo.strings;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class AbreviateTwoWrodName {
    public static void main(String[] args) {
//        System.out.println(abbrevName("hope chijuka"));
        System.out.println(abbrevNameII("Goodluck Nwoko"));
        System.out.println();
    }

//    method 1
    public static String abbrevName(String name) {
        String initials = "";
        String[] names = name.split(" ");
        for (String word : names) {
            initials += word.charAt(0) + ".";
        }
        return initials.substring(0, 3).toUpperCase();
    }

//    method 2
    public static String abbrevNameII(String name) {
        String[] names = name.split(" ");
        return (names[0].charAt(0) + "." + names[1].charAt(0)).toUpperCase();
    }

}
