package com.company.linkedlists;

import java.util.*;

public class LinkedListMethods {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Hello");
        list.add("Bonjour");
        list.add("PLAY");
        list.add("Kind");

        list.add(4, "try");
        list.addFirst("first");


        System.out.println();
        System.out.print(list);

        List<String> arrayList = new ArrayList<>();
        arrayList.add("14");
        arrayList.add("114");
        arrayList.add("1114");
        arrayList.add("11114");

//        list.addAll(arrayList);
        System.out.println();
        list.addAll(2, arrayList);
        System.out.println(list);
        Object clone = list.clone();
        System.out.println(list.lastIndexOf("try"));
        System.out.println(list.poll());
        System.out.println(list);

        //for i loop
        for (int i = list.size()-1; i >= 0 ; i--) {
            System.out.println(list.get(i));
        }
        System.out.println();
        //Advanced for loop
        for (String items : list) {
            System.out.println(items);
        }
        System.out.println("Backward iteration");
        //Iterator
        Iterator<String> iterator = list.descendingIterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        list.addLast("Hello");
        System.out.println(list.lastIndexOf("Hello"));

        String[] array = list.toArray(new String[list.size()]);

//        System.out.println();
//        //while loop
//        int index = list.size()-1;
//        while (index >= 0) {
//            System.out.println(list.get(index));
//            index--;
//        }


    }

}
