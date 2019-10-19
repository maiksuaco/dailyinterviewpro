package com.coding.dailyinterviewpro.problem2;

import com.coding.dailyinterviewpro.common.ListNode;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Problem2Config {

    @Bean
    @Qualifier("l3")
    public ListNode buildL3() {
        ListNode l3 = new ListNode(7);
        l3.next = new ListNode(4);
        l3.next.next = new ListNode(3);

        return l3;
    }

    @Bean
    @Qualifier("l4")
    public ListNode buildL4() {
        ListNode l4 = new ListNode(5);
        l4.next = new ListNode(6);
        l4.next.next = new ListNode(9);

        return l4;
    }

}
