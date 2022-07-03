package com.github.dimka9910.testtasks.leetCodeTasks.linkedList;

import org.junit.Test;

public class LinkedListCycle2 {

    //https://medium.com/@koheiarai94/60-leetcode-questions-to-prepare-for-coding-interview-8abbb6af589e

    @Test
    public void name() {

    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode detectCycle(ListNode head) {
        while(head != null){
            if (head.val == Integer.MAX_VALUE) {
                return head;
            }
            head.val = Integer.MAX_VALUE;
            head = head.next;
        }
        return null;
    }

}
