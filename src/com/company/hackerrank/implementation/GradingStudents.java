package com.company.hackerrank.implementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GradingStudents {
    public static void main(String[] args) {
        System.out.println(gradingStudents(new ArrayList<>(Arrays.asList(73, 67, 38, 33))));
    }

    private static int[] solve(int[] grades) {
        // Complete this function
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] >= 38) {
                if (grades[i] % 5 > 2) grades[i] += 5 - (grades[i] % 5);
            }
        }
        return grades;
    }

    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        List<Integer> upgrade = new ArrayList<>();
        List<Integer> multiples_5 = new ArrayList<>(Arrays.asList(40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90, 95, 100));
        for (int i = 0; i < grades.size(); i++) {
            if (grades.get(i) < 38)
                upgrade.add(grades.get(i));
            for (int j = 0; j < multiples_5.size(); j++) {
                if (multiples_5.get(j) == grades.get(i) + 3
                    || multiples_5.get(j) == grades.get(i) + 2
                    || multiples_5.get(j) == grades.get(i) + 1)
                upgrade.add(multiples_5.get(j));
                else upgrade.add(grades.get(i));
            }
        }
        return upgrade;
    }
}
