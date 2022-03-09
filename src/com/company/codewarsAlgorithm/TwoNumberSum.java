package com.company.codewarsAlgorithm;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoNumberSum {
    public static void main(String[] args) {
        int [] nums = {3, 5, -4, 8, 11, 1, -1, 6};
        int target = 10;

        System.out.println(Arrays.toString(findTwoSum(nums, target)));
    }

    private static int[] findTwoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[] { numMap.get(complement), i };
            } else {
                numMap.put(nums[i], i);
            }
        }
        return new int[] {};
    }

    /**
     * The method below will solve th algorithm in O(n^2) time complexity
     */
    public static int[] twoNumberSum(int[] array, int targetSum) {
        // Write your code here.
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if ((array[i] + array[j]) == targetSum) {
                    return new int[] {array[i], array[j]};
                }
            }

        }

        return new int[0];
    }

    /**
     * Using a two-pointer technique will solve the problem in O(n) time complexity
     */
    public static int[] twooNumberSum(int[] array, int targetSum) {
        Arrays.sort(array);
        int left = 0;
        int right = array.length-1;
        int currentValue;

        while(left < right) {
            currentValue = array[left] + array[right];
            if (currentValue < targetSum) {
                left++;
            } else if (currentValue > targetSum) {
                right--;
            } else {
                return new int[] {array[left], array[right]};
            }
        }
        return new int[] {array[-1], array[-1]};
    }
}
