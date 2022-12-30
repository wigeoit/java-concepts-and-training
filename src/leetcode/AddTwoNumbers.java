package leetcode;

import java.util.function.Predicate;

public class AddTwoNumbers{
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode head = new ListNode();
        ListNode ans = head;
        int carry = 0;

        while (l1 != null || l2 != null) {
            int sum = carry + (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val);
            carry = sum / 10;
            head.val = sum % 10;

            if ((l1 != null && l1.next != null) || (l2 != null && l2.next != null)) {
                head.next = new ListNode();
                head = head.next;
            }

            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
        }

        if (carry > 0) {
            head.next = new ListNode(carry);
        }

        return ans;
    }
}
