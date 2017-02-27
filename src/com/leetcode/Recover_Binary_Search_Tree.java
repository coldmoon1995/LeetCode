package com.leetcode;
public class Recover_Binary_Search_Tree {
	TreeNode firstNode=null;
	TreeNode secordNode=null;
	//pre指向上一个结点
	TreeNode pre=new TreeNode(Integer.MIN_VALUE);
    public void recoverTree(TreeNode root) {
    	inorder(root);
    	int temp=firstNode.val;
    	firstNode.val=secordNode.val;
    	secordNode.val=temp;
    }
    private void inorder(TreeNode root){
    	if(root==null)
    		return;
    	inorder(root.left);
    	if(firstNode==null&&root.val<pre.val)
    		firstNode=pre;
    	if(firstNode!=null&&root.val<pre.val)
    		secordNode=root;
    	pre=root;
    	inorder(root.right);
    }
}
