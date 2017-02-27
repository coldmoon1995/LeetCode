package com.leetcode;

public class Remove_Duplicates_from_Sorted_List {
    public ListNode deleteDuplicates(ListNode head) {
    	if(head==null||head.next==null)
    		return head;
        ListNode left=head;
        ListNode right=head;
        while(right!=null){
        	while(right.next!=null&&right.val==right.next.val){
        		right=right.next;
        	}
        	left.next=right.next;
        	left=right.next;
        	right=right.next;
        }
    	return head;
    }
}
