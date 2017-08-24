package com.joshua.removeElement;

/**
 * Created by joshua on 2017/8/24.
 */
public class ListNode {
     private int val;
     private ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public int length(){
        int result = 1;
        ListNode temp = this;
        while (temp.getNext() != null){
            result++;
            temp = temp.getNext();
        }
        return result;
    }

    public void print(){
        ListNode temp = this;
        while (temp.getNext() != null){
            System.out.print(temp.getVal() + "->");
            temp = temp.getNext();
        }
        System.out.print(temp.getVal());
        System.out.println();
    }
}
