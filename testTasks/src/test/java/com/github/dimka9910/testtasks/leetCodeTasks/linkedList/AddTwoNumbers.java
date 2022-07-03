package com.github.dimka9910.testtasks.leetCodeTasks.linkedList;

import com.github.dimka9910.testtasks.leetCodeTasks.aaaLeetCodePackage.ListNode;
import org.junit.Test;

public class AddTwoNumbers {


    @Test
    public void name() {
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode head = l1;

        l1.val = l1.val + l2.val;
        int over = l1.val / 10;
        l1.val = l1.val % 10;

        while (l1.next != null && (l2.next != null || over > 0)) {
            if (l2.next != null) {
                l1.next.val = l1.next.val + l2.next.val;
                l2 = l2.next;
            }
            l1.next.val += over;
            over = l1.next.val / 10;
            l1.next.val = l1.next.val % 10;
            l1 = l1.next;
        }

        if (l2.next != null) {
            l1.next = l2.next;
            while (l1.next != null && over > 0) {
                l1.next.val = l1.next.val + over;
                over = l1.next.val / 10;
                l1.next.val = l1.next.val % 10;
                l1 = l1.next;
            }
        }

        if (over > 0) {
            l1.next = new ListNode(over);
        }

        return head;
    }

}