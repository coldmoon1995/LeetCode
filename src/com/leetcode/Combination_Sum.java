package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Combination_Sum {
	
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        int[] taken=new int[candidates.length];
        int sum=0;
        backtrack(res, 0, taken, candidates, sum, target);
        return res;
    }
	public void backtrack(List<List<Integer>> res,int level,int[] taken,int[] candidates,int sum,int target){
		if(sum==target){
			List<Integer> list=new ArrayList<Integer>();
			for(int i=0;i<taken.length;i++){
				if(taken[i]!=0){
					for(int j=0;j<taken[i];j++)
						list.add(candidates[i]);
				}	
			}
			res.add(list);
			return;
		}
		if(level<candidates.length){
			for(int i=0;i<=target/candidates[level];i++){
				if(sum+i*candidates[level]<=target){
					taken[level]=i;
					backtrack(res, level+1, taken, candidates, sum+i*candidates[level], target);
					taken[level]=0;
				}
			}
		}
	}
	public static void main(String[] args) {
		Combination_Sum test=new Combination_Sum();
		int[] candidates={2,3,6,7};
		int target=7;
		List<List<Integer>> res=test.combinationSum(candidates, target);
		for (List<Integer> list : res) {
			System.out.println(list.toString());
		}
	}
}
