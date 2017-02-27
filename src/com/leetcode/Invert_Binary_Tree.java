package com.leetcode;

public class Invert_Binary_Tree {
    public TreeNode invertTree(TreeNode root) {
    	if(root==null)
    		return null;
        invert(root);
        return root;
    }
    public void invert(TreeNode root){
    	if(root.left==null&&root.right==null)
    		return;
    	if(root.left==null&&root.right!=null){
    		root.left=root.right;
    		root.right=null;
    		invert(root.left);
    	}
    	else if(root.left!=null&&root.right==null){
    		root.right=root.left;
    		root.left=null;
    		invert(root.right);
    	}
    	else{
    		TreeNode temp=root.left;
    		root.left=root.right;
    		root.right=temp;
    		invert(root.left);
    		invert(root.right);
    	}
    }
}
