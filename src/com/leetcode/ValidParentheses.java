package com.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<Character>();
        char c;
        Map<Character,Character> map=new HashMap<Character,Character>();  
        map.put('(', ')');map.put('[', ']');map.put('{', '}');
        for(int i=0;i<s.length();i++){
        	if(map.containsKey(s.charAt(i)))
        		stack.push(s.charAt(i));
        	else{
        		if(!stack.isEmpty()){
        			c=stack.pop();
        			if(map.get(c)!=s.charAt(i))
        				return false;
        		}
        		else
        			return false;
        	}
        }
        if(stack.isEmpty())
        	return true;
        else
        	return false;
    }
}
