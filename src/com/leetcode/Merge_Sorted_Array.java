package com.leetcode;


public class Merge_Sorted_Array {
	public void merge(int[] nums1, int m, int[] nums2, int n) {

		int left = 0;
		for (int i = 0; i < n; i++) {
			while (left < m && nums1[left] <= nums2[i]) {
				left++;
			}
			m++;
			if (left < m-1) {
				for (int j = m - 1; j > left; j--) {
					nums1[j] = nums1[j - 1];
				}
				nums1[left] = nums2[i];
			}
			else{
				nums1[m-1]=nums2[i];
			}
		}
	}
}
