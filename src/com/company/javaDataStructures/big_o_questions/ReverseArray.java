package com.company.javaDataStructures.big_o_questions;

public class ReverseArray {
    public static void main(String[] args) {

    }

    //brute force method
    static int[] reverseArray(int[] array) { //{5, 4, 3, 2, 1
        int[] newArray = new int[array.length];
        for (int i = array.length-1, j =0; i <= 0; i--, j++) {
            newArray[j] = array[i];
        }
        return newArray;
    }
}
