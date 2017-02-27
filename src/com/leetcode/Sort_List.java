package com.leetcode;

public class Sort_List {
    public ListNode sortList(ListNode head) {
    	if(head==null||head.next==null)
    		return head;
    	ListNode mid=findMid(head);
    	ListNode nextHead=mid.next;
    	mid.next=null;
    	return merge(sortList(head), sortList(nextHead));
    }
    public ListNode findMid(ListNode head){ //找到中间节点
    	ListNode fast=head;
    	ListNode slow=head;
    	while(fast.next!=null&&fast.next.next!=null){
    		fast=fast.next.next;
    		slow=slow.next;
    	}
    	return slow;
    }

    public ListNode merge(ListNode p1,ListNode p2){
    	ListNode preHead=new ListNode(0);
    	preHead.next=p1;
    	ListNode current=preHead;
    	while(p1!=null||p2!=null){
    		if(p1==null){
    			current.next=p2;
    			current=current.next;
    			p2=p2.next;
    		}
    		else if(p2==null){
    			current.next=p1;
    			current=current.next;
    			p1=p1.next;
    		}
    		else if(p1.val<=p2.val){
    			current.next=p1;
    			current=current.next;
    			p1=p1.next;
    		}
    		else{
    			current.next=p2;
    			current=current.next;
    			p2=p2.next;
    		}
    	}
    	return preHead.next;
    }
}
