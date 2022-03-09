package com.company.codewarsAlgorithm;

import java.util.ArrayList;
import java.util.List;

public class NumParts {
    public static void main(String[] args) {
        int num = 15;
        int parts = 3;
        System.out.println(numParts(num, parts));
    }

    /**
     * divide num into several equal parts
     */
    public static List numParts(int num,int parts) {
        List result = new ArrayList<>();
        while (num > 0) {
           int answer = num / parts;
            result.add(answer);
            num -= answer;
            parts -= 1;
        }
        return result;
    }
}
