package com.leetcode;

public class Number_of_1_Bits {
    public int hammingWeight(int n) {
        String s=Integer.toBinaryString(n);
        int result=0;
        for(int i=0;i<s.length();i++){
        	if(s.charAt(i)=='1')
        		result++;
        }	
        return result;
    }
}
