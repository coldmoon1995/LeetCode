package com.leetcode;

public class Length_of_Last_Word {
    public int lengthOfLastWord(String s) {
        String[] strs=s.split(" ");
        if(strs==null||strs.length<=0)
        	return 0;
        String str=strs[strs.length-1];
        return str.length();
    }
}
