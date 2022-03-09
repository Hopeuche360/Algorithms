package com.company._8kyu.strings;

public class WellOfIdeas {
    public static void main(String[] args) {
        String[] givenKata = {"good", "bad", "bad", "good", "bad"};
        System.out.println(well(givenKata));
    }

    public static String well(String[] x) {
        // TODO
        int count = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] == "good") {
                count++;
            }
        }
        if (count == 1) return "publish!";
        else if (count >=2) return "I smell a series!";
        return "fail!";
    }
}
