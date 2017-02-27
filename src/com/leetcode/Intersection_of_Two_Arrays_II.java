package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Intersection_of_Two_Arrays_II {
    public int[] intersect(int[] nums1, int[] nums2) {
    	List<Integer> res=new ArrayList<Integer>();
    	if(nums1==null||nums2==null)
    		return null;
        List<Integer> list1=new ArrayList<Integer>();
        for (Integer integer : nums1) {
        	list1.add(integer);
		}
        for(int i=0;i<nums2.length;i++){
        	if(list1.contains(nums2[i])){
        		res.add(nums2[i]);
        		int temp=list1.lastIndexOf(nums2[i]);
        		list1.remove(temp);
        	}
        }
        int[] result=new int[res.size()];
        int i=0;
        for (Integer integer : res) {
			result[i++]=integer;
		}
        return result;
    }
}
