package com.company.hackerrank;

public class TimeConversion {
    public static void main(String[] args) {
        System.out.println(timeConversionII("12:01:00AM"));
    }

    public static String timeConversion(String s) {
        // Write your code here
        if (s.endsWith("AM")) {
            String h = (Integer.parseInt(s.substring(0, 2)) == 12) ? "00" : s.substring(0, 2);
            return h.concat(s.substring(2, s.length() - 2));
        } else {
            String h = (Integer.parseInt(s.substring(0, 2)) == 12) ?
                    "12" : String.valueOf(Integer.parseInt(s.substring(0, 2)) + 12);
            return h + s.substring(2, s.length() - 2);
        }
    }

    public static String timeConversionII(String s) {
        // Write your code here
        int hour = Integer.parseInt(s.substring(0, 2));
        if (s.endsWith("PM") && hour < 12) {
            hour += 12;
            return hour + s.substring(2, s.length()-2);
        } else if (hour == 12 && s.charAt(8) == 'A'){
            return "00" + s.substring(2, s.length()-2);
        }
        return s.substring(0, s.length()-2);
    }
}
