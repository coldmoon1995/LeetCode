package com.leetcode;

public class Missing_Number {
    public int missingNumber(int[] nums) {
        if(nums==null||nums.length<1)
        	return 0;
        int total=(nums.length*(nums.length+1))/2;
        int result=total;
        for(int i=0;i<nums.length;i++){
        	result-=nums[i];
        }
        return result;
    }
}
