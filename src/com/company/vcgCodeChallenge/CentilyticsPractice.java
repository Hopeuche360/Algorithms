package com.company.vcgCodeChallenge;

import java.util.*;
import java.util.stream.Collectors;

public class CentilyticsPractice {
//    public static void main(String[] args) {
////        int[] array = {2, 5, 3, 6, 4, 8, 3, 7, 2, 6};
////        int[] myArray = {10,30, 30, 20, 10, 20, 50, 10, 25, 3};
////        String word = "hello";
////        removeConcurrent(word);
////        removeConcurrentCharacter(word);
////        System.out.println(linerSearchArray(array, 2));
////        System.out.println(findReOccurringNumbersInArray(myArray));
////        System.out.println(removeRecurrentCharacters(word));
////        System.out.println(removeDuplicates("aabbaaccdddzzzfffbbb"));
////        int[] array = {10, 56, 0, 8, 0, 2};
////        System.out.println(Arrays.toString(rearrangeArray(array)));
////        try {
////            int a = 0;
////            int b = 5;
////            int c = b/a;
////            System.out.println("Hello");
////        } catch (NumberFormatException e) {
////            System.out.println("Musa");
////        } finally {
////            System.out.println("World");
////        }
//        int[] arr = {1, 2, 3, 4};
//        System.out.println(Arrays.toString(findProduct(arr)));
//        int[] array = {10, 56, 0, 8, 0, 2};
//        System.out.println(Arrays.toString(rearrangeArray(array)));
//    }

    public static List<Integer> linerSearchArray(int[] array, int number) {
        List<Integer> list = new ArrayList<>();
        for (int index = 0; index < array.length; index++) {
            if (array[index] == number) list.add(index);
        }
        return list;
    }

    public static List<Integer> findReOccurringNumbersInArray(int[] array) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    if (!list.contains(array[i])) {
                        list.add(array[i]);
                        break;
                    }
                }
            }
        }
        return list;
    }

    public static String removeRecurrentCharacters(String string) {
        String[] strArray = string.split("");
        List<String> list = new ArrayList<>();
        for (int i = 0; i < strArray.length; i++) {
            if (!list.contains(strArray[i])) {
                list.add(String.valueOf(string.charAt(i)));
            }
        }
        return list.toString();
    }

    public static String removeRecurrentCharactersII(String string) {
        return new HashSet<String>(Set.of(string)).toString();
    }

    public static String removeDuplicates(String word){
        return Arrays.stream(word.split("")).distinct().collect(Collectors.joining(""));
    }

    public static Object[] rearrangeArray(int[] array) { //10, 56, 0, 8, 0, 2
        List<Integer> list = new LinkedList<>();
        for (int j : array) {
            if (j == 0) {
                list.add(0, j);
            } else {
                list.add(j);
            }
        }
        return list.toArray();
    }

    public static void removeConcurrent(String word) {
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(word.charAt(0)));
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != stringBuilder.charAt(stringBuilder.length()-1))
                stringBuilder.append(word.charAt(i));
        }
        System.out.println(stringBuilder);
    }

    public static int[] multiplyArray(int[] array) { //2, 3, 2, 1, 4
        int[] multipliedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int multiple = 1;
            for (int j = 0; j < array.length; j++) {
                if (i != j)
                    multiple = multiple * array[j];
            }
            multipliedArray[i] = multiple;
        }
        return multipliedArray;
    }

    public static int[] findProduct(int[] array) {
        int[] productArray = new int[array.length];
        for(int i = 0; i < array.length; i++) {
            int product = 1;
            for(int j = 0; j < array.length; j++) {
                if (i != j) product *= array[j];
            }
            productArray[i] = product;
        }
        return productArray;
    }

    public static int fib(int n) {
        if (n < 2) return n;
        int n1 = 0;
        int n2 = 1;
        int sum;
         while(n-- > 1) {
             sum = n1 + n2;
             n1 = n2;
             n2 = sum;
         }
         return n2;
    }


    public static void main(String[] args) {
        System.out.println(concurrent("hello"));
    }
    public static String concurrent(String str){
        StringBuilder removed = new StringBuilder();
        String [] mystr = str.split("");
        for(int i = 0; i< mystr.length; i++){
            if(i == mystr.length - 1){
                removed.append(mystr[i]);
            }else{
                if(!mystr[i].equals(mystr[i + 1])){
                    removed.append(mystr[i]);
                }
            }
        }
        return removed.toString();
    }
}
