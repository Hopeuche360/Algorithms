package com.company.interswitch;

import java.util.HashMap;

public class ArraySum {
    public static void main(String[] args) {
        int[] array = {3, 2, 5, 9, 7};
        int value = 30;
        System.out.println(arraySum(array, value));
    }

    public static boolean arraySum(int[] array, int value) { // {3, 2, 5, 9, 7} value = 12
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if(hashMap.containsKey(value - array[i])) {
                return true;
            }
            hashMap.put(array[i], i);
        }
        return false;
    }
}
