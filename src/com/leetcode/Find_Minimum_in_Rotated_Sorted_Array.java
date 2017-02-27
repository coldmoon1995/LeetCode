package com.leetcode;

public class Find_Minimum_in_Rotated_Sorted_Array {
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
        return Math.min(nums[left], nums[right]);
    }
}
