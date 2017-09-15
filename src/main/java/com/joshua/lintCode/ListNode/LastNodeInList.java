package com.joshua.lintCode.ListNode;

/**
 * Created by joshua on 2017/9/15.
 */
public class LastNodeInList {
    /**
     * @param head: The first node of linked list.
     * @param n:    An integer
     * @return: Nth to last node of a singly linked list.
     */
    public ListNode nthToLast(ListNode head, int n) {
        // write your code here
        ListNode last = head;

        if (head.next == null){
            return null;
        }
        while (last.next.next != null){
            last = last.next;
        }
        return last;
    }
}
