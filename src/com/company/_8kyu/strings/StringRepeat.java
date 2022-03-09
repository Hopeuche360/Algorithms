package com.company._8kyu.strings;

public class StringRepeat {
    public static void main(String[] args) {
        System.out.println(repeatStr(3, "Hope"));
        System.out.println(repeatStrII(2, "Deen"));
    }

    //method 1
    public static String repeatStr(final int repeat, final String string) {
        int i = repeat;
        String repeatedString = "";
        while (i > 0) {
            repeatedString += string;
            i--;
        }
        return repeatedString;
    }

    //method 2
    public static String repeatStrII(final int repeat, final String string) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < repeat; i++) {
            stringBuilder.append(string);
        }
        return stringBuilder.toString();
    }

    //method 3
    public static String repeatStrIII(final int repeat, final String string) {
        return string.repeat(repeat);
    }

    public static String repeatIV(final int repeat, final String string) {
        String repeatedString = "";
        for (int i = 0; i < repeat; i++) {
            repeatedString += string;
        }
        return repeatedString;
    }
}
