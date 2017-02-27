package com.leetcode;

import java.util.List;

public class Triangle {
	public int minimumTotal(List<List<Integer>> triangle) {
		int n=triangle.size();
		int[] dp=new int[n];
		int temp=0;
		for(int i=0;i<n;i++){
			for(int j=0;j<=i;j++){
				if(j==0){
					temp=dp[j];
					dp[j]+=triangle.get(i).get(j);
				}
				else if(j>0&&j!=i){
					int left=temp;
					temp=dp[j];
					dp[j]=Math.min(left+triangle.get(i).get(j),dp[j]+triangle.get(i).get(j));
				}
				else
					dp[j]=temp+triangle.get(i).get(j);	
			}
		}
		int result=dp[0];
		for(int i=1;i<n;i++){
			if(dp[i]<result)
				result=dp[i];
		}
		return result;
	}
}
