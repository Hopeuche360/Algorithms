package com.company.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BirthdayCakeCandles {
    public static void main(String[] args) {
        System.out.println(birthdayCakeCandles(
                new ArrayList<>(Arrays.asList(4, 4, 1, 3, 4))));
    }

    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        int tallest_candle = Integer.MIN_VALUE;
        int count = 0;
        for (int i = 0; i < candles.size(); i++) {
            if (candles.get(i) > tallest_candle){
                tallest_candle = candles.get(i);
                count = 1;
            } else if (tallest_candle == candles.get(i)) count++;
        }
        return count;
    }
}
