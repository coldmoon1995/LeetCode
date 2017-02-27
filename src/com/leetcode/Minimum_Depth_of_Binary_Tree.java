package com.leetcode;

public class Minimum_Depth_of_Binary_Tree {
    public int minDepth(TreeNode root) {
        if(root==null)
        	return 0;
        if(root.left==null&&root.right==null)
        	return 1;
        else if(root.left!=null&&root.right==null)
        	return 1+minDepth(root.left);
        else if(root.left==null&&root.right!=null)
        	return 1+minDepth(root.right);
        else
        	return 1+Math.min(minDepth(root.left), minDepth(root.right));
    }
}
