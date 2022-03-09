package com.company.vcgCodeChallenge;

import java.util.*;
import java.util.stream.Collectors;

public class CentilyticsPractice {
    public static void main(String[] args) {
//        int[] array = {2, 5, 3, 6, 4, 8, 3, 7, 2, 6};
//        int[] myArray = {10,30, 30, 20, 10, 20, 50, 10, 25, 3};
//        String word = "hello";
//        removeConcurrent(word);
//        removeConcurrentCharacter(word);
//        System.out.println(linerSearchArray(array, 2));
//        System.out.println(findReOccurringNumbersInArray(myArray));
//        System.out.println(removeRecurrentCharacters(word));
//        System.out.println(removeDuplicates("aabbaaccdddzzzfffbbb"));
//        int[] array = {10, 56, 0, 8, 0, 2};
//        System.out.println(Arrays.toString(rearrangeArray(array)));
//        try {
//            int a = 0;
//            int b = 5;
//            int c = b/a;
//            System.out.println("Hello");
//        } catch (NumberFormatException e) {
//            System.out.println("Musa");
//        } finally {
//            System.out.println("World");
//        }
        int[] arr = {2, 3, 2, 1, 4};
        System.out.println(Arrays.toString(multiplyArray(arr)));

    }

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
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0){
                list.add(0, array[i]);
            } else {
                list.add(array[i]);
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
}
