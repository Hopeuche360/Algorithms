package com.company.codewarsAlgorithm;

import java.util.ArrayList;
import java.util.List;

class Program {
    public static void main(String[] args) {
//        List<Integer> array = new ArrayList<Integer>(5, 1, 22, 25, 6, -1, 8, 10);
//        List<Integer> "sequence": [1, 6, -1, 10]
    }
    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        // Write your code here.
        List<Integer> holder = new ArrayList<>();
        if(array.size() >= sequence.size()) {
            for (int i = 0; i < array.size(); i++) {
                for(int j = 0; j < sequence.size(); j++) {
                    if (sequence.get(j) == array.get(i)) {
                        holder.add(sequence.get(j));
                        return true;
                    }
                }
            }
        }
            return false;
    }
}