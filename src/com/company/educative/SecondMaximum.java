package com.company.educative;

public class SecondMaximum {
    public static void main(String[] args) {
        int[] array = {9, 4, 3, 8};
        System.out.println(findSecondMax(array));
        System.out.println(findSecondMaxII(array));
    }

    private static int findSecondMax(int[] array) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : array) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax) secondMax = num;
        }
        return secondMax;
    }

    private static int findSecondMaxII(int[] array) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int num : array) {
            if (num > max) max = num;
        }

        for (int num : array) {
            if (num > secondMax && num < max) secondMax = num;
        }
        return secondMax;
    }
}
