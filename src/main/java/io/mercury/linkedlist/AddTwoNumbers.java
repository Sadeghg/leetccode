package io.mercury.linkedlist;

public class AddTwoNumbers {

    public ListNode solutionOne(ListNode l1, ListNode l2) {

        ListNode head = new ListNode();
        ListNode start = head;

        int extra =0, sum =0;
        while(l1 != null || l2 != null){

            int x =0, y =0;

            if (l1 != null){
                x = l1.val;
                l1 = l1.next;
            }

            if (l2 != null){
                y = l2.val;
                l2 = l2.next;
            }

            sum = x +y +extra;
            extra = sum /10;
            sum %= 10;

            head.next = new ListNode(sum);
            head = head.next;
        }
        if (extra != 0){
            head.next = new ListNode(extra);
        }

        return start.next;
    }

    public ListNode solutionTwo(ListNode l1, ListNode l2) {
        return addThem(l1, l2, 0);
    }

    private ListNode addThem(ListNode l1, ListNode l2, int carry){
        if(l1 == null && l2 == null && carry == 0) return null;
        if(l1 != null){
            carry += l1.val;
            l1 = l1.next;
        }
        if(l2 != null){
            carry += l2.val;
            l2 = l2.next;
        }
        ListNode node  = new ListNode(carry % 10);
        node.next = addThem(l1, l2, carry / 10);
        return node;
    }

    public ListNode list = new ListNode(-1);

    public ListNode solutionThree(ListNode l1, ListNode l2) {
        return traverse(l1, l2, list, 0);
    }

    private ListNode traverse(ListNode l1, ListNode l2, ListNode sum, int carry){
        if(l1 == null && l2 == null && carry == 0 ) return list.next;
        int val = carry;
        if(l1 != null) val += l1.val;
        if(l2 != null) val += l2.val;
        carry = val /10;
        sum.next = new ListNode(val % 10);
        return traverse((l1 == null ? null : l1.next), (l2 == null ? null : l2.next), sum.next, carry);
    }
}
