package com.company.sq010Algorithms.mondayAlgo;

import java.util.ArrayList;

public class Divisors {
    public static void main(String[] args) {
        System.out.println(divisors(12));
    }

    public static ArrayList<Integer> divisors(int n) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 2; i < n; i++) {
            if (n % i == 0) result.add(i);
        }
        return result;
    }
}
