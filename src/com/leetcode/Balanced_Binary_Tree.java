package com.leetcode;

public class Balanced_Binary_Tree {
    public boolean isBalanced(TreeNode root) {
        if(root==null)
        	return true;
        return Math.abs(dfsLength(root.left)-dfsLength(root.right))<=1
        		&&isBalanced(root.left)&&isBalanced(root.right);
    }
    private int dfsLength(TreeNode root){
    	if(root==null)
    		return 0;
    	return Math.max(dfsLength(root.left), dfsLength(root.right))+1;
    }
}
