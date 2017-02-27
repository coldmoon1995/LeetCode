package com.leetcode;

public class MergeTwoSortedLists {
	    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
	       ListNode p=l1,q=l2,temp = new ListNode(0),root=new ListNode(0);
	       if(l1==null)
	    	   return l2;
	       if(l2==null)
	    	   return l1;
	       if(l1.val<=l2.val){
	    	   temp.val=l1.val;
	    	   p=p.next;
	       }
	       else{
	    	   temp.val=l2.val;
	    	   q=q.next;
	       }
	       root.next=temp;
	       while(p!=null&&q!=null){
	    	   if(p.val<=q.val){
	    		   temp.next=p;
	    		   temp=temp.next;
	    		   p=p.next;
	    	   }
	    	   else{
	    		   temp.next=q;
	    		   temp=temp.next;
	    		   q=q.next;
	    	   }	   
	       }
	       if(p==null)
	    	   temp.next=q;
	       else
	    	   temp.next=p;
	       return root.next;
	    }
}
