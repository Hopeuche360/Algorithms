package com.company.codewarsAlgorithm;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class sortCsvColumns {
    public static void main(String[] args) {
        String csv_data = "Beth,Charles,Danielle,Adam,Eric\n" +
                "17945,10091,10088,3907,10132\n" +
                "2,12,13,48,11";

        System.out.println(sortCsvColumns(csv_data));
    }

    public static String sortCsvColumns( String csv_data ) {
        String [] csv_data1 = csv_data.split("\n");
        System.out.println(csv_data1.toString());
        for (int i = 0; i < csv_data1.length; i++) {
            String [] csv_data2 = csv_data1[i].split(",");
            Arrays.sort(csv_data2);
        }
        return "";
    }
}

//    String [] csv_data1 = csv_data.split("\n");
//        for (String value : csv_data1) {
//                String [] csv_data2 = value.split(",");
//                for (String value1 : csv_data2) {
//                char [] value2 = value1.toCharArray();
//                Arrays.sort(value2);
//                System.out.println(value2.toString());
//                }
//                }
