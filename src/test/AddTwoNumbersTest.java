package test;

import leetcode.AddTwoNumbers;
import leetcode.util.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AddTwoNumbersTest {

    AddTwoNumbers test = new AddTwoNumbers();

    @Test
    void itShouldSumTwoDifferentArraysOfTheSameLength(){
        ListNode l1 = new ListNode(3);
        ListNode l2 = new ListNode(4, l1);
        ListNode l3 = new ListNode(2, l2);

        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(6, l4);
        ListNode l6 = new ListNode(5, l5);

        ListNode expectedResult_3 = new ListNode(8);
        ListNode expectedResult_2 = new ListNode(0, expectedResult_3);
        ListNode expectedResult = new ListNode(7, expectedResult_2);


        assertEquals(expectedResult.toString(), test.addTwoNumbers(l3, l6).toString());
    }

    @Test
    void itShouldBeZeroWhenToZeroNodeListArePassed(){
        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(0);

        ListNode expectedResult = new ListNode(0);

        assertEquals(expectedResult.toString(), test.addTwoNumbers(l1,l2).toString());

    }

}
