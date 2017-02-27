package com.leetcode;

public class Partition_List {
    public ListNode partition(ListNode head, int x) {
        ListNode p=new ListNode(0);
        ListNode q=new ListNode(0);
        ListNode phead=p;
        ListNode qhead=q;
        while(head!=null){
        	if(head.val<x){
        		p.next=head;
        		System.out.println("====="+p.next.val);
        		p=p.next;
        	}
        	else{
        		q.next=head;
        		System.out.println("------"+q.next.val);
        		q=q.next;
        	}
        	head=head.next;
        }
        p.next=qhead.next;
        q.next=null;
        return phead.next;
    }
}
