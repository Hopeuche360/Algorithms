package com.company.linkedlists;

public class ReverseLinkedList {
    public static void main(String[] args) {

    }

    public static LinkedList reverseLinkedList(LinkedList head) {
        // Write your code here.
        LinkedList previous = null;
        while (head != null) {
            LinkedList nextElement = head.next;
            head.next = previous;
            previous = head;
            head = nextElement;
        }
        return previous;
    }

    static class LinkedList {
        int value;
        LinkedList next = null;

        public LinkedList(int value) {
            this.value = value;
        }
    }
}
