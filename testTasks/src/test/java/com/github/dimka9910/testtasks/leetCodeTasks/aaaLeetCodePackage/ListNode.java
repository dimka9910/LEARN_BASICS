package com.github.dimka9910.testtasks.leetCodeTasks.aaaLeetCodePackage;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode generateFromStringNumberList(String str){
        ListNode listNode = new ListNode();
        ListNode tmp = listNode;
        for (Character c: str.toCharArray()){
            int num = Integer.parseInt(c.toString());
            tmp.next = new ListNode(num);
            tmp = tmp.next;
        }
        return listNode.next;
    }
}
