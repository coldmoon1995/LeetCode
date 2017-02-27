package com.leetcode;

import java.util.Arrays;

public class Product_of_Array_Except_Self {
    public int[] productExceptSelf(int[] nums) {
    	if(nums==null||nums.length<1)
    		return null;
    	int[] left=new int[nums.length];
    	left[0]=1;
    	for(int i=1;i<left.length;i++){
    		left[i]=left[i-1]*nums[i-1];
    	}
    	System.out.println(Arrays.toString(left));
    	int[] right=new int[nums.length];
    	right[right.length-1]=1;
    	for(int i=right.length-2;i>=0;i--){
    		right[i]=right[i+1]*nums[i+1];
    	}
    	System.out.println(Arrays.toString(right));
    	for(int i=0;i<nums.length;i++){
    		nums[i]=left[i]*right[i];
    	}
    	return nums;
    }
}
