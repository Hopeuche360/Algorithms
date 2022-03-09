package com.company._8kyu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReversedSequence {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverse(9)));
        System.out.println(Arrays.toString(reverseII(18)));
    }
    public static int[] reverse(int n){
        //your code
        int[] nSequence = new int[n];
        int index = 0;
        for (int i = n; i > 0; i--) {
            nSequence[index] = i;
            index++;
        }
        return nSequence;
    }

    public static Object[] reverseII(int n){
        List<Integer> list = new ArrayList<>();
        for (int i = n; i > 0; i--) {
            list.add(i);
        }
        return list.toArray();
    }
}
