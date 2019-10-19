package com.coding.dailyinterviewpro.linkedlistreversor;

import com.coding.dailyinterviewpro.common.ListNode;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LinkedListReversorConfig {

    @Bean
    @Qualifier("l5")
    public ListNode buildL5() {

        ListNode head = new ListNode(1);
        ListNode aux = head;
        for (int i = 2; i < 21; i++) {
            ListNode listNode = new ListNode(i);
            aux.next = listNode;

            aux = listNode;
        }



        return head;
    }

    @Bean
    @Qualifier("l6")
    public ListNode buildL6() {

        ListNode head = new ListNode(20);
        ListNode aux = head;
        for (int i = 19; i > 0; i--) {
            ListNode listNode = new ListNode(i);
            aux.next = listNode;

            aux = listNode;
        }



        return head;
    }
}
