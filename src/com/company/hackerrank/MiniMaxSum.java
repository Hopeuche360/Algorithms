package com.company.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MiniMaxSum {
    public static void main(String[] args) {
        miniMaxSum(new ArrayList<>(Arrays.asList(7, 69, 2, 221, 8974)));
    }

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        long min_sum = 0;
        long max_sum = 0;
        Collections.sort(arr);
        for (int i = 0; i < arr.size() - 1; i++) {
            min_sum += arr.get(i);
        }
        for (int i = arr.size()-1; i > 0; i--) {
            max_sum += arr.get(i);
        }
        System.out.print(min_sum + " " + max_sum);
    }
}
