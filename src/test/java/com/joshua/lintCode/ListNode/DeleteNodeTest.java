package com.joshua.lintCode.ListNode;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by joshua on 2017/9/14.
 */
public class DeleteNodeTest {
    @Test
    public void deleteNode() throws Exception {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        new DeleteNode().deleteNode(head.next);
        head.print();
    }

}