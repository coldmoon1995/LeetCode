package com.leetcode;

public class Maximum_Subarray {
    public int maxSubArray(int[] nums) {
        if(nums==null||nums.length<1)
        	return 0;
        int current=0;
        int MaxResult=nums[0];
        int result=0;
        while(current<nums.length){
        	result+=nums[current];
        	if(result>MaxResult)
    			MaxResult=result;
        	if(result<0)
        		result=0;
        	current++;
        }
        return MaxResult;
    }
}
