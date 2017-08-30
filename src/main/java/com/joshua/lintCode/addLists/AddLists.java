package com.joshua.lintCode.addLists;

/**
 * Created by joshua on 2017/8/24.
 */
public class AddLists {
    /**
     * @param l1: the first list
     * @param l2: the second list
     * @return: the sum list of l1 and l2
     */
    public ListNode addLists(ListNode l1, ListNode l2) {
        // write your code here
        ListNode result = new ListNode(0);
        ListNode next = new ListNode(0);
        ListNode list1 = l1;
        ListNode list2 = l2;
        int single = 0;
        int upper = 0;
        while (!(list1 == null && list2 == null)){
            single = list1.val + list2.val;
            upper = single/10;
            next.val = single % 10 + upper;
            list1 = list1.next;
            list2 = list2.next;
        }
        return next;
    }
}
