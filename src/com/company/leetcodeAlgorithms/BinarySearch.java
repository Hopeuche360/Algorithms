package com.company.leetcodeAlgorithms;

import java.util.HashMap;
import java.util.Map;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        System.out.println(search(nums, target));
        System.out.println(searches(nums, target));
    }

    public static int search(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static int searches(int[] nums, int target) {
        Map<Integer, Integer> value = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            value.put(nums[i], i);
            if (value.containsKey(target)) {
                return i;
            }
        }
        return -1;
    }
}
