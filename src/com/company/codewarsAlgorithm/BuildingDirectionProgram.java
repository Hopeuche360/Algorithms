package com.company.codewarsAlgorithm;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BuildingDirectionProgram {
    public static void main(String[] args) {
        int [] buildings = {3, 5, 4, 4, 3, 1, 3, 2};
//        System.out.println(Arrays.asList(buildings));
        System.out.println(sunsetViews(buildings, "left"));
    }
    public static ArrayList<Integer> sunsetViews(int[] buildings, String direction) {
        // Write your code here.
        ArrayList<Integer> solution = new ArrayList<>();
        if(direction.equalsIgnoreCase("right")) {
            for (int i = 0; i < buildings.length; i++) {
                if (buildings[i] > buildings[i]+1){
//                    List<Integer> solution += Arrays.asList(buildings[i]);
                    ArrayList<Integer> result = new ArrayList<>(Arrays.asList(buildings[i]));
                    solution = result;
                    return solution;
                }
            }
//            return Arrays.asList(buildings[buildings.length-1]);
        } else {
//            return Arrays.asList(buildings[buildings.length-1]);
            for (int i = buildings.length-1; i >= 0 ; i--) {
                if (buildings[i] > buildings[i]-1) {
                    ArrayList<Integer> result = new ArrayList<>(Arrays.asList(buildings[i]));
                    solution = result;
                    return solution;
                }
            }
        }
            return solution;
    }
}
