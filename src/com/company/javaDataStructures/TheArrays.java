package com.company.javaDataStructures;

import java.util.Arrays;

public class TheArrays {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        // 1st method of looping through arrays in Java
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        for (int i = numbers.length-1; i >= 0 ; i--) {
            System.out.println(numbers[i]);
        }


        // 2nd method of looping through an array in Java
        // using enhanced for loop method
        for (int number : numbers) {
            System.out.println(number);
        }

        // 3rd method of looping through an array in Java
        // using the stream method

        Arrays.stream(numbers).forEach(System.out::print);
    }
}
