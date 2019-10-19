package com.coding.dailyinterviewpro;

import com.coding.dailyinterviewpro.common.ListNode;
import com.coding.dailyinterviewpro.common.ListNodePrinter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DailyInterviewProApplication implements CommandLineRunner {

    @Autowired
    @Qualifier("l1")
    ListNode l1;

    @Autowired
    @Qualifier("l2")
    ListNode l2;

    @Autowired
    @Qualifier("l3")
    ListNode l3;

    @Autowired
    @Qualifier("l4")
    ListNode l4;

    @Autowired
    @Qualifier("l5")
    ListNode l5;

    @Autowired
    @Qualifier("l6")
    ListNode l6;


    ListNodePrinter printer;

    private static Logger LOG = LoggerFactory.getLogger(DailyInterviewProApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DailyInterviewProApplication.class, args);
	}

    /**
     * Callback used to run the bean.
     *
     * @param args incoming main method arguments
     * @throws Exception on error
     */
    @Override
    public void run(String... args) throws Exception {
        LOG.info("HELLOOOOO");


       // ListNode solution = Solution.addTwoNumbersRecursive(l1,l2);

       // System.out.println(solution);
/*
        ListNode merged = Solution.mergeTwoLists(l1,l2);

        printer = new ListNodePrinter(merged);

        System.out.println(printer.toString());

        printer = new ListNodePrinter(com.coding.dailyinterviewpro.problem2.Solution.addTwoNumbers(l3, l4, 0));
        System.out.println(printer.toString());

        System.out.println("L5:");
        printer = new ListNodePrinter(l5);
        System.out.println(printer);


        printer = new ListNodePrinter(com.coding.dailyinterviewpro.LinkedListReversor.Solution.reverseRecursively(l5));
        System.out.println("L5 reverseRecursively:");
        System.out.println(printer);


        System.out.println("L6:");
        printer = new ListNodePrinter(l6);
        System.out.println(printer);
        System.out.println("L6 Inversed:");
        printer = new ListNodePrinter(com.coding.dailyinterviewpro.LinkedListReversor.Solution.reverseIteratively(l6));
        System.out.println(printer);*/

    }

}
