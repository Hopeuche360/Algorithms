package com.company.hackerrank.string_manipulations;

public class CamelCase {
    public static void main(String[] args) {
        System.out.println(camelcase("greatIsThyFaithfulnessTowardsMe"));
    }

    public static int camelcase(String s) {
        // Write your code here
        if (s.length() == 0) return 0;
        int count = 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
                count++;
        }
        return count;
    }
}
