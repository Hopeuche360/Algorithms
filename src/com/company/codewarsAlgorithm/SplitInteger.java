package com.company.codewarsAlgorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SplitInteger {
    public static void main(String[] args) {
        int num = 10;
        int parts = 5;
        System.out.println(splitInteger(num, parts));
    }



    public static List<Integer> splitInteger(Integer num, Integer parts) {
        List<Integer> result = new LinkedList<>();
        while (parts > 0) {
            int divide = num/parts;
            result.add(divide);
            num -= divide;
            parts--;
        }
        return result;
    }
//
//    public static List<Integer> splitInteger(Integer num, Integer parts) {
//        int result1 = num/parts;
//        List<Integer> firstList = new ArrayList<>();
//        if ((num % parts) == 0){
//            while (parts > 0) {
//                firstList.add(result1);
//                num -= result1;
//                parts--;
//            }
//            return firstList;
//        }
//        return firstList;
//    }

//
//    public static List<Integer> splitInteger(Integer num, Integer parts) {
//        int result1 = num/parts;
//        List<Integer> firstList = new ArrayList<>();
//
//        int check = num % parts;
//        int first = result1 + check;
//        int second = result1 + 1;
//        int checker = 0;
//        List<Integer> secondList = new ArrayList<>();
//
//        if ((num % parts) == 0){
//            while (parts > 0) {
//                firstList.add(result1);
//                parts--;
//            }
//            return firstList;
//        } else {
//            while ( parts > 0) {
//                do {
//                    secondList.add(result1);
//                    checker += result1;
//                } while (checker < first);
//                do {
//                    secondList.add(second);
//                    checker += second;
//                } while (checker < num);
//            }
//        }
//        return secondList;
//    }
}
