package com.company.educative;

import java.util.Arrays;

public class RearrangeArray {
    public static void main(String[] args) {
        int[] array = {10, -1, 20, 4, 5, -9, -6};
        System.out.println(Arrays.toString(reArrange(array)));
        System.out.println(Arrays.toString(reArrangeII(array)));
    }
    //brute force
    public static int[] reArrange(int[] arr) {
        int[] sortedArray = new int[arr.length];
        int index = 0;
        for (int num : arr) {
            if (num < 0) {
                sortedArray[index++] = num;
            }
        }
        for (int num : arr) {
            if (num > 0) {
                sortedArray[index++] = num;
            }
        }
        return sortedArray;
    }

    public static int[] reArrangeII(int[] array) {
        int index = 0;
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                temp = array[i];
                array[i] = array[index];
                array[index] = temp;
                index++;
            }
        }
        return array;
    }
}
