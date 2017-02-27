package com.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Binary_Tree_Inorder_Traversal {
    public List<Integer> inorderTraversal(TreeNode root) {
    	List<Integer> list=new ArrayList<Integer>();
    	Stack<TreeNode> stack=new Stack<TreeNode>();
    	while(!stack.empty()||root!=null){
    		while(root!=null){
    			stack.push(root);
    			root=root.left;
    		}
    		if(!stack.empty()){
    			root=stack.peek();
    			list.add(root.val);
    			stack.pop();
    			root=root.right;
    		}
    	}
    	return list;
    }
}
