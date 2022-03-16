package com.company.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class CountingTriplets {
    public static void main(String[] args) {
        List<Integer> a_array = new ArrayList<>();
        a_array.add(3);
        a_array.add(6);
        a_array.add(2);

        List<Integer> b_array = new ArrayList<>();
        b_array.add(6);
        b_array.add(2);
        b_array.add(3);

        System.out.println(compareTriplets(a_array, b_array));
    }

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        // Write your code here
        List<Integer> result = new ArrayList<>();
        int a_count = 0;
        int b_count = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) a_count++;
             else if (a.get(i) < b.get(i)) b_count++;
        }
        result.add(a_count);
        result.add(b_count);
        return result;
    }
}
