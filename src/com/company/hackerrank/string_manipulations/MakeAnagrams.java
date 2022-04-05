package com.company.hackerrank.string_manipulations;

public class MakeAnagrams {
    public static void main(String[] args) {
        String string_1 = "fcrxzwscanmligyxyvym";
        String string_2 = "jxwtrhvujlmrpdoqbisbwhmgpmeoke";
        System.out.println(makeAnagram(string_1, string_2));
//        System.out.println(makeAnagramsII(string_1, string_2));
    }

    public static int makeAnagram(String a, String b) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            if (!b.contains(String.valueOf(a.charAt(i)))) count++;
        }
        for (int i = 0; i < b.length(); i++) {
            if (!a.contains(String.valueOf(b.charAt(i)))) count++;
        }
        return count;
    }

    public static int makeAnagramsII(String a, String b) {
        StringBuilder sb_1 = new StringBuilder(a);
        StringBuilder sb_2 = new StringBuilder(b);
        String result = (a.length() <= b.length() ? a : b);
        for (int i = 0; i < (Math.min(a.length(), b.length())); i++) {
            if (sb_1.toString().contains(String.valueOf(result.charAt(i))) && sb_2.toString().contains(String.valueOf(result.charAt(i)))) {
                sb_1.deleteCharAt(sb_1.indexOf(String.valueOf(result.charAt(i))));
                sb_2.deleteCharAt(sb_2.indexOf(String.valueOf(result.charAt(i))));
            }
        }
        return sb_1.length() + sb_2.length();


//        if (a.length() <= b.length()){
//            for (int i = 0; i < a.length(); i++) {
//                if (sb_1.toString().contains(String.valueOf(a.charAt(i))) && sb_2.toString().contains(String.valueOf(a.charAt(i)))) {
//                    sb_1.deleteCharAt(sb_1.indexOf(String.valueOf(a.charAt(i))));
//                    sb_2.deleteCharAt(sb_2.indexOf(String.valueOf(a.charAt(i))));
//                }
//            }
//        } else {
//            for (int i = 0; i < b.length(); i++) {
//                if (sb_1.toString().contains(String.valueOf(b.charAt(i))) && sb_2.toString().contains(String.valueOf(b.charAt(i)))) {
//                    sb_1.deleteCharAt(sb_1.indexOf(String.valueOf(b.charAt(i))));
//                    sb_2.deleteCharAt(sb_2.indexOf(String.valueOf(b.charAt(i))));
//                }
//            }
//        }
    }
}
