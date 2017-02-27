package com.leetcode;

public class Reverse_Vowels_of_a_String {
    public String reverseVowels(String s) {
        StringBuilder sb=new StringBuilder(s);
        if(sb==null||sb.length()<1)
        	return s;
        int left=0,right=sb.length()-1;
        while(left<right){
        	while(left<right&&sb.charAt(left)!='a'&&sb.charAt(left)!='o'&&
        			sb.charAt(left)!='e'&&sb.charAt(left)!='i'&&sb.charAt(left)!='u'
        				&&sb.charAt(left)!='A'&&sb.charAt(left)!='O'&&
            			sb.charAt(left)!='E'&&sb.charAt(left)!='I'&&sb.charAt(left)!='U'){
        		left++;
        	}
        	while(left<right&&sb.charAt(right)!='a'&&sb.charAt(right)!='o'&&
        			sb.charAt(right)!='e'&&sb.charAt(right)!='i'&&sb.charAt(right)!='u'
        				&&sb.charAt(right)!='A'&&sb.charAt(right)!='O'&&
            			sb.charAt(right)!='E'&&sb.charAt(right)!='I'&&sb.charAt(right)!='U'){
        		right--;
        	}
        	if(left<right){
        		char temp=sb.charAt(left);
        		sb.setCharAt(left, sb.charAt(right));
        		sb.setCharAt(right, temp);
        	}
        	else
        		break;
        	left++;right--;
        }
        return sb.toString();
    }
}
