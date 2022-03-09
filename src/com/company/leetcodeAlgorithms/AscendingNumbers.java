package com.company.leetcodeAlgorithms;

public class AscendingNumbers {
    public static void main(String[] args) {
        String s = "1 box has 4 blue 3 red 6 green and 12 yellow marbles";
        System.out.println(areNumbersAscending(s));
    }
    public static boolean areNumbersAscending(String s) {
        int previous = 0;
        String[] elements = s.split(" ");
        for (String element : elements) {
            if (element.charAt(0) >= 48 && element.charAt(0) <= 57) {
                int number = Integer.parseInt(element);
                if (number > previous) {
                    previous = number;
                } else {
                    return false;
                }
            }
        }
         return true;
    }
}

