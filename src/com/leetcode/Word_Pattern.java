package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Word_Pattern {
    public boolean wordPattern(String pattern, String str) {
    	if(pattern==null||str==null)
    		return false;
    	String[] strs=str.split(" ");
    	if(pattern.length()!=strs.length)
    		return false;
        Map<Character,String> patternMap=new HashMap<Character,String>();
        Map<String,Character> strMap=new HashMap<String,Character>();
        for(int i=0;i<pattern.length();i++){
        	if(patternMap.get(pattern.charAt(i))!=null){
        		if(!patternMap.get(pattern.charAt(i)).equals(strs[i]))
        			return false;
        	}
        	else{
        		patternMap.put(pattern.charAt(i), strs[i]);
        	}
        	if(strMap.get(strs[i])!=null){
        		if(strMap.get(strs[i])!=pattern.charAt(i))
        			return false;
        	}
        	else{
        		strMap.put(strs[i], pattern.charAt(i));
        	}
        }
        return true;
    }
}
