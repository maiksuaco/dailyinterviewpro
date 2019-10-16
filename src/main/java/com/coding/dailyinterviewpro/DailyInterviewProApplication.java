package com.coding.dailyinterviewpro;

import com.coding.dailyinterviewpro.problem1.ListNode;
import com.coding.dailyinterviewpro.problem1.Solution;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DailyInterviewProApplication implements CommandLineRunner {

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

        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        l2.next.next.next = new ListNode(9);

       // ListNode solution = Solution.addTwoNumbersRecursive(l1,l2);

       // System.out.println(solution);

        ListNode merged = Solution.mergeTwoLists(l1,l2);
        String s = "";
        while (merged != null) {
            s += merged.val + "->";
            merged = merged.next;
        }

        System.out.println(s);
    }
}
