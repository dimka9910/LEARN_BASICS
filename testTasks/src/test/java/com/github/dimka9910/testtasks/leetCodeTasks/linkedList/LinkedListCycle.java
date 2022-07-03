package com.github.dimka9910.testtasks.leetCodeTasks.linkedList;

import com.github.dimka9910.testtasks.leetCodeTasks.aaaLeetCodePackage.ListNode;
import org.junit.Test;

public class LinkedListCycle {
    @Test
    public void name() {
    }

    public boolean hasCycle(ListNode head) {
        while (head != null) {
            if (head.val == Integer.MAX_VALUE)
                return true;
            head.val = Integer.MAX_VALUE;
            head = head.next;
        }
        return false;
    }

}
