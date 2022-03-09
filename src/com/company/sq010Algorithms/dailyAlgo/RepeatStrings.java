package com.company.sq010Algorithms.dailyAlgo;

public class RepeatStrings {
    public static void main(String[] args) {
        System.out.println(repeatStringII("Stanley", 5));
    }

    public static String repeatString(final Object toRepeat, final int n) {
        return toRepeat.toString().repeat(n);
    }

    public static String repeatStringII(final Object toRepeat, final int n) {
        String some = "";
        if (!toRepeat.equals(toRepeat.toString())) return "Not a string";
        for (int i = 0; i < n ; i++) {
            some += toRepeat;
        }
        return some;
    }
}
