package com.joshua.lintCode.ListNode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by joshua on 2017/9/15.
 */
public class LastNodeInListTest {
    @Test
    public void nthToLast() throws Exception {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        new LastNodeInList().nthToLast(head,2).print();
    }

}