package com.leetcode;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        String s=x+"";
        int m=s.length()/2;
        if(s.length()%2==1){
        	for(int i=0;i<=m;i++)
        		if(s.charAt(m-i)!=s.charAt(m+i))
        			return false;
        	return true;
        }
        else{
        	for(int j=0;j<m;j++)
        		if(s.charAt(m+j)!=s.charAt(m-j-1))
        			return false;
        	return true;
        }
        
    }
}
