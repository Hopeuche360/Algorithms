package com.company.codewarsAlgorithm;

public class PalindromeChecker {
    public static void main(String[] args) {
       String str = "abcdcba";
        System.out.println(isPalindrome(str));
    }
    public static boolean isPalindrome(String str) {
        // Write your code here.
        //convert given string to string builder and reverse it
        StringBuilder stringBuilder = new StringBuilder(str);
        String newStr = stringBuilder.reverse().toString();

        // to check if str is same as newStr
        return str.equalsIgnoreCase(newStr);
    }
}
