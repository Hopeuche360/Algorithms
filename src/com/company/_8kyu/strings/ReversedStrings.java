package com.company._8kyu.strings;

public class ReversedStrings {
    public static void main(String[] args) {
        System.out.println(reverse("Madam"));
    }

    public static String reverse(String string){
        String reversedString = "";
        for (int i = string.length()-1; i >= 0; i--) {
            reversedString += string.charAt(i);
        }
        return reversedString;
    }
}
