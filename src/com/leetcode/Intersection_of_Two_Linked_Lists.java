package com.leetcode;

public class Intersection_of_Two_Linked_Lists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    	if(headA==null||headB==null)
    		return null;
        int lengthA=1,lengthB=1;
        ListNode tempA=headA;
        while(tempA.next!=null){
        	tempA=tempA.next;
        	lengthA++;
        }
        ListNode tempB=headB;
        while(tempB.next!=null){
        	tempB=tempB.next;
        	lengthB++;
        }
        if(tempA!=tempB)
        	return null;
        tempA=headA;tempB=headB;
        if(lengthA>lengthB){
        	while(lengthA>lengthB){
        		lengthA--;
        		tempA=tempA.next;
        	}
        }
        else{
        	while(lengthB>lengthA){
        		lengthB--;
        		tempB=tempB.next;
        	}
        }
        while(tempA!=tempB){
        	tempA=tempA.next;
        	tempB=tempB.next;
        }
        return tempA;
    }
}
