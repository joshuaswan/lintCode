package com.joshua.lintCode.ListNode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by joshua on 2017/9/14.
 */
public class LinkedListCycleTest {
    @Test
    public void hasCycle() throws Exception {
        ListNode head = new ListNode(1);
//        head.next = head;
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = head;
        System.out.println(new LinkedListCycle().chase(head));
    }

}