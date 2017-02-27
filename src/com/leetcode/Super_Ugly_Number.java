package com.leetcode;

public class Super_Ugly_Number {
    public int nthSuperUglyNumber(int n, int[] primes) {
        int[] indexs=new int[primes.length];
        int[] dp=new int[n];
        dp[0]=1;
        for(int i=1;i<n;i++){
        	int min=primes[0]*dp[indexs[0]];
        	for(int j=1;j<primes.length;j++){
        		if(primes[j]*dp[indexs[j]]<min)
        			min=primes[j]*dp[indexs[j]];
        	}
        	for(int j=0;j<primes.length;j++){
        		if(primes[j]*dp[indexs[j]]==min)
        			indexs[j]++;
        	}
        	dp[i]=min;
        }
        return dp[n-1];
    }
}
