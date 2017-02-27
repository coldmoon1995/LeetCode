package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Isomorphic_Strings {
    public boolean isIsomorphic(String s, String t) {
    	if((s==null&&t!=null)||(s!=null&&t==null)||s.length()!=t.length())
    		return false;
        Map<Character,Character> mapStoT=new HashMap<Character, Character>();
        Map<Character,Character> mapTtoS=new HashMap<Character, Character>();
        for(int i=0;i<s.length();i++){
        	if(mapStoT.get(s.charAt(i))==null){
        		mapStoT.put(s.charAt(i), t.charAt(i));
        	}
        	else{
        		if(mapStoT.get(s.charAt(i))!=t.charAt(i))
        			return false;
        	}
        	if(mapTtoS.get(t.charAt(i))==null){
        		mapTtoS.put(t.charAt(i), s.charAt(i));
        	}
        	else{
        		if(mapTtoS.get(t.charAt(i))!=s.charAt(i))
        			return false;
        	}
        }
        return true;
    }
}
