package com.coding.dailyinterviewpro.problem2;

import com.coding.dailyinterviewpro.common.ListNode;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Problem2Config {

    @Bean
    @Qualifier("l1")
    public ListNode buildL1() {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        return l1;
    }

    @Bean
    @Qualifier("l2")
    public ListNode buildL2() {
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        return l2;
    }

}
