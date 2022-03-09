package com.company.sq010Algorithms.dailyAlgo.strings;

import java.util.Arrays;

public class SplitInParts {
    public static void main(String[] args) {
        System.out.println(splitInPartsII("Holaholaholaholaba", 4));
    }
//    Chibueze's solution
    public static String splitInParts(String s, int partLength) {
        // your code
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if (i % partLength == 0)
                result += " " + s.charAt(i);
            else
                result += s.charAt(i);
        }
        return result.trim();
    }

    //mine
    public static String splitInPartsII(String s, int partLength) {
        String answer = "";
        for (int i = 0, j = 1; i < s.length(); i++, j++) {
            answer += s.substring(i, i+1);
            if (j == partLength) {
                answer += " ";
                j = 0;
            }
        }
        return answer;
    }
}
