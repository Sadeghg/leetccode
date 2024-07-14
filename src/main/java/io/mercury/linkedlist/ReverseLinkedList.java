package io.mercury.linkedlist;

import org.w3c.dom.Node;

public class ReverseLinkedList {

    public ListNode solutionOne(ListNode head) {
        ListNode previous = null;
        ListNode current = head;
        ListNode next = null;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }

    public ListNode solutionTwo(ListNode head){
        return reverse(new ListNode(), head, new ListNode());
    }

    private ListNode reverse(ListNode previous, ListNode current, ListNode next){
        next = current.next;
        current.next = previous;
        previous = current;
        current = next;
        return current.next;
    }

}