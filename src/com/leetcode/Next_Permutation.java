package com.leetcode;

import java.util.Arrays;

public class Next_Permutation {
    public void nextPermutation(int[] nums) {
        if(nums.length<=1)	return;
        int max_temp=nums[nums.length-1];
        int right=nums.length-2;
        while(right>=0){
        	if(nums[right]>=max_temp){
        		max_temp=nums[right];
        		right--;
        	}
        	else
        		break;
        }
        if(right<0){
        	Arrays.sort(nums);
        	return;
        }
        @SuppressWarnings("unused")
		int temp=nums[nums.length-1];
        int i=nums.length-1;
        while(i>right){
        	if(nums[i]>nums[right])
        		break;
        	else
        		i--;
        }
        int temp_i=nums[i];
        nums[i]=nums[right];
        nums[right]=temp_i;
        int[] temp_array=Arrays.copyOfRange(nums, right+1, nums.length);
        Arrays.sort(temp_array);
        for(int j=right+1;j<nums.length;j++){
        	nums[j]=temp_array[j-right-1];
        	
        }
    }
}
