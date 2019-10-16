package com.coding.dailyinterviewpro.problem2;

import com.coding.dailyinterviewpro.common.ListNode;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("problem2")
public class Solution {

    public static ListNode addTwoNumbers(@Qualifier("l1") ListNode l1, @Qualifier("l2") ListNode l2, int c) {
        if (l1.next == null && l2.next == null) {
            ListNode newNode = new ListNode(l1.val + l2.val + c);
            return newNode;
        } else if ((l1.val + l2.val) < 9) {
            ListNode newNode = new ListNode(l1.val + l2.val + c);
            newNode.next = addTwoNumbers(l1.next, l2.next, 0);

            return newNode;
        } else {
            int sum = Math.floorMod(l1.val + l2.val, 10);
            ListNode newNode = new ListNode(sum);
            newNode.next = addTwoNumbers(l1.next, l2.next, 1);

            return newNode;
        }
    }
}
