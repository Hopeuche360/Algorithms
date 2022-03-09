package com.company._8kyu.strings;

public class RemoveStringSpace {
    public static void main(String[] args) {
        System.out.println(noSpaceII("remove whitespace in this sentence"));
    }

    public static String noSpace(final String x) {
        return x.replace(" ", "");
    }

    // method 2

    public static String noSpaceII(final String string) {
        String newString = "";
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != ' ') {
                newString += string.charAt(i);
            }
        }
        return newString;
    }
}
