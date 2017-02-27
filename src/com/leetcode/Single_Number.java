package com.leetcode;

public class Single_Number {
    public int singleNumber(int[] nums) {
    	if(nums==null||nums.length<1)
    		return 0;
        int result=0;
        for(int i=0;i<nums.length;i++){
        	result=result^nums[i];
        }
        return result;
    }
}
