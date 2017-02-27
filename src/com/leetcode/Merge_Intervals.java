package com.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Merge_Intervals {
    public List<Interval> merge(List<Interval> intervals) {
    	if(intervals==null||intervals.size()<=1)
    		return intervals;
    	List<Interval> res=new ArrayList<Interval>();
        Collections.sort(intervals, new Comparator<Interval>() {
        	public int compare(Interval o1, Interval o2) {
        		return o1.start-o2.start;
        	}
		});
        int start=intervals.get(0).start;
        int end=intervals.get(0).end;	
        for(int i=1;i<intervals.size();i++){
        	if(intervals.get(i).start>end){
        		res.add(new Interval(start,end));
        		start=intervals.get(i).start;
        		end=intervals.get(i).end;
        	}
        	else{
        		end=Math.max(end, intervals.get(i).end);
        	}
        }
        res.add(new Interval(start,end));
        return res;
    }
}
