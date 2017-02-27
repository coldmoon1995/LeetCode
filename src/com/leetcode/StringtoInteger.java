package com.leetcode;
public class StringtoInteger {
	public int myAtoi(String str) {
		String str1=str.trim();
		if(str1.length()==0||str1==null)
			return 0;
		int i;
		if(str1.charAt(0)=='-'||str1.charAt(0)=='+'||(str1.charAt(0)>='0'&&str1.charAt(0)<='9')){
			for(i=1;i<str1.length();i++){
				if(str1.charAt(i)>'9'||str1.charAt(i)<'0')
					break;
			}
			if(i==1&&(str1.charAt(0)=='-'||str1.charAt(0)=='+'))
				return 0;
			else{
				String sm=str1.substring(0, i);
				double x=Double.valueOf(sm);
				if(x>=Math.pow(2, 31))
					return (int) (Math.pow(2, 31)-1);
				else if(x<-Math.pow(2, 31))
					return (int) -Math.pow(2, 31);
				else
					return Integer.valueOf(sm);
			}
		}
		else
			return 0;
	}
}
