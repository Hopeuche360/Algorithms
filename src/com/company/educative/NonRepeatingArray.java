package com.company.educative;

public class NonRepeatingArray {
    public static void main(String[] args) {
        int[] array = {4,4,4,3};
        System.out.println(findFirstUnique(array));
    }

    public static int findFirstUnique(int[] arr) {
        // write your code here
        for(int i = 0; i < arr.length; i++) {
            boolean isRepeated = false;
            for(int j = 0; j < arr.length; j++) {
                if(arr[i] == arr[j] && i != j) {
                    isRepeated = true;
                    break;
                }
            }
            if(!isRepeated) {
                return arr[i];
            }
        }
        return -1;
    }
}
