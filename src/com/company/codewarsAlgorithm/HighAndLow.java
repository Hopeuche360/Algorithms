package com.company.codewarsAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HighAndLow {
    public static void main(String[] args) {
        String numbers = "8 3 -5 42 -1 0 0 -9 4 7 4 -4";
        System.out.println(highAndLow(numbers));

    }

    public static String highAndLow(String numbers) {
        String[] splitNumbers = numbers.split(" ");
        List<Integer> objects = new ArrayList<>();
        Arrays.stream(splitNumbers).forEach(value -> objects.add(Integer.parseInt(value)));
        System.out.println(objects);
        Collections.sort(objects);

        Integer highestNumber = objects.get(splitNumbers.length - 1);
        Integer lowestNumber = objects.get(0);

        String solution = highestNumber + " " + lowestNumber;

        return solution;
    }

//    public static String highAndLow(String numbers) {
//        int minimumNumber = Integer.MAX_VALUE;
//        int maximumNumber = Integer.MIN_VALUE;
//        String[] splitNumber = numbers.split(" ");
//        for (int i = 0; i < splitNumber.length; i++) {
//            int workingNumber = Integer.parseInt(splitNumber[i]);
//            if (workingNumber > maximumNumber) {
//                maximumNumber = workingNumber;
//            }
//            else if (workingNumber < minimumNumber) {
//                minimumNumber = workingNumber;
//            }
//        }
//        String answer = maximumNumber + " " + minimumNumber;
//
//        return answer;
//    }
}
