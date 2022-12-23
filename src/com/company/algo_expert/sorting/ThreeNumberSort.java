package com.company.algo_expert.sorting;

import java.util.Arrays;

public class ThreeNumberSort {
    public static void main(String[] args) {
        int[] array = new int[] {1, 0, 0, -1, -1, 0, 1, 1};
        int[] order = new int[] {0, 1, -1};
        System.out.println(Arrays.toString(threeNumberSort(array, order)));
    }

    // O(n) time complexity, O(n) space complexity
    public static int[] threeNumberSort(int[] array, int[] order) {
        // Write your code here.
        int[] result = new int[array.length];
        int j = 0, k = 0;
        for (int value : array) {
            if (order[k] == value) {
                result[j++] = value;
            }
        }
        for (int value : array) {
            if (order[k+1] == value) {
                result[j++] = value;
            }
        }
        for (int value : array) {
            if (order[k+2] == value) {
                result[j++] = value;
            }
        }
        return result;
    }

    public static int[] threeNumberSortII(int[] array, int[] order) {
        int j = 0;
        for (int i = 0; i < array.length; i++) {

        }
        return array;
    }
}
