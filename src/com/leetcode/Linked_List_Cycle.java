package com.leetcode;

public class Linked_List_Cycle {
    public boolean hasCycle(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        while(slow!=null&&slow.next!=null&&fast.next!=null&&fast.next.next!=null){
        	fast=fast.next.next;
        	slow=slow.next;
        	if(fast==slow)
        		return true;
        }
        return false;
    }
}
