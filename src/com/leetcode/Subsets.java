package com.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Subsets {
	List<List<Integer>> lists=new ArrayList<List<Integer>>();
	List<Integer> list=new ArrayList<Integer>();
    public List<List<Integer>> subsets(int[] nums) {
        addList(nums, 0);
    	return lists;
    }
    public void addList(int[] nums,int current){
    	if(current>nums.length)
    		return;
    	if(current==nums.length){
    		List<Integer> temp=new ArrayList<Integer>(list);
    		Collections.sort(temp);
    		lists.add(temp);
    		return;
    	}
    	list.add(nums[current]);
    	addList(nums, current+1);	
    	list.remove(list.size()-1);
    	addList(nums, current+1);
    	
    }
}
