package com.company.sq010Algorithms.dailyAlgo.strings;

public class RemoveFirstAndLastCharacter {
    public static void main(String[] args) {
        System.out.println(remove("Appropriate"));
    }

    //method 1
    public static String remove(String str) {

        // your code here
        return str.substring(1, str.length()-1);
    }

    public static String removeII(String str) {
        return "";
    }
}
