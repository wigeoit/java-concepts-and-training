package leetcode;

public class ListNode {
    int val;
    ListNode next;

    public ListNode() {

    }
    public ListNode(int val) {
        this.val = val;
    }
    public ListNode(int val, ListNode next) {
        this.val = val; this.next = next;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        ListNode head = this;

        while(head.next != null){
            sb.append(head.val+" ");
            head = head.next;
        }

        sb.append(head.val+" ");

        return sb.toString().trim();
    }
}
