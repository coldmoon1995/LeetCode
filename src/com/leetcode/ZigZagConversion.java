package com.leetcode;

public class ZigZagConversion {
	public String convert(String s, int numRows) {
		StringBuilder rs=new StringBuilder();
		if(numRows==1)
			return s;
		else{
		for(int i=0;i<numRows;i++){
			for(int n=0;n<s.length();n++){
				if(n%(2*numRows-2)==i||n%(2*numRows-2)==2*numRows-2-i)
				rs.append(s.charAt(n));
			}
		}
		return rs.toString();
	}}
}