package com.company.arrays.algorithmPractice;

import java.util.ArrayList;
import java.util.List;

public class ArraySubsequence {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>(List.of(5, 1, 22, 25, 6, -1, 8, 10));
        List<Integer> sequence = new ArrayList<>(List.of(5, -1, 8, 10));
        System.out.println(isValidSubsequence(array, sequence));
    }

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        // Write your code here.
        int sequenceIndex = 0;
        for (int value : array) {
            if (sequenceIndex == sequence.size()) break;
            if (sequence.get(sequenceIndex).equals(value)) sequenceIndex++;
        }
        return sequenceIndex == sequence.size();
    }

}
