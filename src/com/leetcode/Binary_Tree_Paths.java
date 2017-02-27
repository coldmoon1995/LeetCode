package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Binary_Tree_Paths {
	List<String> list=new ArrayList<String>();
    public List<String> binaryTreePaths(TreeNode root) {
    	if(root==null)
    		return list;
    	if(root.left==null&&root.right==null){
    		list.add(new String(""+root.val));
    		return list;
    	}
    		
    	if(root.left!=null)
    		addTreePaths(root.left,""+root.val);
    	if(root.right!=null)
    		addTreePaths(root.right,""+root.val);
        return list;
    }
    private void addTreePaths(TreeNode node,String path){
    	path+="->"+node.val;
    	if(node.left==null&&node.right==null){
    		list.add(path);
    		return;
    	}
    	if(node.left!=null){
    		addTreePaths(node.left, path);
    	}
    	if(node.right!=null){
    		addTreePaths(node.right, path);
    	}
    }
}
