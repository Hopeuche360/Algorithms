package com.company.codewarsAlgorithm;

import java.math.BigInteger;
import java.util.ArrayList;

public class RecursiveProgramming {
    public static void main(String[] args) {
        System.out.println(fibSequenceWithoutRecursion(10));
//        System.out.println(fibSequenceWithRecursion(5));
//        System.out.println(findFibValueAtGivenIndex(10));
        System.out.println(findFactorialWithoutRecursion(5));
        System.out.println(findFactorialWithRecursion(5));
    }

    public static int fibSequenceWithoutRecursion(int count) { // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 ...
        if (count == 0 || count == 1) return count;
        int first = 0;
        int second = 1;
        int num = 0;
        while (count > 2) {
            num = first + second;
            first = second;
            second = num;
            count--;
        }
        return num;
    }

    public static int findFibValueAtGivenIndex(int index) {
        int first = 0, second = 1, num, i = index;
        if (index == 0) return 0;
        else if (index == second) return 1;
        return findFibValueAtGivenIndex(index - 1) + findFibValueAtGivenIndex(index -2);
//        else {
//            ArrayList<BigInteger> fibList = new ArrayList<>();
//            while (index + 1 > 0) {
//                num = first + second;
//                fibList.add(BigInteger.valueOf(first));
//                first = second;
//                second = num;
//                index--;
//            }
//            System.out.println(fibList);
//            return fibList.get(i);
//        }
    }

    public static int fibSequenceWithRecursion(int count) { // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 ...
        if (count == 2) return 1;
        else if (count == 1) return 0;
        return fibSequenceWithRecursion(count -1) + fibSequenceWithRecursion(count -2);
    }

    public static int findFactorialWithoutRecursion(int number) { //5*4*3*2*1
        int product = 1;
        while (number > 0) {
            product *= number;
            number--;
        }
        return product;
    }

    public static int findFactorialWithRecursion(int number) {
        if (number == 1 || number == 0) return number;
        return number * findFactorialWithRecursion(number -1);
    }

}
