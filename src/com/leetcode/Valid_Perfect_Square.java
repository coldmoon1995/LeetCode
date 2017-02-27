package com.leetcode;

public class Valid_Perfect_Square {
    public boolean isPerfectSquare(int num) {
        int left=0,right=num<=46340?num:46340;
        while(left<=right){
        	int mid=left+(right-left)/2;
        	if(mid*mid==num)
        		return true;
        	else if(mid*mid>num)
        		right=mid-1;
        	else
        		left=mid+1;
        }
        return false;
    }
}
