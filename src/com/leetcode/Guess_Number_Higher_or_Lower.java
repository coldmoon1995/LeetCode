package com.leetcode;

public class Guess_Number_Higher_or_Lower {
	private int x=1702766719;
	public int guess(int num){
		if(num==x)
			return 0;
		else if(num<x)
			return -1;
		else 
			return 1;
	}
    public int guessNumber(int n) {
        if(n==0)
            return 0;
        int left=0,right=n;
        int mid=0;
        while(left<=right){
            mid=left+(right-left)/2;
            if(guess(mid)==0)
                return mid;
            else if(guess(mid)==-1){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return left;
    }
}
