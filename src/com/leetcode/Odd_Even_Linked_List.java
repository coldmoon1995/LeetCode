package com.leetcode;

public class Odd_Even_Linked_List {
    public ListNode oddEvenList(ListNode head) {
        if(head==null||head.next==null)
        	return head;
        ListNode odd=head;
        ListNode even=head.next;
        while(even.next!=null&&even.next.next!=null){
        	ListNode temp=even.next.next;
        	even.next.next=odd.next;
        	odd.next=even.next;
        	even.next=temp;
        	even=even.next;
        	odd=odd.next;
        }
        if(even.next!=null){
        	even.next.next=odd.next;
        	odd.next=even.next;
        	even.next=null;
        }
    	return head;
    }
}
