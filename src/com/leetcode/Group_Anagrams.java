package com.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Group_Anagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
    	if(strs==null||strs.length<1)
    		return null;
    	List<List<String>> lists=new ArrayList<List<String>>();
    	Map<List<Character>,Integer> map=new HashMap<List<Character>,Integer>();
    	for(int i=0;i<strs.length;i++){
    		List<Character> key=new ArrayList<Character>();
    		for(int j=0;j<strs[i].length();j++){
    			key.add(strs[i].charAt(j));
    			Collections.sort(key);
    		}
    		if(map.get(key)==null){
    			List<String> list=new ArrayList<String>();
    			list.add(strs[i]);
    			lists.add(list);
    			map.put(key, lists.size()-1);
    		}
    		else{
    			int k=map.get(key);
    			lists.get(k).add(strs[i]);
    		}
    	}
    	return lists;
    }
}
