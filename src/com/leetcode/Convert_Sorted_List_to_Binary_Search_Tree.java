package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Convert_Sorted_List_to_Binary_Search_Tree {
    public TreeNode sortedListToBST(ListNode head) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        while(head!=null){
        	list.add(head.val);
        	head=head.next;
        }
        return sortedArrayToBST(list);
        	
    }
    private TreeNode sortedArrayToBST(List<Integer> list)  {
    	if(list==null||list.size()==0)
    		return null;
        int left=0,right=list.size()-1;
        int mid=left+(right-left)/2;
        TreeNode root=new TreeNode(list.get(mid));
        arrayToBST(list, left, mid-1, root,"left");
        arrayToBST(list, mid+1, right, root,"right");
        return root;
    }
    private void arrayToBST(List<Integer> list,int left,int right,TreeNode root,String s){
    	if(left>right)
    		return;
    	int mid=left+(right-left)/2;
    	TreeNode node=new TreeNode(list.get(mid));
    	if(s.equals("left")){
    		root.left=node;
    	}
    	else{
    		root.right=node;
    	}
    	arrayToBST(list, left, mid-1, node,"left");
        arrayToBST(list, mid+1, right, node,"right");
    }
}
