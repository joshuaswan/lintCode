package com.joshua.lintCode.ListNode;

/**
 * Created by joshua on 2017/9/14.
 */
public class LinkedListCycle {
    /**
     * @param head: The first node of linked list.
     * @return: True if it has a cycle, or false
     */
    public boolean hasCycle(ListNode head) {
        // write your code here
        ListNode current;
        current = head;
        while (current != null){
            current = current.next;
            if (current == head){
                return true;
            }
        }
        return false;
    }

    //sorry 这个程序是拷贝网上的答案，上一个提供的答案时间复杂度不可以，感觉这个程序使用了二分法减少对应运行次数。但是对应分析过程还是很模糊
    //这里面利用了两个临时变量，slow和fast，slow每次向前移动一个，fast每次向前移动两个，在判断非空的时候直接判断fast和fast.next这样加快了循环进度
    //最不可理解的是对循环的判断，由fast追赶slow来进行比较，这样的循环次数也是list的长度，为什么性能就要比我的好呢？？？？
    //明白了，因为链表的方式可以能从某一部分开始进入循环，而不是head
    public boolean chase(ListNode head) {
        // write your code here
        if (head.next == null || head == null){
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast){
                return true;
            }
        }
        return false;
    }

    public boolean inprove(ListNode head) {
        // write your code here
        if (head.next == null || head == null){
            return false;
        }
        ListNode current = head;
        while (current != null && current.next != null){
            current = current.next.next;
            if (current == head){
                return true;
            }
        }
        return false;
    }

}
