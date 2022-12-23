package com.company.placementPreparation;

import java.util.HashSet;

public class IsUnique {
    public static void main(String[] args) {
        System.out.println(isUnique("chiajuka"));
    }

    public static boolean isUnique(String str) {
        if (str.length() == 1) return true;
        HashSet<String> hashSet = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            hashSet.add(String.valueOf(str.charAt(i)));
        }
        return hashSet.size() == str.length();
    }
}
