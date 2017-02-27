package com.leetcode;

public class Insertion_Sort_List {
    public ListNode insertionSortList(ListNode head) {
    	if(head==null||head.next==null)
    		return head;
        ListNode phead=new ListNode(0);
        phead.next=head;
        ListNode pre=head;
        head=head.next;
        
        while(head!=null){
        	if(head.val>=pre.val){
        		pre=head;
        		head=head.next;
        	}
        	else{
        		ListNode current=head;
        		pre.next=head.next;
        		head=head.next;
        		ListNode preTemp=phead;
        		ListNode temp=phead.next;
        		while(current.val>=temp.val){
        			preTemp=temp;
        			temp=temp.next;
        		}
        		preTemp.next=current;
        		current.next=temp;
        	}
        }
        return phead.next;
    }
}
