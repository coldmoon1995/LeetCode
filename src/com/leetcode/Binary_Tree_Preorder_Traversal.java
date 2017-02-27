package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Binary_Tree_Preorder_Traversal {
	List<Integer> list=new ArrayList<Integer>();
    public List<Integer> preorderTraversal(TreeNode root) {
        preTraver(root);
        return list;
    }
    public void preTraver(TreeNode root){
    	if(root==null)
    		return;
    	list.add(root.val);
    	preTraver(root.left);
    	preTraver(root.right);
    }
}
