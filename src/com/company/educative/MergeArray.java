package com.company.educative;

import java.util.Arrays;

/**
 * In this problem, given two sorted arrays, you have to implement the int[] mergeArrays(int[] arr1, int[] arr2) method,
 * which returns an array consisting of all elements of both arrays in a sorted way.
 */
public class MergeArray {
    public static void main(String[] args) {
        int[] array1 = {2,3,5,6};
        int[] array2 = {1,4,7,8};
        System.out.println(Arrays.toString(mergeArrays(array1, array2)));
    }

    public static int[] mergeArrays(int[] array1, int[] array2) {
        // write your code here
        int[] mergedArray = new int[array1.length + array2.length];
        int i = 0, j = 0, k = 0;
        while (i < array1.length && j < array2.length) { //array1 = {2,3,5,6}..... array2 = {1,4,7,8}
            if (array1[i] < array2[j]) { //output-> mergedArray = {1,2,3,4,5,6,7,8}
                mergedArray[k++] = array1[i++];
            } else {
                mergedArray[k++] = array2[j++];
            }
        }
        while (i < array1.length) {
            mergedArray[k++] = array1[i++];
        }
        while (j < array2.length) {
            mergedArray[k++] = array2[j++];
        }
        return mergedArray;
    }
}