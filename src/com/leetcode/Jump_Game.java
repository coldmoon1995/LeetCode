package com.leetcode;

public class Jump_Game {
    	public boolean canJump(int[] A) {
            if(A==null||A.length<1)
                return false;
            int reach=0;
            for(int i=0;i<A.length&&i<=reach;i++)
                reach=Math.max(reach,A[i]+i);
            if(reach>=A.length-1)
                return true;
            return false;
        }
    
    
}
