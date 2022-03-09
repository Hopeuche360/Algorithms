package com.company.codewarsAlgorithm;

public class DirectionReduction {
    public static void main(String[] args) {
        String [] arr = { "NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST" };
        System.out.println(dirReduc(arr));
    }

    public static String[] dirReduc(String[] arr) {
        // Your code here.

        for (int i = 0; i < arr.length; i++) {
            boolean a = arr[i].equalsIgnoreCase("North");
            boolean b = (arr[i]+1).equalsIgnoreCase("South");
            boolean c = arr[i].equalsIgnoreCase("West");
            boolean d = (arr[i]+1).equalsIgnoreCase("East");
            if (a && b && c && d) {
                return arr;
            }
        }
        return  arr;
    }

}
