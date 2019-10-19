package com.coding.dailyinterviewpro.common;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


public class ListNodePrinter {
    private ListNode listNodeToPrint;

    public ListNodePrinter(ListNode listNode) {
        listNodeToPrint = listNode;
    }

    public String toString() {

        String s = "";

        ListNode cursor = listNodeToPrint;

        while (cursor != null) {
            s += cursor.toString();
            cursor = cursor.next;
        }

        return s;
    }
}
