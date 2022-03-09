package com.company.codewarsAlgorithm;

import java.util.Arrays;

/**
 * java program to implement insertion sort algorithm
 */
public class SortingAlgorithm_InsertionSort {
    public static void main(String[] args) {
        int [] array = {8, 5, 2, 9, 5, 6, 3};
        System.out.println(bubbleSort(array));
    }
    public static int[] bubbleSort(int[] array) {
        // Write your code here.
        Arrays.sort(array);
        return array;
    }
}
