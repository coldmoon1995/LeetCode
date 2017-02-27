package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Insert_Interval {
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
    	List<Interval> res=new ArrayList<Interval>();
    	if(intervals==null||intervals.size()<1){
    		res.add(newInterval);
    		return res;
    	}
    	int i=0;
    	int start=0;
    	int end=0;
    	boolean flag=true;//判断是否插在一个interval中间
    	
    	while(i<intervals.size()){
    		if(newInterval.start>intervals.get(i).end){
    			res.add(intervals.get(i));
    			i++;
    		}
    		else if(newInterval.start<intervals.get(i).start){
    			start=newInterval.start;
    			end=newInterval.end;
    			flag=false;
    			break;
    		}
    		else{
    			start=intervals.get(i).start;
    			end=newInterval.end;
    			break;
    		}
    	}
    	if(newInterval.start>intervals.get(intervals.size()-1).end){
    		res.add(newInterval);
    		return res;
    	}
    	if(newInterval.end<intervals.get(0).start){
    		res.add(newInterval);
    		res.addAll(intervals);
    		return res;
    	}
    	if(flag){
    		if(end>=intervals.get(intervals.size()-1).start){
    			res.add(new Interval(start,Math.max(end, intervals.get(intervals.size()-1).end)));
    			return res;
    		}
    		for(int j=i;j<intervals.size()-1;j++){
    			if(end<=intervals.get(j).end){
    				end=intervals.get(j).end;
    				res.add(new Interval(start,end));
    				j++;
    				for(int k=j;k<intervals.size();k++){
    					res.add(intervals.get(k));
    				}
    				return res;
    			}
    			if(end>intervals.get(j).end&&end<intervals.get(j+1).start){
    				res.add(new Interval(start,end));
    				j++;
    				for(int k=j;k<intervals.size();k++){
    					res.add(intervals.get(k));
    				}
    				return res;
    			}
    		}
    		return res;
    	}
    	else{
    		if(end>=intervals.get(intervals.size()-1).start){
    			res.add(new Interval(start,Math.max(end, intervals.get(intervals.size()-1).end)));
    			return res;
    		}
    		for(int j=i;j<intervals.size();j++){
    			if(end<intervals.get(j).start){
    				res.add(new Interval(start, end));
    				for(int k=j;k<intervals.size();k++){
    					res.add(intervals.get(k));
    				}
    				return res;
    			}
    			if(end>=intervals.get(j).start&&end<=intervals.get(j).end){
    				end=intervals.get(j).end;
    				res.add(new Interval(start, end));
    				for(int k=j+1;k<intervals.size();k++){
    					res.add(intervals.get(k));
    				}
    				return res;
    			}
    		}
    		return res;
    	}
    }
}
