package com.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class K_diff_Pairs_in_an_Array {
	public int findPairs(int[] nums, int k) {
		if (nums == null || nums.length == 0 || k < 0)   return 0;
		if(k==0){
			int temp=0;
			HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
			for(int i=0;i<nums.length;i++){
				if(map.containsKey(nums[i])){
					if(map.get(nums[i])==1)
						temp++;
					map.put(nums[i], map.get(nums[i])+1);
				}
				else
					map.put(nums[i], 1);
			}
			return temp;
			
		}
		HashSet<Integer> set=new HashSet<Integer>();
		
		for(int i=0;i<nums.length;i++){
			set.add(nums[i]);
		}
		int res=0;
		for (Integer integer : set) {
			if(set.contains(integer+k))
				res++;
		}
		return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		K_diff_Pairs_in_an_Array test=new K_diff_Pairs_in_an_Array();
		int[] nums={1, 3, 1, 1,2,2,5, 4};
		System.out.println(test.findPairs(nums, 0));
	}

}
