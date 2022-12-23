package com.company.sq010Algorithms.mondayAlgo;

import java.util.ArrayList;

public class AccummulateStrings {
    public static void main(String[] args) {
        System.out.println(accum("ZpglnRxqenU"));
    }

    public static String accum(String str) {
        String[] strSplit = str.toUpperCase().split("");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) > 90) {
                int uppercase = str.charAt(i) - 32;
                char uppercase1 = (char) uppercase;
                stringBuilder.append(uppercase1).append(strSplit[i].toLowerCase().repeat(i)).append("-");
            } else {
                stringBuilder.append(str.charAt(i)).append(strSplit[i].toLowerCase().repeat(i)).append("-");
            }
        }
        stringBuilder.deleteCharAt(stringBuilder.length()-1);
        return stringBuilder.toString();
    }
}
