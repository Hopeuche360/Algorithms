package com.company.adventOfCode;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Day_1 {

    public static void main(String[] args) throws IOException {
        int count = 0;
        int prevNum = 0;
        BufferedReader bufferedReader = new BufferedReader(new FileReader
                ("/Users/decagon/Algorithm/src/com/company/adventOfCode/Day1"));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            int numbers = Integer.parseInt(line);
            if (prevNum == 0) {
                prevNum = numbers;
            } if (numbers > prevNum) {
                count++;
            }
            prevNum = numbers;

        }
        System.out.println(count);
    }
}
