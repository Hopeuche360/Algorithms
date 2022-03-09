package com.company.sq010Algorithms.whiteboarding;

import java.util.Arrays;

public class SingleNumber {
    public static void main(String[] args) {
        int[] array = {4, 1, 2, 1, 2};
        System.out.println(singleNumber(array));
    }
    public static int singleNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == nums[i]) {
                    count++;
                }
            }
            if (count == 1) return nums[i];
        }
        return 0;
    }
}
