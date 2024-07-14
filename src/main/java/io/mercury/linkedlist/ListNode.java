package io.mercury.linkedlist;

public class ListNode {
    ListNode next = null;
    int val;

    ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public String print() {
        StringBuilder stringBuilder = new StringBuilder();
        ListNode node = this;
        while (node != null) {
            stringBuilder
                    .append(node.val)
                    .append(" ");
            node = node.next;
        }
        return stringBuilder.toString();
    }
}
