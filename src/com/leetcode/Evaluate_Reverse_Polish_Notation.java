package com.leetcode;

import java.util.Stack;

public class Evaluate_Reverse_Polish_Notation {
    public int evalRPN(String[] tokens) {
        if(tokens==null||tokens.length==0)
        	return 0;
        Stack<Integer> stack=new Stack<Integer>();
        int i=0;
        while(i<tokens.length){
        	if("+-*/".contains(tokens[i])){
        		int b=stack.pop();
        		int a=stack.pop();
        		if(tokens[i].equals("+")){
        			int temp=a+b;
        			stack.push(temp);
        		}
        		else if(tokens[i].equals("-")){
        			int temp=a-b;
        			stack.push(temp);
        		}
        		else if(tokens[i].equals("*")){
        			int temp=a*b;
        			stack.push(temp);
        		}
        		else{
        			int temp=a/b;
        			stack.push(temp);
        		}
        	}
        	else
        		stack.push(Integer.valueOf(tokens[i]));
        	i++;
        }
        return stack.pop();
    }
}
