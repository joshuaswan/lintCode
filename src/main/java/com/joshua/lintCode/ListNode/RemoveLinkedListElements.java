package com.joshua.lintCode.ListNode;

/**
 * Created by joshua on 2017/9/15.
 */
public class RemoveLinkedListElements {
    /**
     * @param head: a ListNode
     * @param val:  An integer
     * @return: a ListNode
     */
    public ListNode removeElements(ListNode head, int val) {
        // write your code here
        if (head == null){
            return null;
        }

        while (head.val == val){
            head = head.next;
            if (head == null){
                return null;
            }
        }

        ListNode current = head;
        while (current.next != null){
            if (current.next.val == val){
                current.next = current.next.next;
            }else {
                current = current.next;
            }
        }
        return head;
    }

    public ListNode myself(ListNode head,int val){
        if (head == null) {
            return head;
        } else if (head.next == null && head.val == val) {
            return null;
        }
        ListNode current = head;
        ListNode temp = current;
        do {
            if (current.val == val) {
                current.val = current.next.val;
                current.next = current.next.next;
                if (current.next.next == null) {
                    temp = current;
                }
            } else {
                if (current.next.next == null) {
                    temp = current;
                }
                current = current.next;
            }

        } while (current.next != null);

        if (current.val == val) {
            temp.next = null;
        }
        return head;
    }
}
