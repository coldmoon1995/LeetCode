package com.leetcode;

import java.util.Collections;
import java.util.Stack;

public class Basic_Calculator_II {
    public int calculate(String s) {
    	s=s.replace(" ", "");
        Stack<String> stack=new Stack<String>();
        int i=0,j=0;
        String[] strs= s.split("\\+|-|\\*|/");
        stack.push(strs[j]);
        j++;
        while(i<s.length()){
        	if(s.charAt(i)=='*'||s.charAt(i)=='/'||s.charAt(i)=='+'||s.charAt(i)=='-'){
        		if(s.charAt(i)=='*'||s.charAt(i)=='/'){
        			int a=Integer.valueOf(stack.pop());
        			int b=Integer.valueOf(strs[j]);
        			if(s.charAt(i)=='*')	stack.push(a*b+"");
        			else	stack.push(a/b+"");
        			j++;
        		}
        		else{
        			stack.push(s.charAt(i)+"");
        			stack.push(strs[j]);
        			j++;
        		}
        	}
        	i++;
        }
        Collections.reverse(stack);
        int a=0,b=0;
        while(!stack.isEmpty()){
        	a=Integer.valueOf(stack.pop());
        	if(stack.isEmpty())
        		break;
        	if(stack.pop().equals("+")){
        		b=Integer.valueOf(stack.pop());
        		stack.push(a+b+"");
        	}
        	else{
        		b=Integer.valueOf(stack.pop());
        		stack.push(a-b+"");
        	}
        	
        }
        
        return a;
    }
}
