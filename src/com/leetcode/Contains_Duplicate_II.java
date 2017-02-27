package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Contains_Duplicate_II {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
    	if(nums==null||nums.length<1)
    		return false;
        Map<Integer, Integer> map=new HashMap<Integer, Integer>();
        for(int i=0;i<nums.length;i++){
        	if(map.containsKey(nums[i])&&i-map.get(nums[i])<=k){
        		return true;
        	}
        	else{
        		map.put(nums[i], i);
        	}
        }
        return false;
    }
}
