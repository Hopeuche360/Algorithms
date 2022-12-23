package com.company.algo_expert.binary_search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = new int[] {0, 1, 21, 33, 45, 45, 61, 71, 72, 73};
        System.out.println(binarySearch(array, 33));
//        System.out.println(binarySearchWithRecursion(array, 73));
    }

    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length-1;

        while (left <= right) {
            int mid = Math.floorDiv((left + right), 2);
            if (array[mid] == target) return mid;
            else if (array[mid] < target) {
                left = mid+1;
            } else {
                right = mid-1;
            }
        }
        return -1;
    }

    //not working
    public static int binarySearchWithRecursion(int[] array, int target) {
        return doBinarySearch(array, target, 0, array.length-1);
    }
    public static int doBinarySearch(int[] array, int target, int left, int right) {
        if (left < right)
            return -1;

        int mid = (left+right) / 2;
        if (array[mid] == target)
            return mid;
        else if (array[mid] < target)
            doBinarySearch(array, target, mid+1, right);
        return doBinarySearch(array, target, left, mid-1);
    }
}
