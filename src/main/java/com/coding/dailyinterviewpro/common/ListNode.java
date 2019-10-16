package com.coding.dailyinterviewpro.common;


public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }


    public String toString() {
        return String.format("(%s)->", this.val);
    }
}
