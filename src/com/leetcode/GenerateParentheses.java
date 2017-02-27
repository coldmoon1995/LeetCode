package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
	public void dfs(ArrayList<String> list, String str, int left, int right){
		if(left==0&&right==0){
			list.add(str);
		}
		if(left>0&&left<=right){
			dfs(list,str+"(",left-1,right);
		}
		if(right>0&&left<right){
			dfs(list,str+")",left,right-1);
		}
	}
    public List<String> generateParenthesis(int n) {
    	GenerateParentheses test=new GenerateParentheses();
    	ArrayList<String> list=new ArrayList<String>();
    	test.dfs(list, "", n, n);
    	return list;
    }
}
