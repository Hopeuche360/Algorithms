package com.company.leetcodeAlgorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]]
 * such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
 *
 * Notice that the solution set must not contain duplicate triplets.
 */
public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(nums));
    }

    public static List<List<Integer>> threeSum2(int[] nums) {
        List<List<Integer>> arr = new ArrayList<>();
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        for (int i = 0; i < nums.length; i++) {

        }
        return arr;
    }

    // time complexity of O(n^3)
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> myArray = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    if ((nums[i] + nums[j] + nums[k]) == 0) {
                        List<Integer> integers = new ArrayList<>();
                        integers.add(nums[i]);
                        integers.add(nums[j]);
                        integers.add(nums[k]);
                        Collections.sort(integers);
                        if (!myArray.contains(integers)) {
                            myArray.add(integers);
                        }
                    }
                }
            }
        }
        return myArray;
    }
}
