package com.company.junit;

public class StringUtils {
    public static void main(String[] args) {
        String input = "Onyeka";
        System.out.println(reverse(input));
    }

    public static String reverse(String input) {
        if(input == null) {
            return null;
        }

        if(input.length() == 0) {
            return "";
        }

        char[] charArray = input.toCharArray();
        int start = 0;
        int end = input.length() - 1;

        while(start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }

        return new String(charArray);
    }

}

