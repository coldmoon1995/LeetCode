package com.leetcode;


public class Bulb_Switcher {
    public int bulbSwitch(int n) {
//        int[] bulbs=new int[n+1];
//        for(int i=1;i<=n;i++){
//        	for(int j=i;j<=n;j=j+i){
//        		bulbs[j]=bulbs[j]==0?1:0;
//        	}
//        }
//        int res=0;
//        for(int i=1;i<=n;i++){
//        	res+=bulbs[i];
//        }
//        return res;
    	return (int) Math.sqrt(n);
    }
}
