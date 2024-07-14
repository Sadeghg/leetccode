package io.mercury.linkedlist;

import java.util.HashSet;
import java.util.Set;

public class HasCycle {


    private boolean solutionOne(ListNode head){
        if (head == null) return false;
        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != slow){
            if (fast == null || fast.next == null) return false;
            slow = slow.next;
            fast = fast.next.next;

        }
        return true;
    }

    private boolean solutionTwo(ListNode head){
        if (head == null) return false;
        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null && fast.next != null){
            if (fast.val == slow.val) return true;
            slow = slow.next;
            fast = fast.next.next;

        }
        return false;
    }

    @Deprecated
    private boolean solutionThree(ListNode head){
        Set<Integer> items = new HashSet<>();
        while (head != null) {
            int value = head.val;
            if (items.contains(value)) return true;
            items.add(value);
            head = head.next;
        }
        return false;

    }
}
