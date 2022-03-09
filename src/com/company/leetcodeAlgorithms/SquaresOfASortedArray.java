package com.company.leetcodeAlgorithms;

import java.sql.Array;
import java.util.Arrays;
import java.util.Map;

/**
 * Given an integer array nums sorted in non-decreasing order,
 * return an array of the squares of each number sorted in non-decreasing order.
 */
public class SquaresOfASortedArray {
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }

    public static int[] sortedSquares(int[] nums) {
       int[] value = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            value[i] = (int) Math.pow(nums[i], 2);
        }
        Arrays.sort(value);
        return value;
    }
}
