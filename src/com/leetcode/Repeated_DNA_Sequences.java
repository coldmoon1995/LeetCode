package com.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Repeated_DNA_Sequences {
    public List<String> findRepeatedDnaSequences(String s) {
    	List<String> list=new ArrayList<String>();
    	if(s==null||s.length()<=10)
    		return list;
        HashMap<String,Integer> map=new HashMap<String,Integer>();
        for(int i=0;i<=s.length()-10;i++){
        	if(map.containsKey(s.subSequence(i, i+10)))
        		if(map.get(s.subSequence(i, i+10))==1){
        			list.add(s.substring(i,i+10));
        			map.put((String) s.subSequence(i, i+10), 0);
        	}
        	if(!map.containsKey(s.subSequence(i, i+10)))
        		map.put((String) s.subSequence(i, i+10), 1);
        }
        return list;
    }
}
