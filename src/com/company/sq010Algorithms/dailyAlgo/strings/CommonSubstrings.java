package com.company.sq010Algorithms.dailyAlgo.strings;

import java.util.Arrays;
import java.util.List;

public class CommonSubstrings {
    public static void main(String[] args) {
        System.out.println(SubstringTest("wDCrqbHocKOQMlildzVmOLUEEPIncHouOyoNzXTyXd",
                "TdFUCWOARjhKtUJoftGSxakJILpxevTxOKRLcpBPwC"));
    }

    public static boolean SubstringTest(String str1, String str2) {
        //Code goes here!
        String[] str2_Array = str2.toLowerCase().split("");
        for (int i = 0; i < str2.length()-1; i++) {
            if (str1.toLowerCase().contains(str2_Array[i] + str2_Array[i+1])) return  true;
        }
        return false;
    }
}