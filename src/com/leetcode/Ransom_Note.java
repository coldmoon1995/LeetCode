package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Ransom_Note {
    public boolean canConstruct(String ransomNote, String magazine) {
    	if(magazine==null||ransomNote==null){
    		if(ransomNote!=null)
    			return false;
    		else
    			return true;
    	}
    	Map<Character,Integer> map=new HashMap<Character,Integer>();
        for(int i=0;i<magazine.length();i++){
        	if(map.containsKey(magazine.charAt(i)))
        		map.put(magazine.charAt(i), map.get(magazine.charAt(i))+1);
        	else
        		map.put(magazine.charAt(i), 1);
        }
        for(int i=0;i<ransomNote.length();i++){
        	if(map.containsKey(ransomNote.charAt(i))){
        		if(map.get(ransomNote.charAt(i))>1)
        			map.put(ransomNote.charAt(i),map.get(ransomNote.charAt(i))-1);
        		else
        			map.remove(ransomNote.charAt(i));
        	}
        	else
        		return false;
        }
        return true;
    }
}
