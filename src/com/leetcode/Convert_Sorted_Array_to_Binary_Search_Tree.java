package com.leetcode;

public class Convert_Sorted_Array_to_Binary_Search_Tree {
    public TreeNode sortedArrayToBST(int[] nums) {
    	if(nums==null||nums.length==0)
    		return null;
        int left=0,right=nums.length-1;
        int mid=left+(right-left)/2;
        TreeNode root=new TreeNode(nums[mid]);
        arrayToBST(nums, left, mid-1, root,"left");
        arrayToBST(nums, mid+1, right, root,"right");
        return root;
    }
    private void arrayToBST(int[] nums,int left,int right,TreeNode root,String s){
    	if(left>right)
    		return;
    	int mid=left+(right-left)/2;
    	TreeNode node=new TreeNode(nums[mid]);
    	if(s.equals("left")){
    		root.left=node;
    	}
    	else{
    		root.right=node;
    	}
    	arrayToBST(nums, left, mid-1, node,"left");
        arrayToBST(nums, mid+1, right, node,"right");
    }
}
