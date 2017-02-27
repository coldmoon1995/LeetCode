package com.leetcode;

public class SwapNodesinPairs {
    public ListNode swapPairs(ListNode head) {
        ListNode p=new ListNode(0);
        int temp;
        p.next=head;
        while(head!=null){
        	if(head.next!=null){
        		temp=head.val;
        		head.val=head.next.val;
        		head.next.val=temp;
        		head=head.next.next;
        	}
        	else
        		break;
        }
        return p.next;
    }
}
