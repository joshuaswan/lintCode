package com.joshua.lintCode.ListNode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by joshua on 2017/9/15.
 */
public class RemoveLinkedListElementsTest {
    @Test
    public void removeElements() throws Exception {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        new RemoveLinkedListElements().removeElements(head,3).print();
    }

}