package com.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Binary_Tree_Zigzag_Level_Order_Traversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    	List<List<Integer>> lists=new ArrayList<List<Integer>>();
    	if(root==null)
    		return lists;
    	Queue<TreeNode> queue=new LinkedList<TreeNode>();
    	queue.add(root);
    	queue.add(null);
    	boolean right=false;
    	List<Integer> list=new ArrayList<Integer>();
    	while(!queue.isEmpty()){
    		TreeNode cur=queue.poll();
    		if(cur==null){
    			if(!queue.isEmpty())
    				queue.add(null);
    			
    			System.out.println(right);
    			if(right)
    				Collections.reverse(list);
    			lists.add(new ArrayList<Integer>(list));
    			list.clear();
    			right=!right;
    		}
    		else{
    			list.add(cur.val);
    			if(cur.left!=null)	queue.offer(cur.left);
    			if(cur.right!=null)	queue.offer(cur.right);
    			
    		}
    	}
    	return lists;
    }
}
