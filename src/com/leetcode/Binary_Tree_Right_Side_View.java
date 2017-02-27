package com.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Binary_Tree_Right_Side_View {
    public List<Integer> rightSideView(TreeNode root) {
    	List<Integer> list=new ArrayList<Integer>();
    	if(root==null)
    		return list;
    	Queue<TreeNode> queue=new LinkedList<TreeNode>();
    	queue.offer(root);
    	queue.offer(null);
    	TreeNode pre=null;
    	TreeNode cur=root;
    	while(!queue.isEmpty()){
    		pre=cur;
    		cur=queue.poll();
    		if(cur==null){
    			if(queue.isEmpty())
    				break;
    			queue.offer(null);
    			list.add(pre.val);
    			System.out.println(pre.val);
    		}
    		else{
	    		if(cur.left!=null)	queue.offer(cur.left);
    			if(cur.right!=null)	queue.offer(cur.right);
    		}
    	}
    	list.add(pre.val);
    	return list;
    }
}
