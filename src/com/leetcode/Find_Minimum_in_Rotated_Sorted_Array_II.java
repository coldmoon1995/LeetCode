package com.leetcode;

public class Find_Minimum_in_Rotated_Sorted_Array_II {
    public int findMin(int[] nums) {
    	int left=0,right=nums.length-1;
        while(left<=right){
            int mid=(left+right)/2;
        	if(nums[mid]<Math.min(nums[left], nums[right])){
        		right=mid;
        	}
        	else if(nums[mid]>Math.max(nums[left], nums[right])){
        		left=mid;
        	}	
        	else{
        		break;
        	}
        }
        int min=nums[left];
        for(int i=left+1;i<=right;i++){
        	if(nums[i]<min){
        		min=nums[i];
        	}
        }
        return min;
    }
}
