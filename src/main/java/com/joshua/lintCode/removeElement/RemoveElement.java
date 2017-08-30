package com.joshua.lintCode.removeElement;

/**
 * Created by joshua on 2017/8/24.
 */
public class RemoveElement {
    /**
     * @param head: a ListNode
     * @param val:  An integer
     * @return: a ListNode
     */

    public ListNode removeElement(ListNode head, int val) {
        // write your code here
        while (removeOneElements(head, val)) {

        }
        return head;
    }

    public boolean removeOneElements(ListNode head, int val) {
        ListNode temp = null;
        if (head == null) {
            return false;
        } else {
            if (head.getVal() == val) {
                head = head.getNext();
                return true;
            } else {
                while (head != null) {
                    temp = head;
                    temp = temp.getNext();
                    if (temp.getNext() == null) {
                        return false;
                    }
                    if (temp.getVal() == val) {
                        head.setNext(temp.getNext());
                        break;
                    }
                    head = head.getNext();
                }
                return true;
            }
        }
    }
}
