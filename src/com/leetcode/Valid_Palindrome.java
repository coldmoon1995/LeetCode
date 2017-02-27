package com.leetcode;



public class Valid_Palindrome {
    @SuppressWarnings("null")
	public boolean isPalindrome(String s) {
        if(s==null&&s.length()<1)
        	return true;
        s=s.replaceAll("[^0-9a-zA-Z]", "").toUpperCase();
        int left=0,right=s.length()-1;
        while(left<right){
        	if(s.charAt(left)!=s.charAt(right))
        		return false;
        	left++;right--;
        }
        return true;
    }
}
