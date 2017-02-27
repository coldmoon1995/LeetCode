package com.leetcode;

public class Maximum_Product_Subarray {
    public int maxProduct(int[] nums) {
        int[][] dp=new int[nums.length][nums.length];
        int result=nums[0];
        for(int i=0;i<nums.length;i++){
        	for(int j=i;j<nums.length;j++){
        		if(i==j){
        			dp[i][j]=nums[i];
        			if(dp[i][j]>result)
        				result=dp[i][j];
        		}
        		else{
        			dp[i][j]=dp[i][j-1]*nums[j];
        			if(dp[i][j]>result)
        				result=dp[i][j];
        		}
        	}
        }
        return result;
    }
}
