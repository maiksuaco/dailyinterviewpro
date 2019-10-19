package com.coding.dailyinterviewpro.linkedlistreversor;

import com.coding.dailyinterviewpro.common.ListNode;

import java.util.Stack;

public class Solution {

    public static ListNode reverseRecursively(ListNode head) {

        if (head.next == null) {
            return head;
        } else {

            ListNode newHead  = reverseRecursively(head.next);

            head.next.next = head;
            head.next = null;

            return newHead;
        }
    }

    public static ListNode reverseIteratively(ListNode head) {
        Stack<ListNode> stack = new Stack<>();

        while (head != null) {
            stack.push(head);
            head = head.next;
        }

        head = stack.peek();

        while (!stack.empty()) {
            ListNode cursor = stack.pop();

            if (stack.empty()) {
                cursor.next = null;
            } else {
                cursor.next = stack.peek();
                stack.peek().next = null;
            }
        }

        return head;
    }
}
