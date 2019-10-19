package com.coding.dailyinterviewpro;

import com.coding.dailyinterviewpro.common.ListNode;
import com.coding.dailyinterviewpro.common.ListNodePrinter;
import com.coding.dailyinterviewpro.linkedlistreversor.Solution;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DailyInterviewProApplicationTest {

    @Autowired
    @Qualifier("l5")
    ListNode l5;

    @Autowired
    @Qualifier("l6")
    ListNode listNode;

    @Autowired
    @Qualifier("l1")
    ListNode l1;

    @Autowired
    @Qualifier("l2")
    ListNode l2;

    @Before
    public void setup() {

    }

    @Test
    public void reverseLinkedList() {

        String expected = "(1)->(2)->(3)->(4)->(5)->(6)->(7)->(8)->(9)->(10)->(11)->(12)->(13)->(14)->(15)->(16)->(17)->(18)->(19)->(20)->";

        String result = new ListNodePrinter(Solution.reverseIteratively(listNode)).toString();
        Assert.assertEquals(expected, result);
    }

    @Test
    public void reverseRecursiveLinkedList() {

        String expected = "(20)->(19)->(18)->(17)->(16)->(15)->(14)->(13)->(12)->(11)->(10)->(9)->(8)->(7)->(6)->(5)->(4)->(3)->(2)->(1)->";

        String result = new ListNodePrinter(Solution.reverseRecursively(l5)).toString();
        Assert.assertEquals(expected, result);
    }


    @Test
    public void testMergeLinkedList() {

        String expected = "(2)->(4)->(3)->(5)->(6)->(4)->";
        ListNode merged = com.coding.dailyinterviewpro.merger.Solution.mergeTwoLists(l1, l2);

        String result = new ListNodePrinter(merged).toString();

        Assert.assertEquals(expected, result);
    }

}