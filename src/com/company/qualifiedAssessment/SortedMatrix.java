package com.company.qualifiedAssessment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortedMatrix {
    public static void main(String[] args) {
        List<List<Integer>> array = Arrays.asList(Arrays.asList(1, 4, 7, 12, 15, 1000),
                Arrays.asList(2, 5, 19, 31, 32, 1001),
                Arrays.asList(3, 8, 24, 33, 35, 1002),
                Arrays.asList(40, 41, 42, 44, 45, 1003),
                Arrays.asList(99, 100, 103, 106, 128, 1004));

        System.out.println(searchInSortedMatrix(array, 44));
    }

    public static Object searchInSortedMatrix(List<List<Integer>> matrix, int target) {
        List<Integer> array = new ArrayList<>();
        for (int i = 0; i < matrix.size(); i++) {
            for (int j = 0; j < matrix.size(); j++) {
                if (matrix.contains(target)) {
                    return new List[]{matrix.get(i), matrix.get(j)};
                }
            }
        }
        return Arrays.asList(-1, -1);
    }
}
