package com.company.codewarsAlgorithm;

import java.util.Arrays;

public class DigiCoreNo2 {
    public static void main(String[] args) {
        int [] tom = {1, 4, 7, 2, 4};
        int [] jack = {3, 4, 2, 4, 4};

        System.out.println(Arrays.toString(overallScore(tom, jack)));
    }

    public static int[] overallScore(int[] tom, int[] jack) {
        int tomCount = 0;
        int jackCount = 0;

        for (int i = 0; i < 5; i++) {
            if (tom[i] > jack[i]) {
                tomCount++;
            } if (tom[i] < jack[i]) {
                jackCount++;
            }
        }
        return new int[] {tomCount, jackCount};
    }
}
