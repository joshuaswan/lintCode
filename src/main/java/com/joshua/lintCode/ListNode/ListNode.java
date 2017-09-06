package com.joshua.lintCode.ListNode;

/**
 * Created by joshua on 2017/8/24.
 */
public class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int val) {
        this.val = val;
        this.next = null;
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
