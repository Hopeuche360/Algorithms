package com.company.placementPreparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxMin {
    public static void main(String[] args) {
        System.out.println(solve(new ArrayList<>(List.of(-2, 1, -4, 5, 3))));
        System.out.println(minMaxSum(new ArrayList<>(List.of(-2, 1, -4, 5, 3))));
    }

    // O(nlogn)
    public static int solve(ArrayList<Integer> A) {
        Collections.sort(A);
        return A.get(0) + A.get(A.size()-1);
    }

    // O(n)
    public static int minMaxSum(ArrayList<Integer> A) {
        return Collections.min(A) + Collections.max(A);
    }
}
