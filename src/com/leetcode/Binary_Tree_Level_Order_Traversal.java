package com.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Binary_Tree_Level_Order_Traversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
    	List<List<Integer>> lists=new ArrayList<List<Integer>>();
    	if(root==null)
    		return lists;
    	List<Integer> list=new ArrayList<Integer>();
    	Queue<TreeNode> queue=new LinkedList<TreeNode>();
    	queue.add(root);
    	queue.add(null);
    	while(!queue.isEmpty()){
    		TreeNode current=queue.poll();
    		if(current==null){
    			if(!queue.isEmpty())
    				queue.offer(null);
    			lists.add(new ArrayList<Integer>(list));
    			list.clear();
    			
    		}
    		else{
    			list.add(current.val);
    			if(current.left!=null)	queue.offer(current.left);
    			if(current.right!=null)	queue.offer(current.right);
    		}
    	}
    	return lists;
    }
}
