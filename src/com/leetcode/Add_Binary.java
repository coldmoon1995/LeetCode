package com.leetcode;

public class Add_Binary {
    public String addBinary(String a, String b) {
    	StringBuilder sb=new StringBuilder();
    	if(a.length()<b.length()){
    		String temp=a;
    		a=b;b=temp;
    	}
    	int[] result=new int[a.length()+1];
    	String s="";
    	for(int i=0;i<a.length()-b.length();i++){
    		s+="0";
    	}
    	s=s+b;
    	int flag=0;
    	for(int i=a.length()-1;i>=0;i--){
    		result[i+1]=(Integer.parseInt(s.charAt(i)+"")+Integer.parseInt(a.charAt(i)+"")+flag)%2;
    		if(Integer.parseInt(s.charAt(i)+"")+Integer.parseInt(a.charAt(i)+"")+flag>=2){
    			flag=1;
    		}
    		else
    			flag=0;
    	}
    	
    	if(flag==1){
    		result[0]=1;
    		for(int i=0;i<a.length()+1;i++){
    			sb.append(result[i]);
    		}
    		return sb.toString();
    	}
    	else{
    		for(int i=1;i<a.length()+1;i++){
    			sb.append(result[i]);
    		}
    		return sb.toString();
    	}
    	
    	
    } 
}
