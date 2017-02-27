package com.leetcode;

public class Search_for_a_Range {
    public int[] searchRange(int[] nums, int target) {
    	int[] result=new int[2];
    	if(nums==null||nums.length<1){
    		result[0]=-1;
    		result[1]=-1;
    		return result;
    	}
    		
        int left=0,right=nums.length-1;
        int temp=-1;
        while(left<=right){
        	int mid=(left+right)/2;
        	if(nums[mid]<target)
        		left=mid+1;
        	else if(nums[mid]>target)
        		right=mid-1;
        	else{
        		temp=mid;
        		break;
        	}
        }
        if(temp==-1){
        	result[0]=-1;
        	result[1]=-1;
        }
        else{
        	int begin=temp-1;
        	while(begin>=0){
        		if(nums[begin]==target)
        			begin--;
        		else
        			break;
        	}
        	result[0]=begin+1;
        	int end=temp+1;
        	while(end<nums.length){
        		if(nums[end]==target)
        			end++;
        		else
        			break;
        	}
        	result[1]=end-1;
        }
        return result;
    }
}
