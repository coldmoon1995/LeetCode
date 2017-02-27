package com.leetcode;

public class ReverseInteger {
    public int reverse(int x) {
        String s=x+"";
        StringBuilder sb=new StringBuilder();
        if(x>=0){
        for(int i=s.length()-1;i>=0;i--)
        	sb.append(s.charAt(i));
        if(Double.valueOf(sb.toString())<Math.pow(2, 31))
        	return Integer.valueOf(sb.toString());
        else
        	return 0;
    	}
        else{
        	sb.append('-');
        	for(int i=s.length()-1;i>0;i--)
        		sb.append(s.charAt(i));
        	if(Double.valueOf(sb.toString())>-Math.pow(2, 31))
        		return Integer.valueOf(sb.toString());
        	else
        		return 0;
        		
    }}
}
