package com.company.adventOfCode;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Day_1b {

    public static void main(String[] args) throws IOException {
        int count = 0;
        int[] currentNumber = new int[3];
        int[] lastNumber = new int[3];
        int init = 0;
        BufferedReader bufferedReader = new BufferedReader(new FileReader
                ("/Users/decagon/Algorithm/src/com/company/adventOfCode/Day1"));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            int numbers = Integer.parseInt(line);
            if (init < 3) {
                if (init > 0) {
                    currentNumber[init - 1] = numbers;
                }
                lastNumber[init] = numbers;
                init++;
            }

            currentNumber[2] = numbers;
            int curr = 0;
            int last = 0;
            for (int i = 0; i < 3; i++) {
                last = lastNumber[i];
                curr = currentNumber[i];
            }
            if (curr > last) {
                count++;
            }

            lastNumber = Arrays.copyOf(currentNumber, 3);

            System.arraycopy(currentNumber, 1, currentNumber, 0, 2);
        }
        System.out.println(count);
    }
}
