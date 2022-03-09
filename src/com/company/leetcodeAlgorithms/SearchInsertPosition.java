package com.company.leetcodeAlgorithms;

import java.util.Arrays;

/**
 *Given a sorted array of distinct integers and a target value, return the index if the target is found.
 * If not, return the index where it would be if it were inserted in order.
 */
public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6,7};
        int target = 2;
        System.out.println(searchInsert2(nums, target));
    }


    public static int searchInsert2(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        while(low <= high){
            int mid = (high + low)/2;
            if (nums[mid] == target) {
                return mid;
            } else if(nums[mid] > target) {
                high = mid -1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    // using O(n) runtime complexity
    public static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == target) {
                return i;
            } else if(nums[i] > target){
                return i;
            }
        }
        return 0;
    }
}
