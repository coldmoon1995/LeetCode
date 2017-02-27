package com.leetcode;

import java.util.Arrays;

public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        int sumClosest=nums[0]+nums[1]+nums[2],sum;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
        	int left=i+1,right=nums.length-1;
        	while(left<right){
        		sum=nums[i]+nums[left]+nums[right];
        		if(sum==target)
        			return target;
        		else if(sum>target)
        			right--;
        		else
        			left++;
        		if(Math.abs(sum-target)<Math.abs(sumClosest-target))
    				sumClosest=sum;
        	}
        	
        }
    	return sumClosest;
    }
}
