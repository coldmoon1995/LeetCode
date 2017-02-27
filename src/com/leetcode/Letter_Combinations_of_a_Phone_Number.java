package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Letter_Combinations_of_a_Phone_Number {
	List<String> list=new ArrayList<String>();
	StringBuilder sb=new StringBuilder();
    public List<String> letterCombinations(String digits) {
    	if(digits==null||digits.length()==0){
    		return null;
    	}
    	letterAdd(digits,0);
    	return list;
    }
    public void letterAdd(String digits,int index){
    	if(index==digits.length()){
    		list.add(new String(sb.toString()));
    		return;
    	}
    	if(digits.charAt(index)=='7'){
    		sb.append("p");
    		letterAdd(digits, index+1);
			sb.deleteCharAt(sb.length()-1);
    		sb.append("q");
    		letterAdd(digits, index+1);
			sb.deleteCharAt(sb.length()-1);
    		sb.append("r");
    		letterAdd(digits, index+1);
			sb.deleteCharAt(sb.length()-1);
    		sb.append("s");
    		letterAdd(digits, index+1);
			sb.deleteCharAt(sb.length()-1);
    		
    	}
    	else if(digits.charAt(index)=='8'){
    		sb.append("t");
    		letterAdd(digits, index+1);
			sb.deleteCharAt(sb.length()-1);
    		sb.append("u");
    		letterAdd(digits, index+1);
			sb.deleteCharAt(sb.length()-1);
    		sb.append("v");
    		letterAdd(digits, index+1);
			sb.deleteCharAt(sb.length()-1);
    	}
    	else if(digits.charAt(index)=='9'){
    		sb.append("w");
    		letterAdd(digits, index+1);
			sb.deleteCharAt(sb.length()-1);
    		sb.append("x");
    		letterAdd(digits, index+1);
			sb.deleteCharAt(sb.length()-1);
    		sb.append("y");
    		letterAdd(digits, index+1);
			sb.deleteCharAt(sb.length()-1);
    		sb.append("z");
    		letterAdd(digits, index+1);
			sb.deleteCharAt(sb.length()-1);
    	}
    	else{
    		for(int i=1;i<=3;i++){
    			char temp=(char) ('a'-1+(Integer.parseInt(digits.charAt(index)+"")-2)*3+i);
    			sb.append(temp);
    			letterAdd(digits, index+1);
    			sb.deleteCharAt(sb.length()-1);
    		}
    	}
    }
}
