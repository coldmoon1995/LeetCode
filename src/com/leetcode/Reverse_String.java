package com.leetcode;

public class Reverse_String {
    public String reverseString(String s) {
        if(s.length()<1)
        	return s;
        StringBuilder sb=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
        	sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
