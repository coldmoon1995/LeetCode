package com.leetcode;

public class LongestPalindromicSubstring {
	public String longestPalindrome(String s) {
		String maxString=String.valueOf(s.charAt(0));
		for(int i=1;i<s.length();i++){
			int j=1;
				while(i-j>=0&&i+j<s.length()){
					if(s.charAt(i-j)==s.charAt(i+j)){
						j++;	
					}
					else
						break;
				}
				if(maxString.length()<2*(j-1)+1){
					maxString=s.substring(i-j+1,i+j);
				}
		}
		for(int i=1;i<s.length();i++){
			int j=1;
			while(i-j>=0&&i+j-1<s.length()){
			if(s.charAt(i-j)==s.charAt(i+j-1))
				j++;
			else
				break;
			}
			if(maxString.length()<2*j-2){
				maxString=s.substring(i-j+1,i+j-1);
			}
		}
		return maxString;
	}
}