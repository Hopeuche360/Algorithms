package com.company.linkedlists;


public class LinkedListCreation {

    static class Node {
        int i;
        Node next;
    }

    static class Linkedlist{

        public static Node getNewNode(int i) {
            Node node = new Node();
            node.i = i;
            node.next = null;
            return node;
        }

        public static Node insertNode(int i, Node node) {
            if (node == null) {
                return getNewNode(i);
            } else {
                node.next = insertNode(i, node.next);
            }
            return node;
        }

        public static int countNode() {
            int count = 0;
            Node node = new Node();
            while (node.next != null) {
                count++;
                node = node.next;
            }
            return count;
        }

        public static void printList(Node node) {
            if (node != null) {
                System.out.print(node.i + " ");
                printList(node.next);
            }
        }
    }

    public static void main(String[] args) {
        Node root = null;
        root = Linkedlist.insertNode(12, root);
        root = Linkedlist.insertNode(13, root);
        root = Linkedlist.insertNode(14, root);

        Linkedlist.printList(root);
//        Linkedlist.countNode();

        System.out.println("There are " + Linkedlist.countNode() + " nodes in the list");
    }

}



