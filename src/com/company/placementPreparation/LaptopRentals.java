package com.company.placementPreparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LaptopRentals {
    public static void main(String[] args) {
        int[][] times = {{1,5}, {5,6}, {6,7}, {7,9}};
    }

    public static Integer laptopRentals(List<List<Integer>> times) {

        if (times.size() == 0) return 0;
        List<Integer> startTimes = times.stream().map(l -> l.get(0)).collect(Collectors.toList());
        List<Integer> endTimes = times.stream().map(l -> l.get(1)).collect(Collectors.toList());
        Collections.sort(startTimes);
        Collections.sort(endTimes);
        int startIndex = 0;
        int endIndex = 0;
        int count = 0;
        while (startIndex < startTimes.size()) {
            if (startTimes.get(startIndex) >= endTimes.get(endIndex)) {
                count--;
                endIndex++;
            }
            count++;
            startIndex++;
        }
        return count;
    }


}
