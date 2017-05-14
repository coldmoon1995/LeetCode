package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Subsets_II {
	public List<List<Integer>> subsetsWithDup(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> res=new ArrayList<List<Integer>>();
		List<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<=nums.length;i++){
			int left=i;
			backtract(res, list, nums, left, 0);
		}
		return res;
    }
	public void backtract(List<List<Integer>> res,List<Integer> list,int[] nums,int left,int i){
		if(left==0){
			res.add(new ArrayList<Integer>(list));
			return;
		}
		if(i+left>nums.length)
			return;
		for(int j=i;j<nums.length;j++){
			if(j>i&&nums[j]==nums[j-1])
				continue;
			list.add(nums[j]);
			backtract(res, list, nums, left-1, j+1);
			list.remove(list.size()-1);
		}
	}
	public static void main(String[] args) {
		int[] nums={1,4,4,4};
		Subsets_II test=new Subsets_II();
		List<List<Integer>> res=test.subsetsWithDup(nums);
		for(int i=0;i<res.size();i++){
			System.out.println(res.get(i).toString());
		}
	}

}
