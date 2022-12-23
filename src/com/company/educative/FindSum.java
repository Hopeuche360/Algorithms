package com.company.educative;

import java.util.*;

public class FindSum {
    public static void main(String[] args) {
        int[] array = {3, 2, 7, 15, 7};
//        System.out.println(Arrays.toString(findSum(array, 9)));
        System.out.println(Arrays.toString(findSumII(array, 9)));
        System.out.println(Arrays.toString(findSumIII(array, 9)));
    }

    //using ArrayList
    public static int[] findSumII(int[] array, int target) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < array.length; i++) {
            if(list.contains(target - array[i])) {
                return new int[] {list.get(target - array[i]), i};
            }
            list.add(array[i]);
        }
        return new int[0];
    }

    // using HashTable (HashMap)
    public static int[] findSumIII(int[] array, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(target - array[i])) {
                return new int[] {i, map.get(target-array[i])};
            }
            map.put(array[i], i);
        }
        return new int[0];
    }


//    BruteForce
    public static int[] findSum(int[] array, int target) { //3,2,15,7
        for(int i = 0; i < array.length; i++) {
            for(int j = i+1; j < array.length; j++) {
                if(array[i] + array[j] == target) return new int[] {i, j};
            }
        }
        return new int[0];
    }

}
