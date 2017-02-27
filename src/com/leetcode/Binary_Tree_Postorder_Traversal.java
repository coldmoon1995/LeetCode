package com.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Binary_Tree_Postorder_Traversal {
    public List<Integer> postorderTraversal(TreeNode root) {
    	List<Integer> list=new ArrayList<Integer>();
    	if(root==null)
    		return list;
    	Stack<TreeNode> stack=new Stack<TreeNode>();
    	TreeNode pre=null;
    	stack.push(root);
    	while(!stack.isEmpty()){
    		TreeNode cur=stack.peek();
    		if((cur.left==null&&cur.right==null)
    				||((pre!=null)&&(cur.left==pre||cur.right==pre))){
    			list.add(cur.val);
    			stack.pop();
    			pre=cur;
    		}
    		else{
    			if(cur.right!=null) stack.push(cur.right);
    			if(cur.left!=null) stack.push(cur.left);
    		}
    	}
    	return list;
    }
}
