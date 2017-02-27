package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Majority_Element {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map=new HashMap<Integer, Integer>();
        int max=0;
        int majority=nums[0];
        for(int i=0;i<nums.length;i++){
        	if(!map.containsKey(nums[i])){
        		map.put(nums[i], 1);
        	}
        	else{
        		map.put(nums[i], map.get(nums[i])+1);
        	}
        	if(map.get(nums[i])>max){
        		max=map.get(nums[i]);
        		majority=nums[i];
        	}
        }
        return majority;
    }
}
