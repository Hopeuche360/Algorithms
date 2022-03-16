package com.company.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlusMinus {
    public static void main(String[] args) {
        System.out.println(plusMinus(new ArrayList<>(Arrays.asList(1, 1, 0, -1, -1))));
    }

    public static int plusMinus(List<Integer> arr) {
        // Write your code here
        int positive_count = 0;
        int negative_count = 0;
        int zero_count = 0;

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) positive_count++;
            else if (arr.get(i) < 0) negative_count++;
            else zero_count++;
        }

        //there's a number format bug that needs to be fixed here
        double positive_fraction = positive_count / arr.size();
        double negative_fraction = negative_count / arr.size();
        double zero_fraction = zero_count / arr.size();
        System.out.format("%.5f\n", positive_fraction);
        System.out.format("%.5f\n", negative_fraction);
        System.out.format("%.5f", zero_fraction);
        return positive_count;
    }
}
