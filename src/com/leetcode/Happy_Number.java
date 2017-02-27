package com.leetcode;

import java.util.HashSet;
import java.util.Set;

public class Happy_Number {
	Set<Integer> set=new HashSet<Integer>();
    public boolean isHappy(int n){
    	if(n<=0)
    		return false;
        if(addNum(n)==1)
        	return true;
        else{
        	if(set.contains(addNum(n))){
        		return false;
        	}
        	else{
        		set.add(n);
        		return isHappy(addNum(n));
        	}
        }
    }
    public int addNum(int n){
    	int res=0;
    	while(n!=0){
    		res+=(n%10)*(n%10);
    		n=n/10;
    	}
    	return res;
    }
}
