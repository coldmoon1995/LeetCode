package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Longest_Increasing_Subsequence {
    public int lengthOfLIS(int[] nums) {
        int[] sortNums=nums.clone();
        Arrays.sort(sortNums);
        List<Integer> list=new ArrayList<Integer>();
        list.add(sortNums[0]);
        for(int i=1;i<sortNums.length;i++){
        	if(sortNums[i]!=sortNums[i-1])
        		list.add(sortNums[i]);
        }
        int[] nums1=new int[list.size()];
        for(int i=0;i<list.size();i++)
        	nums1[i]=list.get(i);
        return lcs(nums, nums1);
    }
    private int lcs(int[] nums1,int[] nums2){
    	int[][] dp=new int[nums1.length+1][nums2.length+1];
    	for(int i=0;i<=nums1.length;i++)
    		dp[i][0]=0;
    	for(int i=0;i<=nums2.length;i++)
    		dp[0][i]=0;
    	for(int i=1;i<=nums1.length;i++){
    		for(int j=1;j<=nums2.length;j++){
    			if(nums1[i-1]==nums2[j-1])
    				dp[i][j]=dp[i-1][j-1]+1;
    			else
    				dp[i][j]=Math.max(dp[i][j-1], dp[i-1][j]);
    		}
    	}
    	return dp[nums1.length][nums2.length];
    }
}
