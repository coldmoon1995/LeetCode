package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Path_Sum_II {  
    List<List<Integer>> result = new ArrayList<List<Integer>>();  
    List<Integer> path = new ArrayList<Integer>();  
    public List<List<Integer>> pathSum(TreeNode root, int sum) {  
    	addPath(root, 0, sum);
    	return result;
    }  
    public void addPath(TreeNode node,int sum,int target){
    	if(node==null){
    		return;}
    	path.add(node.val);
    	if(node.left==null&&node.right==null){
    		if(sum+node.val==target){
    			result.add(new ArrayList<Integer>(path));
    			return;
    		}
    		else
    			return;
    	}
    	sum+=node.val;
    	if(node.left!=null){
    		addPath(node.left,sum,target);
    		path.remove(path.size()-1);}
    	if(node.right!=null){
    		addPath(node.right, sum, target);
    		path.remove(path.size()-1);
    	}
    }
}  