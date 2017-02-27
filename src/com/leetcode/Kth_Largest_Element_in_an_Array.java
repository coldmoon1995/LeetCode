package com.leetcode;

public class Kth_Largest_Element_in_an_Array {
    public int findKthLargest(int[] nums, int k) {
        build_Heap(nums);
        for(int i=nums.length-1;i>=nums.length-k;i--){
        	int old=nums[0];
        	nums[0]=nums[i];
        	nums[i]=old;
        	max_Heapify(nums, 0,i-1);
        }
        return nums[nums.length-k];
    }
    private void max_Heapify(int[] nums,int i,int high){
    	int left=2*i+1,right=2*i+2;
    	while(left<=high){
    		int temp=left;
    		if(right<=high&&nums[left]<nums[right]){
    			temp=right;
    		}
    		if(nums[i]<nums[temp]){
    			int old=nums[i];
    			nums[i]=nums[temp];
    			nums[temp]=old;
    			i=temp;
    			left=2*i+1;
    			right=2*i+2;
    		}
    		else
    			break;
    	}
    }
    private void build_Heap(int[] nums){
    	for(int i=(nums.length-2)/2;i>=0;i--){
    		max_Heapify(nums, i,nums.length-1);
    	}
    }
}
