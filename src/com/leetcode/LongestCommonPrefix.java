package com.leetcode;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
    	//检测是不是空数组
    	if(strs.length==0)
    		return "";
    	String prefix=strs[0];
        for(int i=1;i<strs.length;i++){
        	int j=0;
        	while(j<strs[i].length()&&j<prefix.length()){
        		if(prefix.charAt(j)!=strs[i].charAt(j))
        			break;
        		j++;
        	}
        	prefix=prefix.substring(0, j);
        }
    	return prefix;
    }
}
