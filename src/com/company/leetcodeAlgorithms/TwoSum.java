package com.company.leetcodeAlgorithms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int [] nums = {3, 5, -4, 8, 11, 1, -1, 6};
        int target = 8;

        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    // with O(n) time complexity
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> value = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (value.containsKey(target - nums[i])) {
                return new int[] {value.get(target - nums[i]), i};
            }
            value.put(nums[i], i);
        }
        return null;
    }

    //with O(n^2) time complexity
    public static int[] twoNumberSum(int[] array, int targetSum) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if ((array[i] + array[j]) == targetSum) {
                    return new int[] {array[i], array[j]};
                }
            }
        }
        return new int[0];
    }
}
