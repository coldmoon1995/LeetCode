package com.leetcode;

public class Count_and_Say {
	public String countAndSay(int n) {
		String str="1";
		for(int i=1;i<n;i++){
			String temp=str;
			str=countAndSay(temp);
		}
		return str;
	}
    public String countAndSay(String s) {
        if(s.length()<=1)
        	return 1+s;
        StringBuilder sb=new StringBuilder();
        int i=1;
        int count=1;
        while(i<s.length()){
        	while(i<s.length()&&s.charAt(i)==s.charAt(i-1)){
        		i++;
        		count++;
        	}
        	sb.append(count+""+s.charAt(i-1)+"");
        	count=1;
        	i++;
        }
        if(s.charAt(s.length()-1)!=s.charAt(s.length()-2))
        	sb.append(count+""+s.charAt(s.length()-1)+"");
        return sb.toString();
    }
}
