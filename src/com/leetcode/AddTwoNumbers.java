package com.leetcode;
/*
 * 主要考虑进位，一链表长于另一链表的情况
 */
	public class AddTwoNumbers {
	    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	    	ListNode p=l1;
	    	ListNode q=l2;
	    	ListNode r=new ListNode(0);
	    	int i=0;
	    	while(p!=null||q!=null||i!=0){
	    		if(p!=null&&q!=null){
	    		p.val=p.val+q.val+i;
	    		if(p.val>=10)
	    			i=1;
	    		else
	    			i=0;
	    		p.val=p.val%10;
	    		r.next=p;
	    		p=p.next;
	    		q=q.next;
	    		}
	    		else if(p!=null&&q==null){
	    			p.val=p.val+i;
	    			if(p.val>=10)
		    			i=1;
		    		else
		    			i=0;
	    			p.val=p.val%10;
	    			r.next=p;
	    			p=p.next;
	    		}
	    		else if(p==null&&q!=null){
	    			(r.next).next=q;
	    			r.next=q;
	    			q.val=q.val+i;
	    			if(q.val>=10)
		    			i=1;
		    		else
		    			i=0;
	    			q.val=q.val%10;
	    			q=q.next;
	    		}
	    		else if(i!=0){
	    			ListNode newNode=new ListNode(1);
	    			(r.next).next=newNode;
	    			i=0;
	    		}
	    	}
	    	
	    	return l1;
	}
	}
