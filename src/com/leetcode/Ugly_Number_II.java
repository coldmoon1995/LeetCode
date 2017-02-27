package com.leetcode;

public class Ugly_Number_II {
    public int nthUglyNumber(int n) {
        int[] nums=new int[n];
        nums[0]=1;
        int index2=0,index3=0,index5=0;
        for(int i=1;i<n;i++){
        	int m2=2*nums[index2],m3=3*nums[index3],m5=5*nums[index5];
        	int mm=Math.min(m2, Math.min(m3, m5));
        	if(mm==m2) index2++;
        	if(mm==m3) index3++;
        	if(mm==m5) index5++;
        	nums[i]=mm;
        }
        return nums[n-1];
    }
}
