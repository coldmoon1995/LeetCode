package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Sum_Root_to_Leaf_Numbers {
	List<String> list=new ArrayList<String>();
	StringBuilder sb=new StringBuilder();
    public int sumNumbers(TreeNode root) {
    	addList(root);
    	int res=0;
    	for (String str:list) {
			res+=Integer.parseInt(str);
		}
    	return res;
    }
    public void addList(TreeNode root){
    	if(root==null)
    		return;
    	sb.append(root.val);
    	if(root.left==null&&root.right==null){
    		list.add(sb.toString());
    		return;
    	}
    	if(root.left!=null){
    		addList(root.left);
    		sb.deleteCharAt(sb.length()-1);
    	}
    	if(root.right!=null){
    		addList(root.right);
    		sb.deleteCharAt(sb.length()-1);
    	}
    }

}
