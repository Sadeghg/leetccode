package io.mercury.linkedlist;

import java.util.HashMap;
import java.util.Map;

public class CopyRandomList {

    public Node solution(Node head) {
        if (head == null) return null;

        Node current = head;
        Map<Node, Node> oldToNew = new HashMap<>();

        while (current != null){
            Node node = new Node(current.val);
            oldToNew.put(current, node);
            current = current.next;
        }

//        current = head;
//        while (current != null){
//            current
//        }

        return null;
    }


    static class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
}
