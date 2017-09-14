package com.joshua.lintCode.ListNode;

/**
 * Created by joshua on 2017/9/14.
 */
public class DeleteNode {
    /**
     * @param node: the node in the list should be deleted
     * @return: nothing
     */
    public void deleteNode(ListNode node) {
        // write your code here
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
