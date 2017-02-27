package com.leetcode;

import java.util.Arrays;
//±©Á¦Çó½â
public class MedianofTwoSortedArrays {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums3=Arrays.copyOf(nums1, nums1.length+nums2.length);
        System.arraycopy(nums2,0,nums3,nums1.length,nums2.length);
        Arrays.sort(nums3);
        if(nums3.length%2==1)
        	return nums3[nums3.length/2];
        else
        	return ((double)(nums3[nums3.length/2-1]+nums3[nums3.length/2]))/2;
       
    }
}
