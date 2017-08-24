package com.joshua.addLists;

/**
 * Created by joshua on 2017/8/24.
 */
public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }

    public void print(){
        ListNode temp = this;
        while (temp.next != null) {

            System.out.print(temp.val + "->");
            temp= temp.next;
        }
        System.out.print(temp.val);
        System.out.println();
    }
}
