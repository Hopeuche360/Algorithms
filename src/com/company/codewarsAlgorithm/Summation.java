package com.company.codewarsAlgorithm;

public class Summation {
    public static void main(String[] args) {
        int num = 8;
        System.out.println(sum(num));
    }
    public static int sum(int num) {
        int temp = 0;
        for (int i = 1; i <= num ; i++) {
            temp += i;
        }
        return temp;
    }
}
