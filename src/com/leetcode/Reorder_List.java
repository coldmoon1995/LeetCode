package com.leetcode;

public class Reorder_List {
    public void reorderList(ListNode head) {
    	if(head==null||head.next==null)
    		return;
        ListNode last=findMidNode(head);
        ListNode head2=reverse(last.next);
        last.next=null;
        while(head!=null&&head2!=null){
        	ListNode temp1=head.next;
        	ListNode temp2=head2.next;
        	head.next=head2;
        	head2.next=temp1;
        	head=temp1;
        	head2=temp2;
        }
    }
    //ÕÒÖÐµã
    private ListNode findMidNode(ListNode head){
    	ListNode fast=head,slow=head;
    	while(fast.next!=null&&fast.next.next!=null){
    		fast=fast.next.next;
    		slow=slow.next;
    	}
    	return slow;
    }
    //×ªÖÃ
    private ListNode reverse(ListNode head){
    	ListNode pre=head;
    	ListNode cur=head.next;
    	pre.next=null;
    	while(cur!=null){
    		ListNode temp=cur.next;
    		cur.next=pre;
    		pre=cur;
    		cur=temp;
    	}
    	return pre;
    }
}
