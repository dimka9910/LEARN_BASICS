package com.github.dimka9910.testtasks.leetCodeTasks.stack;

import com.github.dimka9910.testtasks.leetCodeTasks.aaaLeetCodePackage.ListNode;
import org.junit.Test;

import java.util.Stack;

public class ReverseLinkedList {

    @Test
    public void name() {
        ListNode listNode = ListNode.generateFromStringNumberList("12345");
        reverseList(listNode);
    }

    public ListNode reverseList(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        if (head == null)
            return null;

        stack.push(head);

        while (head.next != null){
            stack.push(head.next);
            head = head.next;
        }

        ListNode tmp = head;
        while (!stack.empty()){
            tmp.next = stack.pop();
            tmp = tmp.next;
        }
        tmp.next = null;
        return head;
    }

    public ListNode reverseList2(ListNode head) {

        ListNode prev = null;
        ListNode curr = head;

        while(curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}
