package com.company.algo_expert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductSum {
    public static void main(String[] args) {
        List<Object> array = new ArrayList<>(Arrays.asList(
                5, 2,
                new ArrayList<>(Arrays.asList(7, -1)),
                3,
                new ArrayList<>(Arrays.asList(6,
                        new ArrayList<>(Arrays.asList(-13, 8)), 4))));

        System.out.println(productSum(array));
    }

    public static int productSum(List<Object> array) {
        return doProductSum(array, 1);
    }

    public static int doProductSum(List<Object> array, int multiplier) {
        int sum = 0;
        for (Object value : array) {
            if (value instanceof ArrayList) {
                sum += doProductSum((List<Object>) value, multiplier+1);
            } else {
                sum += (int)value;
            }
        }
        return sum * multiplier;
    }
}
