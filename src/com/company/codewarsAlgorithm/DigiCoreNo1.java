package com.company.codewarsAlgorithm;

public class DigiCoreNo1 {
    public static void main(String[] args) {
        System.out.println(Add(14, 12));
    }

    public static int Add(int x, int y) {
        while (y != 0) {
            int carry = x & y;
            x = x ^ y;
            y = carry << 1;
        }
        return x;
    }
}
