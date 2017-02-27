package com.leetcode;

public class Remove_Linked_List_Elements {
    public ListNode removeElements(ListNode head, int val) {
        while(head!=null&&head.val==val){
        	head=head.next;
        }
        if(head==null)
        	return head;
        ListNode left=head;
        ListNode current=head.next;
        while(current!=null){
        	if(current.val==val){
        		left.next=current.next;
        		current=current.next;
        	}
        	else{
        		left=left.next;
        		current=current.next;
        	}
        }
        return head;
    }
}
