package com.leetcode;

public class Integer_Break {
    public int integerBreak(int n) {
    	if(n<=3)
    		return n-1;
        @SuppressWarnings("unused")
		int result=0;
        int floor=n/3;
        int res=n%3;
        if(res==0)
        	return (int) Math.pow(3, floor);
        else if(res==1)
        	return (int) (Math.pow(3,floor-1)*4);
        else
        	return (int) (Math.pow(3, floor)*2);
    }
}
