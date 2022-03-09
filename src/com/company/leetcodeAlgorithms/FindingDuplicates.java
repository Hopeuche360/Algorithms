package com.company.leetcodeAlgorithms;

public class FindingDuplicates {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 3, 2, 1};
        System.out.println(duplicates(num));
    }
    public static int[] duplicates(int[] numbers) {
        int[] duplicateNumber = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            duplicateNumber[i] = numbers[i];
            for (int j = 0; j < numbers.length; j++) {
                if (duplicateNumber[j] == numbers[j]) {

                }
            }
        }
        return new int[] {};
    }
}
