package com.leetcode;

public class Jump_Game {
    public boolean canJump(int[] nums) {
       return jump(nums,0);
    }
    public boolean jump(int[] nums,int key){
    	
    	if(key==nums.length-1){
    		return true;
    	}
    	else if(key>=nums.length||nums[key]<1)
    		return false;
    	else{
    		boolean result=false;
    		for(int i=1;i<=nums[key];i++){
    			result=result||jump(nums,key+i);
    		}
    		return result;
    	}
    }
}
