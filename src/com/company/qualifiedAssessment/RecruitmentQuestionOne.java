package com.company.qualifiedAssessment;

import java.util.ArrayList;
import java.util.List;

public class RecruitmentQuestionOne {
    public static void main(String[] args) {

    }

    public static int[] numberMultiples(int[] array) {
        List<Integer> multipliedArray = new ArrayList<>();
        int count = 0;
        if (array.length == 0) return array;
        for (int number : array) {
            multipliedArray.add(number * 2);
            count++;
            if (count == 5) {

            }
        }
        return new int[] {};
    }
}
