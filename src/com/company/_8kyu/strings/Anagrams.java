package com.company._8kyu.strings;

public class Anagrams {
    public static void main(String[] args) {
        System.out.println(isAnagram("bade", "bead"));
    }

    public static boolean isAnagram(String str1, String str2){
        int count = 0;
        if (str1.length() != str2.length()) return false;
        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                if(str1.charAt(i) == str2.charAt(j)) {
                    count++;
                }
            }
        }

        return count == str1.length();
    }

    public static String ternary(int age) {
        return age < 18 ? "Not Permitted" : "Permitted";
    }
}
