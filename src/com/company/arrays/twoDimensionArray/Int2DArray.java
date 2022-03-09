package com.company.arrays.twoDimensionArray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Int2DArray {
    public static void main(String[] args) {
        int [][] arr = {{1, 2, 3, 4}, {3, 4, 5, 6}, {6, 7, 10, 78}};
        int value = 78;
        System.out.println(findAndDeleteValue(arr, value));
        System.out.println(Arrays.deepToString(arr));
    }

    public static String findAndDeleteValue(int[][] arr, int value) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[0].length; col++) {
                if (arr[row][col] == value) {
                    arr[row][col] = 0;
                    return "value has been deleted successfully";
                }
            }
        }
        return "Value not found";
    }
}
