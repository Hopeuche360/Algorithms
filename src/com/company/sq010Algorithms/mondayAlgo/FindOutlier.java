package com.company.sq010Algorithms.mondayAlgo;

import java.util.ArrayList;
import java.util.List;

public class FindOutlier {
    public static void main(String[] args) {
        System.out.println(findOutlier(new ArrayList<>(List.of(2,4,0,4,11,2602,36))));
    }

    public static int findOutlier(ArrayList<Integer> integers) {
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for (Integer integer : integers) {
            boolean check = (integer % 2 == 0) ? even.add(integer) : odd.add(integer);
        }
        return (even.size() == 1) ? even.get(0) : odd.get(0);
    }
}
