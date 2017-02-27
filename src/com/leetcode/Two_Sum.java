package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Two_Sum {
	public int[] index=new int[2];
	public int[] twoSum(int[] nums, int target) {
		Map<Integer,Integer> m=new HashMap<Integer,Integer>();
		for(int i=0;i<nums.length;i++){
			if(!m.containsKey(nums[i]))
				m.put(target-nums[i],i);
			else{
				index[0]=m.get(nums[i])+1;
				index[1]=i+1;
			}
				
		}
        return index;
    }
}
