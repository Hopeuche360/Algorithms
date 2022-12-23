package com.company.hackerrank.implementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GradingStudents {
    public static void main(String[] args) {
        System.out.println(solve(new ArrayList<>(Arrays.asList(44, 84, 94, 21, 0, 18, 100, 18, 62, 30, 61, 53))));
//        System.out.println(gradingStudents(new ArrayList<>(Arrays.asList(73, 67, 38, 33))));
    }

    // 0(n) space complexity and 0(n) time complexity
    private static List<Integer> solve(List<Integer> grades) {
        List<Integer> result = new ArrayList<>();
        for (Integer grade : grades) {
            int check1 = grade + 1;
            int check2 = grade + 2;
            if (grade < 38 || (check1 % 5 != 0 && check2 % 5 != 0)) {
                result.add(grade);
            } else if (check1 % 5 == 0){
                result.add(check1);
            } else {
                result.add(check2);
            }
        }
        return result;
    }

}
