package com.company.hackerrank.warmup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiagonalDifference {
    public static void main(String[] args) {
        List<List<Integer>> array = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9));

        System.out.println(diagonalDifference(array));
    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int sum_left = 0;
        int sum_right = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum_left += arr.get(i).get(i);
            sum_right += arr.get(i).get((arr.size() -1) - i);
        }
        return Math.abs(sum_right - sum_left);
    }
}
