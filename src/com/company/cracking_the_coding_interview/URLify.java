package com.company.cracking_the_coding_interview;

public class URLify {
    public static void main(String[] args) {
        System.out.println(urlifyString("Obi is a boy", 12));
    }

    static int urlifyString(String str, int trueLength) {
        char[] strArray = str.toCharArray();
        int count = 0;
        for (int i = 0; i < trueLength; i++) {
            if (strArray[i] == ' ')
                count++;
        }

        int index = (count * 3) + trueLength;
        return 2;
    }
}
