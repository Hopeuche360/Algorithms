package com.company.sortingAlgorithm;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {14, 12, 7, 8, 4};
        System.out.println(Arrays.toString(mergeSort(arr)));
    }

    public static int[] mergeSort(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }

        int midIndex = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, midIndex);
        int[] right = Arrays.copyOfRange(arr, midIndex+1, arr.length);

        // STEP 2: sort each half
        int[] sortedLeft  = mergeSort(left);
        int[] sortedRight = mergeSort(right);

        // STEP 3: merge the sorted halves
        int[] sortedArray = new int[arr.length];

        int currentLeftIndex  = 0;
        int currentRightIndex = 0;

        for (int currentSortedIndex = 0; currentSortedIndex < arr.length;
             currentSortedIndex++) {

            // sortedLeft's first element comes next
            // if it's less than sortedRight's first
            // element or if sortedRight is exhausted
            if (currentLeftIndex < sortedLeft.length
                    && (currentRightIndex >= sortedRight.length
                    || sortedLeft[currentLeftIndex] < sortedRight[currentRightIndex])) {
                sortedArray[currentSortedIndex] = sortedLeft[currentLeftIndex];
                currentLeftIndex++;
            } else {
                sortedArray[currentSortedIndex] = sortedRight[currentRightIndex];
                currentRightIndex++;
            }
        }
        return sortedArray;
    }
}
