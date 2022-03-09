package com.company.arrays.algorithmPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortedSquaredArrays {
    public static void main(String[] args) {
        int[] array = {-10, -5, 0, 5, 10};
        System.out.println(Arrays.toString(sortedSquaredArray(array)));
    }

    public static int[] sortedSquaredArray(int[] array) {
        // Write your code here.
        int[] myArray = new int[array.length];
        int firstIndex = 0;
        int lastIndex = array.length-1;
        for (int i = array.length-1; i >= 0; i--) {
            int firstValue = array[firstIndex];
            int lastValue = array[lastIndex];
            if (Math.abs(firstValue) <= Math.abs(lastValue)) {
                myArray[i] = lastValue * lastValue;
                lastIndex--;
            } else {
                myArray[i] = firstValue * firstValue;
                firstIndex++;
            }
        }
        return myArray;
    }
}
