package com.company.sq010Algorithms.dailyAlgo.linkedlists;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class HasCycle {
    static ListNode head;

    public static void main(String[] args) {


    }

    static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
         val = x;
          next = null;
      }
        public void push(int new_data) {
            ListNode new_list_node = new ListNode(new_data);
//        new_list_node.next = head;
//        head = new_list_node;
            while(head != null) {
                if (head.next == null) {
                    head.next = new_list_node;
                } else head = head.next;
            }
        }
  }
    public static boolean hasCycle(ListNode head) {
        ListNode pointer1 = head;
        ListNode pointer2 = head;
        while (pointer2 != null && pointer2.next != null) {
            pointer1 = pointer1.next;
            pointer2 = pointer2.next.next;
            if (pointer1 == pointer2) return true;
        }
        return false;
    }

    public static boolean hasCycleII(ListNode head) {
        /**
         *  all nodes in a singly linkedList are unique,
         *  so I'll go ahead and check for uniqueness.
         *  If a linkedList is not unique, then it is
         *  a doubly linkedList.
         *
         *  I'll do so using a hashset
         */

        Set<ListNode> set = new HashSet<>();
        while (head != null) {
            if (set.contains(head)) return  true;
            set.add(head);
            head = head.next;
        }
        return false;
    }
}
