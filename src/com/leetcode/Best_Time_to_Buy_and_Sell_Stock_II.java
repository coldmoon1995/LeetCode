package com.leetcode;

public class Best_Time_to_Buy_and_Sell_Stock_II {
    public int maxProfit(int[] prices) {
        if(prices.length<=1)
        	return 0;
        int current=1;
        int maxProfit=0;
        while(current<prices.length){
        	if(prices[current]>prices[current-1]){
        		maxProfit+=prices[current]-prices[current-1];
        	}
        	current++;
        }
        return maxProfit;
    }
}
