package com.joshua.lintCode.addLists;

import org.junit.Test;

/**
 * Created by joshua on 2017/8/24.
 */
public class AddListsTest {
    @Test
    public void addLists() throws Exception {
        ListNode list1 = new ListNode(1);
        ListNode list2 = new ListNode(2);
        list1.next = new ListNode(4);
        list1.print();
        list2.print();
        new AddLists().addLists(list1,list2).print();
    }

}