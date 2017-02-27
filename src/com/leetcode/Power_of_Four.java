package com.leetcode;

public class Power_of_Four {
    public boolean isPowerOfFour(int num) {
    	return num > 0 && (int)(Math.log(num) / Math.log(4)) - Math.log(num) / Math.log(4) == 0;
    }
}
