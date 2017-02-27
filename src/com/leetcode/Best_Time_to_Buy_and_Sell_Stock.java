package com.leetcode;

public class Best_Time_to_Buy_and_Sell_Stock {
    public int maxProfit(int[] prices) {
        if(prices.length<=1)
        	return 0;
        int current=1;
        int min=prices[0];
        int maxProfit=0;
        while(current<prices.length){
        	if(prices[current]<min)
        		min=prices[current];
        	if(prices[current]-min>maxProfit)
        		maxProfit=prices[current]-min;
        	current++;
        }
        return maxProfit;
    }
}
