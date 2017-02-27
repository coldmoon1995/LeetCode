package com.leetcode;

public class Two_Sum_II {
    public int[] twoSum(int[] numbers, int target) {
        int[] indexs=new int[2];
        int left=0,right=numbers.length-1;
        while(left<right){
        	if(numbers[left]+numbers[right]==target){
        		indexs[0]=left+1;
        		indexs[1]=right+1;
        		break;
        	}
        	else if(numbers[left]+numbers[right]>target){
        		right--;
        	}
        	else{
        		left++;
        	}
        }
        return indexs;
    }
}
