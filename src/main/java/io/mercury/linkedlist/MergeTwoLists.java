package io.mercury.linkedlist;

import java.util.List;

public class MergeTwoLists {
    public ListNode solutionOne(ListNode list1, ListNode list2) {
        ListNode list = new ListNode();
        ListNode current = list;

        while (list1 != null && list2 != null) {

            int firstVal = list1.val;
            list1 = list1.next;

            int secondVal = list2.val;
            list2 = list2.next;

            boolean firstBigger = firstVal > secondVal;

            list.next = firstBigger
                    ? new ListNode(secondVal)
                    : new ListNode(firstVal);
            list = list.next;

            if (firstBigger) list1 = list1.next;
            else list2 = list2.next;

            list = list.next;
        }

        while (list1 != null){
            list.next = new ListNode(list1.val);
            list1 = list1.next;
            list = list.next;
        }

        while (list2 != null){
            list.next = new ListNode(list2.val);
            list2 = list2.next;
            list = list.next;
        }

        return current.next;
    }

    public ListNode solutionTwo(ListNode list1, ListNode list2) {

        if (list1 == null) return list2;
        if (list2 == null) return list1;

        ListNode head = new ListNode();
        ListNode current = head;
        while (list1 != null && list2 != null){
            int firstVal = list1.val;
            int secondVa = list2.val;
            if (firstVal > secondVa){
                current.next = list2;
                list2 = list2.next;
            }else {
                current.next = list1;
                list1 =  list1.next;
            }
            current = current.next;
        }

        if (list1 != null) current.next = list1;
        if (list2 != null) current.next = list2;

        return head.next;
    }
}
