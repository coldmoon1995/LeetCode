package com.leetcode;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters{
	public int lengthOfLongestSubstring(String s) {
		if(s==null || s.length()==0)
	        return 0;
		int left=0,right=0;
		int max=0;
		Set<Character> arr=new HashSet<Character>();
		while(left<s.length()&&right<s.length()){
			if(arr.contains(s.charAt(right))){
				if(max<right-left)
					max=right-left;
				
				while(s.charAt(left)!=s.charAt(right)){
					arr.remove(s.charAt(left));
					left++;
				}
				left++;
			}
			else{
				arr.add(s.charAt(right));
			}
			right++;
			
		}
		
		return Math.max(max,right-left);
}}
