package com.leetcode;

public class Counting_Bits {
	public int count(int num){
		String s=Integer.toBinaryString(num);
		int result=0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='1')
				result++;
		}
		return result;
	}
    public int[] countBits(int num) {
        int[] results=new int[num+1];
        for(int i=0;i<=num;i++){
        	results[i]=count(i);
        }
        return results;
    }
}
