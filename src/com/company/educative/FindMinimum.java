package com.company.educative;

import java.util.Arrays;

public class FindMinimum {
    public static void main(String[] args) {
        int[] array = {4, 2, 5, 1, 0};
        System.out.println(findMinimum(array));
        System.out.println(findMinimumII(array));
    }

    //time complexity = O(n)
    private static int findMinimum(int[] array) {
        int minValue = Integer.MAX_VALUE;
        for (int num : array) {
            if (num < minValue)
                minValue = num;
        }
        return minValue;
    }


    private static int findMinimumII(int[] array) {
        Arrays.sort(array);
        return array[0];
    }


}
