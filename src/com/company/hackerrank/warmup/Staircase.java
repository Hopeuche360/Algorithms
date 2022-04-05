package com.company.hackerrank.warmup;

public class Staircase {
    public static void main(String[] args) {
        staircase(4);
    }

    public static void staircase(int n) {
        // Write your code here
        int count = 1;
        String str = "";
        while ( count <= n) {
            str+= " ".repeat(n - count) + "#".repeat(count++) + "\n";
        }
        System.out.println(str);
    }
}
