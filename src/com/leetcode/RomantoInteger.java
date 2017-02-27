package com.leetcode;

import java.util.HashMap;
import java.util.Map;


public class RomantoInteger {
    public int romanToInt(String s) {
    	int sum=0;
        Map<Character,Integer> map=new HashMap<Character,Integer>();
        map.put('I',1);map.put('V',5);map.put('X',10);map.put('L',50);map.put('C',100);map.put('D',500);map.put('M',1000);
        if(s.length()==1)
        	return map.get(s.charAt(0));
        for(int i=1;i<s.length();i++){
        	if(map.get(s.charAt(i-1))>=map.get(s.charAt(i)))
        		sum+=map.get(s.charAt(i-1));
        	else
        		sum-=map.get(s.charAt(i-1));
        }
        sum+=map.get(s.charAt(s.length()-1));
    	return sum;
    }
}
