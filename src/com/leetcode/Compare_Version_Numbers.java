package com.leetcode;

public class Compare_Version_Numbers {
	public int compareVersion(String version1, String version2) {
		String[] str1=version1.split("\\.");
		String[] str2=version2.split("\\.");
		int[] nums1=new int[str1.length];
		int[] nums2=new int[str2.length];
		for(int i=0;i<nums1.length;i++){
			nums1[i]=Integer.parseInt(str1[i]);
		}
		for(int i=0;i<nums2.length;i++){
			nums2[i]=Integer.parseInt(str2[i]);
		}
		return compareNums(nums1, nums2);
	}
	public int compareNums(int[] nums1,int[] nums2){
		for(int i=0;i<Math.min(nums1.length, nums2.length);i++){
			if(nums1[i]>nums2[i])
				return 1;
			if(nums1[i]<nums2[i])
				return -1;
		}
		if(nums1.length>nums2.length){
			for(int i=nums2.length;i<nums1.length;i++){
				if(nums1[i]!=0)
					return 1;
			}
			return 0;
		}
		else if(nums1.length>nums2.length)
			return 0;
		else{
			for(int i=nums1.length;i<nums2.length;i++){
				if(nums2[i]!=0)
					return -1;
			}
			return 0;
		}
	}
}
