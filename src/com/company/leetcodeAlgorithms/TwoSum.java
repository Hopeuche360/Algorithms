package com.company.leetcodeAlgorithms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int [] nums = {3, 5, -4, 8, 11, 1, -1, 6};
        int target = 8;
        System.out.println(Arrays.toString(twoSumII(nums, target)));
    }

    // using brute force method
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target)
                    return new int[] {i, j};
            }
        }
        return new int[] {-1, -1};
    }

    // using HashMap
    public static int[] twoSumII(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(target - nums[i])) {
                return new int[] {hashMap.get(target - nums[i]), i};
            }
            hashMap.put(nums[i], i);
        }
        return new int[] {-1, -1};
    }
}
