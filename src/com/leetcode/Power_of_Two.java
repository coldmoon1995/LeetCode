package com.leetcode;

public class Power_of_Two {
    public boolean isPowerOfTwo(int n) {
        if(n==1)
        	return true;
        else if(n<1)
        	return false;
        else{
        	if(n%2!=0)
        		return false;
        	else
        		return isPowerOfTwo(n/2);
        }
    }
}
