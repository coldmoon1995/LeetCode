package com.leetcode;

import java.util.Arrays;

public class Combination_Sum_IV {
    public int combinationSum4(int[] nums, int target) {
    	if(nums==null||nums.length==0)
    		return 0;
    	
        Arrays.sort(nums);
        if(nums[0]>target)
    		return 0;
        int[] dp=new int[target+1];
        for(int i=0;i<nums[0];i++){
        	dp[i]=0;
        }
        dp[nums[0]]=1;
        for(int i=nums[0];i<=target;i++){
        	int temp=0;
        	int k=0;
        	while(k<nums.length&&nums[k]<i){
        		temp+=dp[i-nums[k]];
        		k++;
        	}
        	if(k<nums.length&&nums[k]==i)
        		temp++;
        	dp[i]=temp;
        }
        return dp[target];
    }
}
