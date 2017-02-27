package com.leetcode;

public class Validate_Binary_Search_Tree {
    public boolean isValidBST(TreeNode root) {
    	if(root==null)
    		return true;
        return isValidNode(root.left, Long.MIN_VALUE, root.val)
        		&&isValidNode(root.right, root.val, Long.MAX_VALUE);
    }
    private boolean isValidNode(TreeNode node,long min,long max){
    	if(node==null)
    		return true;
    	return (node.val>min)&&(node.val<max)&&isValidNode(node.left, min,node.val)
    			&&isValidNode(node.right, node.val, max);
    }
}
