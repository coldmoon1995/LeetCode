package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class First_Unique_Character_in_a_String {
	public int firstUniqChar(String s) {
        if(s==null||s.length()<1)
        	return -1;
        Map<Character,Integer> map=new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
        	if(map.containsKey(s.charAt(i)))
        		map.put(s.charAt(i), map.get(s.charAt(i))+1);
        	else
        		map.put(s.charAt(i), 1);
        }
        for(int i=0;i<s.length();i++){
        	if(map.get(s.charAt(i)).intValue()==1)
        		return i;
        }
        return -1;
    }
	public static void main(String[] args) {
		First_Unique_Character_in_a_String test=new First_Unique_Character_in_a_String();
		System.out.println(test.firstUniqChar("loveleetcode"));

	}

}
