package com.company.codewarsAlgorithm;

public class LearningRecursion {
    public static void main(String[] args) {
        firstMethod();
        int n = 5;
        int k = 5;
        System.out.println(recursionMethod(n));
        System.out.println(iterativeSolution(k));

        // question 1
        int s = -10;
        System.out.println(sumOfDigits(s));

        // question 2
        int base = 4, exp = -1;
        System.out.println(power(base, exp));

        // question 3
        int a = -24, b = 16;
        System.out.println(gcd(a, b));



    }
    static void firstMethod() {
        secondMethod();
        System.out.println("I am the first method");
    }
    static void secondMethod() {
        thirdMethod();
        System.out.println("I am the second method");
    }static void thirdMethod() {
        fourthMethod();
        System.out.println("I am the third method");
    }static void fourthMethod() {
        System.out.println("I am the fourth method");
    }

    //recursion with numbers
    static int recursionMethod(int n) {
        if (n<1) {
            System.out.println("n is less than 1");
        } else {
            recursionMethod(n-1);
            System.out.println(n);
        }
        return n;
    }


    static int iterativeSolution(int k) {
        System.out.println("we move!!");
        while (k > 1) {
            System.out.println(k);
            k--;
        }
        return k;
    }

    // Question 1: To find he sum of digits in a given positive integer
    static int sumOfDigits(int s) {
//        System.out.println("AlgoExpert");
        if (s == 0 || s == -1){
            return 0;
        }
        return s % 10 + sumOfDigits(s / 10);
    }

    //Question 2: To calculate the power of number using recursion
    static int power(int base, int exp) {
        if (exp < 0) {
            return -1;
        }
        if (exp == 0 ) {
            return 1;
        } else if (exp == 1) {
            return base;
        }
        return base * power(base, exp-1);
    }

    //Question 3: To find the GCD of two positive integers using recursion
    static int gcd(int a, int b){
        if (a < 0 || b < 0) {
            return -1;
        }
        if (b == 0){
            return a;
        }
        return gcd(b, a % b);
    }
}
