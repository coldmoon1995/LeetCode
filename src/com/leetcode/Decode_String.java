package com.leetcode;

import java.util.Stack;

public class Decode_String {
    public String decodeString(String s) {
    	if(s==null||s.length()==0)
    		return s;
        Stack<Character> stack=new Stack<Character>();
        for(int i=0;i<s.length();i++){
        	if(s.charAt(i)!=']'){
        		stack.push(s.charAt(i));
        }
        	else{
        		StringBuilder sb=new StringBuilder();
        		StringBuilder index=new StringBuilder();
        		Character c=stack.pop();
        		while(c!='['){
        			sb.append(c);
        			c=stack.pop();
        		}
        		sb.reverse();
        		c=stack.pop();
        		while(!stack.isEmpty()&&(c>='0'&&c<='9')){
        			index.append(c);
        			c=stack.pop();
        		}
        		if(!stack.isEmpty())
        			stack.push(c);
        		else
        			index.append(c);
        		int n=Integer.parseInt(index.reverse().toString());
        		for(int j=0;j<n;j++){
        			for(int k=0;k<sb.length();k++)
        				stack.push(sb.charAt(k));
        		}
        	}
        }
        StringBuilder result=new StringBuilder();
        while(!stack.isEmpty()){
        	result.append(stack.pop());
        }
        return result.reverse().toString();
    }
}
