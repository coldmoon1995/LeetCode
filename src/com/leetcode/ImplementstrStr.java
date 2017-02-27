package com.leetcode;

public class ImplementstrStr {
    public int strStr(String haystack, String needle) {
    	int j=0;
        while(j<=haystack.length()-needle.length()){
        	int k=0;
        	while(k<needle.length()){
        		if(haystack.charAt(j+k)!=needle.charAt(k))
        			break;
        		k++;
        	}
        	if(k==needle.length())
        		return j;
        	if(j+needle.length()<haystack.length())
        		j+=indexFind(haystack.charAt(j+needle.length()),needle);
        	else
        		break;
        }
    	return -1;
    }

    public int indexFind(char a,String needle){
    	int i;
    	for(i=0;i<needle.length();i++){
    		if(needle.charAt(needle.length()-1-i)==a)
    			break;
    	}
    	return i+1;
    }
}
