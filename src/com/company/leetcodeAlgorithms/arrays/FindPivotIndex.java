package com.company.leetcodeAlgorithms.arrays;

public class FindPivotIndex {
    public static void main(String[] args) {
        System.out.println(findPivotIndex(new int[] {1, 7, 3, 6, 5, 6}));
    }

    static int findPivotIndex(int[] array) {
        int left = 0;
        int right = array.length-1;
        int sum_left = array[left];
        int sum_right = array[right];

        while (left < right) {
            if (sum_left > sum_right) {
                sum_right += array[right--];
//                right--;
            }
            if (sum_left < sum_right){
                sum_left += array[left++];
//                left++;
            }
            if (sum_left == sum_right) return left;
        }
        return 0;
    }
}
