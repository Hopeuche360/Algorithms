package com.company.hackerrank.warmup;

import java.util.ArrayList;
import java.util.List;

public class ArraySum {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(4);
        arrayList.add(4);
        arrayList.add(4);
        System.out.println(simpleArraySum(arrayList));
    }

    public static int simpleArraySum(List<Integer> ar) {
        // Write your code here
        int sum = 0;
        for(int i = 0; i < ar.size(); i++) {
            sum += ar.get(i);
        }
        return sum;
    }
}
