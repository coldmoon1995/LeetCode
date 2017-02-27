package com.leetcode;

public class Count_Numbers_with_Unique_Digits {
    public int countNumbersWithUniqueDigits(int n) {
    	if(n==0)
    		return 1;
        int[] res=new int[n];
        int nums=10;
        res[0]=9;
        for(int i=1;i<n;i++){
        	res[i]=res[i-1]*(10-i);
        	nums+=res[i];
        }
        return nums;
    }
}
