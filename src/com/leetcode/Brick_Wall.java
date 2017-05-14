package com.leetcode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Brick_Wall {
    public int leastBricks(List<List<Integer>> wall) {
        int max=0;
        Map<Integer, Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<wall.size();i++){
        	int sum=0;
        	for(int j=0;j<wall.get(i).size();j++){
        		sum+=wall.get(i).get(j);
        		if(map.containsKey(sum))
        			map.put(sum, map.get(sum)+1);
        		else
        			map.put(sum, 1);
        		if(map.get(sum)>max)
        			max=map.get(sum);
        	}
        }
        return wall.size()-max;
    }
	public static void main(String[] args) {

	}

}
