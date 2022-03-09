package com.company.sortingAlgorithm;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int [] array = {9, 5, 4, 7, 2};
        System.out.println(Arrays.toString(insertionSort(array)));
    }
    public static int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int previous = i - 1;
            while(previous >= 0 && array[previous] > current) {
                array[previous+1] = array[previous];
                previous--;
            }
            array[previous+1] = current;
        }
        return array;
    }
}


//for (int i = 1; i < array.length; i++) {
//        int current = array[i];
//        int previous = i - 1;
//        while (previous >= 0 && array[previous] > current) {
//        array[previous + 1] = array[previous];
//        previous--;
//        }
//        array[previous + 1] = current;
//        }