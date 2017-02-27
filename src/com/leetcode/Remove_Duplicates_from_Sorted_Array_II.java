package com.leetcode;

public class Remove_Duplicates_from_Sorted_Array_II {
	public int removeDuplicates(int[] nums) {
        if(nums==null||nums.length<1)
        	return 0;
        int count=0;
        int k=1;
        int flag=1,current=1;
        while(current<nums.length){
        	if(nums[current]==nums[current-1]){
        		flag++;
        		if(flag<=2){
        			nums[k]=nums[current];
        			k++;
        		}
        		else{
        			count++;
        		}
        	}
        	else{
        		flag=1;
        		nums[k]=nums[current];
        		k++;
        	}
        	current++;
        }
        return nums.length-count;
	}
    /*public int removeDuplicates(int[] nums) {
        if(nums==null||nums.length<1)
        	return 0;
        int[] result = new int[nums.length];
        result[0]=nums[0];
        int k=1;
        int flag=1,current=1;
        while(current<nums.length){
        	if(nums[current]==nums[current-1]){
        		flag++;
        		if(flag<=2){
        			result[k]=nums[current];
        			k++;
        		}
        	}
        	else{
        		flag=1;
        		result[k]=nums[current];
    			k++;
        	}
        	current++;
        }
        for(int i=0;i<k;i++){
        	nums[i]=result[i];
        }
        return k;
    }*/
}
