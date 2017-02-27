package com.leetcode;

public class Search_Insert_Position {
    public int searchInsert(int[] nums, int target) {
    	if(nums==null||nums.length<1)
    		return -1;
        int left=0,right=nums.length-1;
        while(left<=right){
        	int mid=(left+right)/2;
        	if(target<nums[mid]){
        		right=mid-1;
        	}
        	else if(target>nums[mid]){
        		left=mid+1;
        	}
        	else{
        		return mid;
        	}
        }
        return left;		
    }
}
