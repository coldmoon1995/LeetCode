package com.leetcode;

public class Remove_Duplicates_from_Sorted_List_II {
    public ListNode deleteDuplicates(ListNode head) {
    	if(head==null)
    		return head;
        ListNode preHead=new ListNode(0);
        preHead.next=head;
        ListNode pre=preHead;
        while(head!=null&&head.next!=null){
        	if(head.val==head.next.val){
        		while(head.next!=null&&head.val==head.next.val){
        			head=head.next;
        		}
        		pre.next=head.next;
        		head=head.next;
        	}
        	else{
        		pre=head;
        		head=head.next;
        	}
        }
        return preHead.next;
    }
}
