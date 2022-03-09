package com.company.sq010Algorithms.dailyAlgo.strings;

public class GetTheMiddleCharacter {
    public static void main(String[] args) {
        System.out.println(getMiddleIII("Reservations"));
    }

    //method 1
    public static String getMiddle(String word) {
        //Code goes here!
        int index = word.length() / 2;
        if (word.length() <= 2) return word;
        else if (word.length() % 2 == 0) {
            return word.substring(index - 1, index + 1);

        }
        return word.substring(index, index + 1);
    }

    //method 2
    public static String getMiddleII(String word) {
        int index = word.length() / 2;
        return word.length()%2 == 0 ? word.substring(index -1, index + 1) : word.substring(index, index +1);
    }

    //method 3
    public static String getMiddleIII(String word) {
        int index = word.length() / 2;
        if (word.length() % 2 == 1) {
            return Character.toString(word.charAt(index));
        }
        return Character.toString(word.charAt(index -1)) + Character.toString(word.charAt(index));
    }

    //stanley's solution
//    public static String getMiddleStanley(String word) {
//        //Code goes here!
//        int position;
//        int length;
//        if (str.lenght() % 2 == 0){
//            position = str.length() / 2 - 1;
//            lenght = 2;
//        }else{
//            position = str.length()/2;
//            lenght =1;
//        }
//        System.out.print("The middle character in the string: " + middle(str));
//    }
}
