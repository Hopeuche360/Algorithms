package com.company.placementPreparation;

import java.util.Arrays;

public class RearrangeArray {
    public static void main(String[] args) {
//        System.out.println(Arrays.toString(maxMin(new int[]{1, 2, 3, 4, 5, 6, 7})));
        System.out.println(sumDigits(64));
    }

    public static int[] maxMin(int[] arr) {
        // Write - Your - Cod
        int[] result = new int[arr.length];
        int i = 0;

        int countDown = arr.length -1;
        int countUp = 0;
        while (i < arr.length) {
            result[i] = arr[countDown--];
            i++;
            result[i] = arr[countUp++];
            i++;
        }
        return result;
    }

    static int sumDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
