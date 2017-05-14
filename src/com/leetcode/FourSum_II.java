package com.leetcode;

import java.util.HashMap;

public class FourSum_II {
	public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
		if(A==null||A.length<1)
			return 0;
		HashMap<Integer,Integer> mapAB=new HashMap<Integer,Integer>();
		for(int i=0;i<A.length;i++){
			for(int j=0;j<B.length;j++){
				if(mapAB.containsKey(A[i]+B[j]))
					mapAB.put(A[i]+B[j], mapAB.get(A[i]+B[j])+1);
				else
					mapAB.put(A[i]+B[j], 1);
			}
		}
		int res=0;
		for(int i=0;i<C.length;i++){
			for(int j=0;j<D.length;j++){
				if(mapAB.containsKey(-1*(C[i]+D[j])))
						res+=mapAB.get(-1*(C[i]+D[j]));
			}
		}
		
		
		
		return res;
	}
	public static void main(String[] args) {
		FourSum_II test=new FourSum_II();
		int[] A={1,1,-1,-1};
		int[] B={-1,-1,1,1};
		int[] C={1,-1,0,-1};
		int[] D={1,1,-1,1};
		System.out.println(test.fourSumCount(A, B, C, D));

	}

}
