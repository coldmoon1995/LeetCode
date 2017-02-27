package com.leetcode;

public class Climbing_Stairs {
	public int climbStairs(int n) {
//		if (n == 0)
//			return 0;
//		int result=0;
//		for (int i = 0; i <= n / 2; i++) {
//			//必须是Long否则会超int型
//			long temp=1;
//			for(int j=1;j<=i;j++){
//				temp=temp*(n-i-j+1)/j;
//			}
//			result+=temp;
//		}
//		return result;
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		if(n==2)
			return 2;
		int[] nums=new int[n];
		nums[0]=1;
		nums[1]=2;
		for(int i=2;i<n;i++){
			nums[i]=nums[i-1]+nums[i-2];
		}
		return nums[n-1];
	}
}
