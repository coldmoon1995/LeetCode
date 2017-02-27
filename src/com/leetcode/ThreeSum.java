package com.leetcode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
	    public List<List<Integer>> threeSum(int[] nums) {
    	List<List<Integer>> lists=new ArrayList<List<Integer>>();
    	if(nums.length<3)
    		return lists;
    	Arrays.sort(nums);
    	int left,right;
    	for(int i=0;i<nums.length;i++){
    		left=i+1;right=nums.length-1;
    		while(left<right){
    			if(nums[i]+nums[left]+nums[right]==0){
    				if(i!=0){
    					if(nums[i]!=nums[i-1]){
    						lists.add(Arrays.asList(nums[i],nums[left],nums[right]));
    					}
    				}
    				else if(i==0){
    						lists.add(Arrays.asList(nums[i],nums[left],nums[right]));
    					}
    			while(left<right){
    				right--;left++;
    				if(nums[right+1]!=nums[right]||nums[left]!=nums[left-1])
    					break;
    			}
    			}
    			else if(nums[i]+nums[left]+nums[right]>0){
    				while(left<right){
    					right--;
    					if(nums[right+1]!=nums[right])
        					break;
    				}
    			}
    			else{
    				while(left<right){
    					left++;
    					if(nums[left]!=nums[left-1])
    						break;
    				}
    			}
    				
    		}
    	}
     	return lists;
    }
}
