package com.company.educative;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] array = {5, 4, 3, 2, 1};
        int target = 3;
        System.out.println(Arrays.toString(rotateArray(array, target)));
    }

    private static int[] rotateArray(int[] array, int num) {
        while (num > 0) {
            int lastIndex = array.length-1;
            int lastElement = array[lastIndex];
            for (int i = lastIndex; i > 0; i--) {
                array[i] = array[i-1];
            }
            array[0] = lastElement;
            num--;
        }
        return array;
    }


}
