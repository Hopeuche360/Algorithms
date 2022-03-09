package com.company._8kyu.strings;

public class FindNeedle {
    public static void main(String[] args) {
        Object[] hayStack = {"hay", "junk", "hay", "hay", "moreJunk", "needle", "randomJunk"};
        System.out.println(findNeedle(hayStack));
    }
    public static String findNeedle(Object[] haystack) {
        // Your code here
        int index = 0;
        for (int i = 0; i < haystack.length; i++) {
            if (haystack[i] == "needle") {
                index = i;
            }
        }
        return "found the needle at position " + index;
    }
}
