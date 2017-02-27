package com.leetcode;

public class Excel_Sheet_Column_Number {
    public int titleToNumber(String s) {
    	int res=0;
    	int index=1;
        for(int i=s.length()-1;i>=0;i--){
        	if(i!=0){
        		res+=(s.charAt(i)-'A'+1)*index;
        	}
        	else
        		res+=(s.charAt(i)-'A'+1)*index;
        	index*=26;
        }
        return res;
    }
}
