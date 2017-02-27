package com.leetcode;

public class Palindrome_Linked_List {
    public boolean isPalindrome(ListNode head) {
    	if(head==null||head.next==null){
    		return true;
    	}
    	ListNode slow=head;
    	ListNode fast=head;
    	while(fast!=null&&fast.next!=null){
    		slow=slow.next;
    		fast=fast.next.next;
    	}
    	ListNode right=reverseList(slow);
    	while(right!=null){
    		if(right.val!=head.val)
    			return false;
    		right=right.next;
    		head=head.next;
    	}
    	return true;
    }
    public ListNode reverseList(ListNode head){
    	ListNode left=null;
    	while(head.next!=null){
    		ListNode temp=head.next;
    		head.next=left;
    		left=head;
    		head=temp;
    	}
    	head.next=left;
    	return head;
    }
}
