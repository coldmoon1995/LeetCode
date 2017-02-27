package com.leetcode;

import java.util.HashSet;
import java.util.Set;

public class Intersection_of_Two_Arrays {
	public int[] intersection(int[] nums1, int[] nums2) {
		if (nums1 == null || nums2 == null)
			return null;
		Set<Integer> set1 = new HashSet<Integer>();
		for (Integer integer : nums1) {
			set1.add(integer);
		}
		Set<Integer> set2 = new HashSet<Integer>();
		for (Integer integer : nums2) {
			set2.add(integer);
		}
		Set<Integer> res= new HashSet<Integer>();
		for (Integer integer : set2) {
			if(set1.contains(integer))
				res.add(integer);
		}
		int[] result=new int[res.size()];
		int i=0;
		for (int integer : res) {
			result[i]=integer;
			i++;
		}
		return result;
	}
}
