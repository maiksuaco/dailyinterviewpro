package com.coding.dailyinterviewpro.problem2;

import com.coding.dailyinterviewpro.common.ListNode;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("problem2")
public class Solution {

    public static ListNode addTwoNumbers(@Qualifier("l1") ListNode l1, @Qualifier("l2") ListNode l2) {
        return l1;
    }
}
