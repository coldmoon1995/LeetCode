package com.leetcode;

public class Power_of_Three {
	public boolean isPowerOfThree(int n) {
		if(n<1)
			return false;
		if(n==1)
			return true;
		if(n%3!=0)
			return false;
		else{
			return isPowerOfThree(n/3);
		}
	}
}
