package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Pascals_Triangle {
	List<List<Integer>> result=new ArrayList<List<Integer>>();
    public List<List<Integer>> generate(int numRows) {
        for(int i=1;i<=numRows;i++){
        	List<Integer> list=new ArrayList<Integer>();
        	for(int j=0;j<i;j++){
        		if(j==0||j==i-1)
        			list.add(1);
        		else{
        			List<Integer> tempList=result.get(i-2);
        			list.add(tempList.get(j-1)+tempList.get(j));
        		}
        	}
        	result.add(list);
        }
        return result;
    }
}
