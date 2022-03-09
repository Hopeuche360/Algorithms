package com.company.sq010Algorithms.tuesdayAlgo;

public class BreakChocolate {
    public static void main(String[] args) {
        System.out.println(breakChocolate(7, 4));
    }

    public static int breakChocolate(int n, int m) {
        return n == 0 || m == 0 ? 0 : (n * m) - 1;
    }
}
