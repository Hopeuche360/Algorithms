package com.company.neetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Given an integer array nums,
 * return true if any value appears at least twice in the array,
 * and return false if every element is distinct.
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,1]
 * Output: true
 */
public class ContainsDuplicate {
    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[] {1,2,3,1}));
    }


    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> distinctNumbers = new HashSet<>();
        for (int num : nums) {
            distinctNumbers.add(num);
        }
        return distinctNumbers.size() != nums.length;
    }

    public static boolean containsDuplicateII(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, num);
            } else return true;
        }
        return false;
    }


    public boolean containsDuplicateIII(int[] nums) {
        // develop this thought process
        int iterator = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[iterator]) return true;
            else iterator++;
        }
        return false;
    }


}
