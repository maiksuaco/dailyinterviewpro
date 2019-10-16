package com.coding.dailyinterviewpro.problem1;

import com.coding.dailyinterviewpro.common.ListNode;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Problem1Config {

    @Bean
    @Qualifier("l3")
    public ListNode buildL3() {
        ListNode l3 = new ListNode(5);
        l3.next = new ListNode(6);
        l3.next.next = new ListNode(4);
        l3.next.next.next = new ListNode(9);

        return l3;
    }

}
