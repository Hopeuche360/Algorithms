package com.company.hackerrank.warmup;

import java.math.BigInteger;

public class ExtraLongFactorials {
    public static void main(String[] args) {
        extraLongFactorial(50);
    }

    static void extraLongFactorial(int n) {
        System.out.println(getFactorial(n));
    }

    private static BigInteger getFactorial(int n) {
        BigInteger result = BigInteger.valueOf(1);
        for (int i = 2; i <= n ; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
