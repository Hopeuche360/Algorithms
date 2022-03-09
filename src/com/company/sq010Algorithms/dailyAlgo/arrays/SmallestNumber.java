package com.company.sq010Algorithms.dailyAlgo.arrays;

import java.util.Arrays;

public class SmallestNumber {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(smallest(1000000)));
    }
    public static long[] smallest(long n) {
        String n_String = "" + n;
        String smallest = n_String;
        long smallest_i = 0;
        long smallest_j = 0;

        for (int i = 0; i < n_String.length(); i++) {
            for (int j = 0; j < n_String.length(); j++) {
                // skip the no-op case when i == j
                if (i == j) continue;
                String s2 = n_String.substring(0,i) + n_String.substring(i+1);
                s2 = s2.substring(0,j) + n_String.charAt(i) + s2.substring(j);
                if (smallest.compareTo(s2) > 0) {
                    smallest = s2;
                    smallest_i = i;
                    smallest_j = j;
                }
            }
        }
        return new long[]{Long.parseLong(smallest), smallest_i, smallest_j};
    }
}