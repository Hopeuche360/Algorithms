package com.company.mondayAlgo;

import java.util.ArrayList;
import java.util.Arrays;

public class MininumSwaps10 {
    public static void main(String[] args) {
        ArrayList<Integer> ratings = new ArrayList<>(Arrays.asList(4, 3, 2, 1));
        System.out.println(minimumSwaps(ratings));
    }

    public static int minimumSwaps(ArrayList<Integer> ratings) {
        int count = 0;
        Integer[] arr = new Integer[ratings.size()];
        arr = ratings.toArray(arr);
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-1; j++) {
                if (arr[j] < arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    count++;
                }
            }
        }
        return count;
    }
}




//    public static int minimumSwaps(ArrayList<Integer> ratings) {
//        int left = 0;
//        int right = ratings.size() -1;
//        int temp = 0;
//
//        ratings.toArray();
//        while (ratings.get(left) < ratings.get(right)) {
//            temp = ratings.get(left);
//            ratings.get(right) = temp;
//            ratings.get(left) = ratings.get(right);
//
//            left++;
//            else{
//                right++;
//            }
//        }
//
//        return 0;
//    }