package com.company.leetcodeAlgorithms;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {3,99,-1,-100};
        int k = 2;
        System.out.println(Arrays.toString(rotateIII(nums, k)));
    }

    // O(n^2) time complexity and O(1) space
    public static int[] rotate(int[] nums, int k) {
        int temp;
        for (int i = 0; i < k; i++) {
            temp = nums[nums.length-1];
            System.arraycopy(nums, 0, nums, 1, nums.length-1);
            nums[0] = temp;
        }
        return nums;
    }

    // O(n) time complexity and O(n) space complexity
    public static int[] rotateII(int[] nums, int k) {
        int[] newNums = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
           newNums[(i + k) % nums.length] = nums[i];
        }
        System.arraycopy(newNums, 0, nums, 0, nums.length);
        return nums;
    }

//    O(n) time complexity and O(1) space complexity
    public static int[] rotateIII(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
        return  nums;
    }
    public static void reverse(int[] nums, int start, int end) {
        while(start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
