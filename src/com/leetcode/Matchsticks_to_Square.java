package com.leetcode;

import java.util.Arrays;

public class Matchsticks_to_Square {
	public boolean backtrack(int[] nums,int[] sums,int i,int sum){
		
		if(i==nums.length){
			for(int j=0;j<4;j++){
				if(sums[j]!=sum/4)
					return false;
			}
			return true;
		}
		for(int j=0;j<4;j++){
			if(sums[j]+nums[i]>sum/4)
				continue;
			sums[j]+=nums[i];
			if(backtrack(nums, sums, i+1,sum))
				return true;
			sums[j]-=nums[i];			
		}
		return false;
	}
	public boolean makesquare(int[] nums) {
        if(nums==null||nums.length==0)
        	return false;
        int sum=0;
        for(int i=0;i<nums.length;i++)
        	sum+=nums[i];
        if(sum%4!=0)
        	return false;
        int[] sums={0,0,0,0};
        return backtrack(nums, sums, 0, sum);
       
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Matchsticks_to_Square test=new Matchsticks_to_Square();
		int[] nums={3,3,3,3,4};
		System.out.println(test.makesquare(nums));
	}

}
