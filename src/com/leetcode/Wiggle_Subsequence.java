package com.leetcode;

public class Wiggle_Subsequence {
    public int wiggleMaxLength(int[] nums) {
    	if(nums==null||nums.length<1)
    		return 0;
        int res1=1;
        int temp=nums[0];
        boolean flag=true;
        for(int i=1;i<nums.length;i++){
        	if(flag){
        		if(nums[i]>temp){
        			flag=false;	
        			res1++;
        		}
        		temp=nums[i];
        	}
        	else{
        		if(nums[i]<temp){
        			flag=true;
        			res1++;
        		}
        		temp=nums[i];
        	}
        }
        
        int res2=1;
        flag=false;
        temp=nums[0];
        for(int i=1;i<nums.length;i++){
        	if(flag){
        		if(nums[i]>temp){
        			flag=false;	
        			res2++;
        		}
        		temp=nums[i];
        	}
        	else{
        		if(nums[i]<temp){
        			flag=true;
        			res2++;
        		}
        		temp=nums[i];
        	}
        }
        return Math.max(res1, res2);
    }
}
