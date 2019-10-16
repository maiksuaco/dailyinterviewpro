package com.coding.dailyinterviewpro.common;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


public class ListNodePrinter {
    private ListNode merged;

    public ListNodePrinter(ListNode merged) {
        this.merged = merged;
    }

    public String toString() {
        String s = "";
        while (merged != null) {
            s += merged.toString();
            merged = merged.next;
        }
        return s;
    }
}
