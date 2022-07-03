package com.github.dimka9910.testtasks.leetCodeTasks.linkedList;

import com.github.dimka9910.testtasks.leetCodeTasks.aaaLeetCodePackage.ListNode;

public class RemoveDuplicatesFromSortedList {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null)
            return head;

        ListNode prev = head;
        ListNode current = head.next;

        while (current != null) {
            if (current.val == prev.val) {
                prev.next = current.next;
                current = prev.next;
            } else {
                prev = prev.next;
                current = current.next;
            }
        }
        return head;
    }
}