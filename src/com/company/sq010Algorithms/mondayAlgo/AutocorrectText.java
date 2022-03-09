package com.company.sq010Algorithms.mondayAlgo;

import java.util.Arrays;

public class AutocorrectText {
    public static void main(String[] args) {
        String text = "We have sent the deliverables to youuuuuu";
        System.out.println(autocorrect(text));
    }

    public static String autocorrect(String input) { //check if string contains "you", "youuu", "u" and replace with "your client"
        String[] inputArray = input.split(" ");
        System.out.println(Arrays.toString(inputArray));
        StringBuilder str = new StringBuilder();
        for (String word : inputArray) {
            if (word.equals("u") || word.equalsIgnoreCase("you")) {
                str.append("your client");
            } else if (word.length() > 3 && word.substring(0,3).equalsIgnoreCase("you")) {
                String s = word.substring(3);
                if (s.equals(".")) str.append("your client.");
                else {
                    boolean flag = false;
                    for (int i = 0; i < s.length(); i++) {
                        if (s.charAt(i) != 'u') {
                            flag = true;
                            break;
                        }
                    }
                    if (!flag) str.append("your client");
                    else str.append(word);
                }
            } else str.append(word);
            str.append(" ");
        }
        return str.toString().trim();
    }
}
