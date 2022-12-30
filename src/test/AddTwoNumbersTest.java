package test;

import leetcode.AddTwoNumbers;
import leetcode.ListNode;

public class AddTwoNumbersTest {

    public static void main(String[] args) {

        ListNode l1 = new ListNode(3);
        ListNode l2 = new ListNode(4, l1);
        ListNode l3 = new ListNode(2, l2);

        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(6, l4);
        ListNode l6 = new ListNode(5, l5);

        AddTwoNumbers test = new AddTwoNumbers();

        System.out.println(test.addTwoNumbers(l3, l6));

    }

}
