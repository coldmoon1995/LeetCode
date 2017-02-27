package com.leetcode;

public class RemoveNthNodeFromEndofList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
    	ListNode p=head;
    	int m=0;
        while(p!=null){
        	m++;
        	p=p.next;
        }
        int x=0;
        ListNode q=new ListNode(0);
        q.next=head;
        if(m==n){
        	head=head.next;
        }
        else{
        	while(q.next!=null){
        	x++;
        	if(x==m-n){
        		q.next.next=q.next.next.next;
        		break;
        	}
        	q.next=q.next.next;
        	}
        }
        return head;
    }
}
