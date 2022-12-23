package com.company.arrays;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(binarySearch(new int[] {0, 1, 21, 33, 45, 45, 61, 71, 72, 73}, 33));
    }

    private static String binarySearch(int[] array, int target) {
        Arrays.sort(array); // {1, 4, 7, 8, 10, 13, 25, 34}
        int left = 0;
        int right = array.length-1;
        int mid = (left + right) / 2; //8
        while (left < right) {
            if (target < array[mid]) {
                right = mid;
                mid = (left + right) / 2;
            } else if (target > array[mid]){
                left = mid + 1;
                mid = (left + right) / 2;
            } else return "found at " + mid;
        }
        return "Not found";
    }

    private static void fib(int n){

    }

//    private static String binSearch(int [] array, int target){
//        var start = 0; var end = array.length - 1; var mid = (start + end) / 2;
//        Arrays.sort(array);
//        if (mid == target) {
//            return "Awesome";
//        }else if (mid == start || mid == end){
//            return "Chai";
//        }else if(mid > target){
//            end = mid;
//            sortedArray = Arrays.copyOfRange(array, start, end);
//            binSearch(Arrays.copyOfRange(array, mid, end), target);
//        }else {
//            start = mid;
//            sortedArray = Arrays.copyOfRange(sortedArray, start, end);
//            binSearch(Arrays.copyOfRange(array, start ,mid))
//        }
//    }

}
