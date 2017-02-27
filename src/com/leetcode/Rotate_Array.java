package com.leetcode;

public class Rotate_Array {
	public void rotate_all(int[] nums,int left,int right){
		while(left<=right){
			int temp=nums[left];
			nums[left]=nums[right];
			nums[right]=temp;
			left++;right--;
		}
	}
    public void rotate(int[] nums, int k) {
    	if(nums.length<k){
    		k=k-nums.length;
    	}
    	rotate_all(nums,0,nums.length-k-1);
		rotate_all(nums,nums.length-k,nums.length-1);
		rotate_all(nums,0,nums.length-1);
    }
}
