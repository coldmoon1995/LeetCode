package com.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Binary_Tree_Level_Order_Traversal_II {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
    	List<List<Integer>> lists=new ArrayList<List<Integer>>();
    	if(root==null)
    		return lists;
    	Queue<TreeNode> queue=new LinkedList<TreeNode>();
    	queue.offer(root);
    	queue.offer(null);
    	List<Integer> list=new ArrayList<Integer>();
    	while(!queue.isEmpty()){
    		TreeNode cur=queue.poll();
    		if(cur==null){
    			if(!queue.isEmpty())
    				queue.add(null);
    			lists.add(new ArrayList<Integer>(list));
    			list.clear();
    		}
    		else{
    			list.add(cur.val);
    			if(cur.left!=null)	queue.add(cur.left);
    			if(cur.right!=null)	queue.add(cur.right);
    		}
    	}
    	Collections.reverse(lists);
    	return lists;
    }
}
