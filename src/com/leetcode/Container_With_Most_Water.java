package com.leetcode;

public class Container_With_Most_Water {
    public int maxArea(int[] height) {
        if(height==null||height.length<1)
        	return 0;
        int left=0,right=height.length-1;
        int maxResult=0;
        int result=0;
        while(left<right){
        	result=(right-left)*Math.min(height[left], height[right]);
        	if(result>maxResult)
        		maxResult=result;
        	if(height[left]>height[right])
        		right--;
        	else
        		left++;
        }
        return maxResult;
    }
}
