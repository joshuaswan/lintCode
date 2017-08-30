package com.joshua.lintCode.removeElement;

import org.junit.Test;

/**
 * Created by joshua on 2017/8/24.
 */
public class RemoveElementTest {
    @Test
    public void removeElements() throws Exception {
        ListNode head = new ListNode(1);
        head.setNext(new ListNode(2));
        head.getNext().setNext(new ListNode(3));
        head.getNext().getNext().setNext(new ListNode(2));
        head.getNext().getNext().getNext().setNext(new ListNode(5));
        new RemoveElement().removeElement(head,2).print();
    }

}