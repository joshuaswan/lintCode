package com.joshua.removeElement;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by joshua on 2017/8/24.
 */
public class ListNodeTest {

    @Test
    public void test(){
        ListNode head = new ListNode(1);
        head.setNext(new ListNode(2));
        System.out.println(head.getNext().getVal());
        System.out.println(head.length());
        head.print();
    }
}