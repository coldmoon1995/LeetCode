package com.leetcode;

public class Move_Zeroes {
    public void moveZeroes(int[] nums) {
        if(nums==null||nums.length<1)
        	return;
        int left=0;
        int current=0;
        while(current<nums.length){
        	if(nums[current]!=0){
        		nums[left++]=nums[current++];
        	}
        	else{
        		current++;
        	}
        }
        for(int i=left;i<nums.length;i++){
        	nums[i]=0;
        }
    }
}
