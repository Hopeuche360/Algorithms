package com.company._8kyu;

public class Ascii {
    //get character rom ASCII values
    public static void main(String[] args) {
        System.out.println(getChar(57));
        System.out.println(getNumber("345"));
    }
    public static char getChar(int c) {
        // ... typecast the given int to char
        return (char) c;
    }
    public static int getNumber(String string){
        return Integer.parseInt(string);
    }

}
