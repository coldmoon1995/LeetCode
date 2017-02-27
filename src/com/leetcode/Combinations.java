package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
	List<List<Integer>> lists=new ArrayList<List<Integer>>();
	List<Integer> list=new ArrayList<Integer>();
    public List<List<Integer>> combine(int n, int k) {
    	combineList(k, 1, n+1);
    	return lists;
    }
    public void combineList(int num,int current,int right){
    	if(current>right)	return;
    	if(current==right&&num>1) return;
    	if(num==0){
    		lists.add(new ArrayList<Integer>(list));
    		return;
    	}
    	list.add(current);
    	combineList(num-1,current+1,right);
    	list.remove(list.size()-1);
    	combineList(num,current+1,right);
    }
}
