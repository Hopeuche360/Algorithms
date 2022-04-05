package com.company.hackerrank.warmup;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlusMinus {
    public static void main(String[] args) {
        plusMinus(new ArrayList<>(Arrays.asList(1, 1, 0, -1, -1)));
    }

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        double positive_count = 0;
        double negative_count = 0;
        double zero_count = 0;

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) positive_count++;
            else if (arr.get(i) < 0) negative_count++;
            else zero_count++;
        }
        System.out.printf("%.6g%n", positive_count / arr.size());
        System.out.printf("%.6g%n", negative_count / arr.size());
        System.out.printf("%.6g%n", zero_count / arr.size());
    }
}
