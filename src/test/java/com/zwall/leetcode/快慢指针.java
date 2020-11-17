package com.zwall.leetcode;

/**
 * @description: ${description}
 * @author: zhou.wei
 * @create: 2020-11-11 21:56
 **/
public class 快慢指针 {
    /**
     * 我们定义两个指针，一快一满。慢指针每次只移动一步，而快指针每次移动两步。 初始时，慢指针在位置 head，而快指针在位置 head.next。
     * 这样一来，如果在移动的过程中，快指针反过来追上慢指针，就说明该链表为环形链表。否则快指针将到达链表尾部，该链表不为环形链表。
     * 
     * @param args
     */
    public static void main(String[] args) {

    }
    public boolean hasCycle(ListNode head) {
        if(head==null){
            return false;
        }
        ListNode slow=head;
        ListNode fast=head.next;
        while (slow!=fast){
            if(fast==null||fast.next==null){
                return false;
            }
            slow=slow.next;
            fast=fast.next.next;
        }
        return true;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
