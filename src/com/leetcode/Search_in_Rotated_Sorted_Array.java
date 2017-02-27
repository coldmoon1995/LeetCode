package com.leetcode;

public class Search_in_Rotated_Sorted_Array {
	public int search(int[] nums, int target) {
		if (nums == null || nums.length == 0)
			return -1;
		int n=nums.length;
		int left = 0, right = n - 1, mid = 0;
		while (left <= right){
			mid = left + (right - left) / 2;
			if (nums[mid] == target)
				return mid;
			else if (nums[mid] > nums[right]){	 //ת�۵����ұ߲��֣�������߲������������е�
				if (nums[left] <= target && target < nums[mid])   //������������ͽ�����û��ת�۵㡢ȫ���������������
					right = mid - 1;
				else
					left = mid + 1;
			}
			else{	//�����ʾת�۵�����߻����Ѿ�û��ת�۵��ˣ����Ѿ���������ȫ���������
				if(nums[mid] < target && target <= nums[right])
					left = mid + 1;
				else
					right = mid - 1;
			}
		}
		return -1;
	}
//		if(nums==null||nums.length<1)
//			return -1;
//		int left=0,right=nums.length-1;
//		while(left<=right){
//			int mid=(left+right)/2;
//			if(nums[mid]<nums[right]){
//				right=mid;
//			}
//			else if(nums[mid]>nums[left]){
//				left=mid;
//			}	
//			else
//				break;
//		}
//		int min=nums[left]<nums[right]?left:right;
//		left=0;right=nums.length-1;
//		System.out.println(min);
//		if(min==0){
//			return find(nums, min, right, target);
//		}
//		else{
//			if(target<=nums[right]){
//				return find(nums, min, right, target);
//			}
//			else if(target>=nums[left]){
//				right=min-1;
//				return find(nums, left, right, target);
//			}	
//			else
//				return -1;
//		}
//	}
	public int find(int[] nums,int left,int right,int target){
		while(left<=right){
			int mid=(left+right)/2;
			if(nums[mid]<target){
				left=mid+1;
			}
			else if(nums[mid]>target){
				right=mid-1;
			}
			else{
				return mid;
			}
		}
		return -1;
	}
}
