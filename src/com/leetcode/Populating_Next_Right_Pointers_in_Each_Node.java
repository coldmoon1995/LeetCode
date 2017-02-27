package com.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class Populating_Next_Right_Pointers_in_Each_Node {
    public void connect(TreeLinkNode root) {
    	if(root==null||(root.left==null&&root.right==null))
    		return;
        Queue<TreeLinkNode> queue=new LinkedList<TreeLinkNode>();
        queue.offer(root);
        queue.offer(null);
        TreeLinkNode parent=null;
        while(!queue.isEmpty()){
        	if(parent!=null){
        		parent.next=queue.peek();
        	}
        	parent=queue.peek();
        	queue.poll();
        	if(parent==null){
        		if(queue.peek()!=null)
        			queue.offer(null);
        	}
        	else{
        		if(parent.left!=null)
        			queue.offer(parent.left);
        		if(parent.right!=null)
        			queue.offer(parent.right);
        	}
        }
    }
}
