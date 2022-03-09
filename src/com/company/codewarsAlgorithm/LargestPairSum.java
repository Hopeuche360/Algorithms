package com.company.codewarsAlgorithm;

import java.util.Arrays;

public class LargestPairSum {
    public static void main(String[] args) {
        int [] numbers = {10, 14, 2, 23, 19};
        System.out.println(largestPairSum(numbers));
    }
    public static int largestPairSum(int[] numbers){
        // your code here
        Arrays.sort(numbers);
        int result = numbers[numbers.length-1] + numbers[numbers.length-2];
        return result;
    }
}
