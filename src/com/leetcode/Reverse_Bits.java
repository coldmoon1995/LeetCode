package com.leetcode;

public class Reverse_Bits {
	public int reverseBits(int n) {
		String s=Integer.toBinaryString(n);
		int k = 32 - s.length();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < k; i++) {
			sb.append('0');
		}
		sb.append(s);
		sb.reverse();
		if(sb.charAt(0)==0)
			return Integer.valueOf(sb.toString(), 2);
		else
			return (int)(-(Math.pow(2, 31)-Integer.valueOf(sb.deleteCharAt(0).toString(),2)));
	}
}
