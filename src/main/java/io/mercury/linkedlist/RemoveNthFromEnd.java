package io.mercury.linkedlist;

public class RemoveNthFromEnd {
    public ListNode solution(ListNode head, int n) {

        ListNode dummy = new ListNode(-1, head);
        ListNode slow = dummy;
        ListNode fast = head;
        while (fast != null && n -- > 0)
            fast = fast.next;

        while (fast != null){
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return dummy.next;
    }
}
