package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Permutations_II {
	List<List<Integer>> lists = new ArrayList<List<Integer>>();

	public List<List<Integer>> permuteUnique(int[] nums) {
		addList(nums, 0, nums.length - 1);
		return lists;
	}

	public void addList(int[] nums, int left, int right) {
		if (left > right)
			return;
		if (left == right) {
			List<Integer> list = new ArrayList<Integer>();
			for (int i = 0; i < nums.length; i++) {
				list.add(nums[i]);
			}
			lists.add(list);
			return;
		}
		for (int i = left; i <= right; i++) {
			if (nums[left] != nums[i]||left==i) {
				int temp = nums[left];
				nums[left] = nums[i];
				nums[i] = temp;
				addList(nums, left + 1, right);
				temp = nums[left];
				nums[left] = nums[i];
				nums[i] = temp;
			}
		}
	}
}
