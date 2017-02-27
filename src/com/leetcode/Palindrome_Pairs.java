package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Palindrome_Pairs {
    public List<List<Integer>> palindromePairs(String[] words) {
    	if(words==null||words.length<1)
    		return null;
    	List<List<Integer>> lists=new ArrayList<List<Integer>>();
    	for(int i=0;i<words.length;i++){
    		for(int j=0;j<words.length;j++){
    			if(isPalindromePairs(words[i],words[j])&&i!=j){
    				List<Integer> list=new ArrayList<Integer>();
    				list.add(i);
    				list.add(j);
    				lists.add(list);
    			}
    		}
    	}
    	
    	return lists;
    }
     boolean isPalindromePairs(String s1,String s2){
    	String s=s1+s2;
    	int left=0,right=s.length()-1;
    	while(left<right){
    		if(s.charAt(left)!=s.charAt(right))
    			return false;
    		left++;right--;
    	}
    	return true;
    }
}
