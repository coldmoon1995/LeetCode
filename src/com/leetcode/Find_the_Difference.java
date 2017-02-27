package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Find_the_Difference {
	public char findTheDifference(String s, String t) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(s.charAt(i)))
				map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
			else
				map.put(s.charAt(i), 1);
		}
		for (int i = 0; i < t.length(); i++) {
			if(map.get(t.charAt(i))>0)
				map.put(t.charAt(i),map.get(t.charAt(i))-1);
			else
				return t.charAt(i);
		}
		return '0';
//		char res=0;
//		for(int i=0;i<t.length();i++){
//			res+=t.charAt(i);
//		}
//		for(int i=0;i<s.length();i++){
//			res-=s.charAt(i);
//		}
//		return res;
	}
}
