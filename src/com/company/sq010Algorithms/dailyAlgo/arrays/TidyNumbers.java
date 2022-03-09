package com.company.sq010Algorithms.dailyAlgo.arrays;

public class TidyNumbers {
    public static void main(String[] args) {
//        System.out.println(tidyNumber(12577));
        System.out.println(tidyNumberII(1789));
    }

    // method 1
    public static boolean tidyNumber(int number) {
        String temp = Integer.toString(number);
        int[] numbers = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            numbers[i] = temp.charAt(i) - '0';
        }
        for (int i = 0; i <= numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) return false;
            }
        }
        return true; // Do your magic!
    }

    //optimal solution
    public static boolean tidyNumberII(int number) {
        String temp = Integer.toString(number);
        char[] numbers = temp.toCharArray();
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i-1] > numbers[i]) return false;
        }
        return true;

    }

}
