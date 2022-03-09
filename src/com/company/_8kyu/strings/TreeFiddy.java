package com.company._8kyu.strings;

public class TreeFiddy {
    public static void main(String[] args) {
        String n = "Your girlscout cookies are ready to ship. Your total comes to tree fiddy";
        System.out.println(isLockNessMonster(n));
    }

    public static boolean isLockNessMonster(String s){
        //FIND THE LOCH NESS MONSTER. SAVE YOUR TREE FIDDY
        return s.contains("tree fiddy") || s.contains("3.50") || s.contains("three fifty");
    }
}
