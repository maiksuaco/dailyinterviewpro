package com.coding.dailyinterviewpro;

import com.coding.dailyinterviewpro.common.ListNode;
import com.coding.dailyinterviewpro.problem1.Solution;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.parsing.Problem;
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

        ListNode merged = Solution.mergeTwoLists(l1,l3);
        String s = "";
        while (merged != null) {
            s += merged.val + "->";
            merged = merged.next;
        }

        System.out.println(s);

        System.out.println(com.coding.dailyinterviewpro.problem2.Solution.addTwoNumbers(l1, l2));
    }
}
