package com.leetcode;

public class Trapping_Rain_Water {
    public int trap(int[] height) {
    	if(height.length<=1)
    		return 0;
        int water=0;
        int left=0,current=1;
        int temp=0;
        while(current<height.length){
        	if(height[current]>=height[left]){
        		water+=height[left]*(current-left-1)-temp;
        		left=current;
        		temp=0;
        	}
        	else{
        		temp+=height[current];
        	}
        	current++;
        }
        int right=height.length-1;
        current=height.length-2;
        temp=0;
        while(current>=left){
        	if(height[current]>=height[right]){
        		water+=height[right]*(right-current-1)-temp;
        		right=current;
        		temp=0;
        	}
        	else{
        		temp+=height[current];
        	}
        	current--;
        }
        return water;
    }
}
