package com.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Top_K_Frequent_Elements {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
        	if(map.containsKey(nums[i])){
        		map.put(nums[i], map.get(nums[i])+1);
        	}
        	else
        		map.put(nums[i], 1);
        }
        List<Map.Entry<Integer, Integer>> list=new ArrayList<Map.Entry<Integer,Integer>>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {

			public int compare(Entry<Integer, Integer> o1,
					Entry<Integer, Integer> o2) {
				return o2.getValue()-o1.getValue();
			}
		});
        List<Integer> res=new ArrayList<Integer>();
        for(int i=0;i<k;i++){
        	res.add(list.get(i).getKey());
        }
        return res;
    }
}
