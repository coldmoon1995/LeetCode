package com.leetcode;

public class Reverse_Linked_List {
	public ListNode reverseList(ListNode head) {
    	if(head==null||head.next==null)
    		return head;
        ListNode left=null;
        ListNode right=head.next;
        while(right!=null){
        	head.next=left;
        	left=head;
        	head=right;
        	right=right.next;
        }
        head.next=left;
        return head;
    }
}
