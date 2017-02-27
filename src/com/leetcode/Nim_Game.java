package com.leetcode;

public class Nim_Game {
    public boolean canWinNim(int n) {
    	if(n<=3)
        	return true;
    	boolean[] flag=new boolean[n+1];
        flag[1]=true;flag[2]=true;flag[3]=true;
        for(int i=4;i<=n;i++){
        	flag[i]=!(flag[i-1]&&flag[i-2]&&flag[i-3]);
        }
        return flag[n];
    }
}
