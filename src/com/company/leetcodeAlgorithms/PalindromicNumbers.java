package com.company.leetcodeAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PalindromicNumbers {
    public static void main(String[] args) {
        int number = 404;
        System.out.println(isPalindrome(number));
    }

    public static boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        int lastElement = str.length()-1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(lastElement)) {
                lastElement--;
            } else {
                return false;
            }
        }
        return true;
    }
}
