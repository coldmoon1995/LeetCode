package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Summary_Ranges {
    public List<String> summaryRanges(int[] nums) {
    	List<String> res=new ArrayList<String>();
    	if(nums==null||nums.length<1)
    		return res;
    	int left=0,right=1;
    	while(right<nums.length){
    		if(nums[right]-nums[right-1]==1){
    			right++;
    		}
    		else{
    			String s="";
    			if(right-left>1)
    				s=nums[left]+"->"+nums[right-1];
    			else 
    				s=nums[left]+"";
    			res.add(s);
    			left=right;
    			right++;
    		}
    	}
    	String s="";
		if(right-left>1)
			s=nums[left]+"->"+nums[right-1];
		else 
			s=nums[left]+"";
		res.add(s);
		return res;
    }
}
