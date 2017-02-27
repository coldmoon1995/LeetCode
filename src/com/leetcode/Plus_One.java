package com.leetcode;

public class Plus_One {
	public boolean IsNine(int[] digits){
		for(int i=0;i<digits.length;i++){
			if(digits[i]!=9)
				return false;
		}
		return true;
	}
    public int[] plusOne(int[] digits) {
        if(IsNine(digits)){
        	int[] result=new int[digits.length+1];
        	for(int i=0;i<result.length;i++){
        		if(i==0)
        			result[i]=1;
        		else
        			result[i]=0;
        	}
        	return result;
        }
        else{
        	int flag=1;
        	for(int i=digits.length-1;i>=0;i--){
        		digits[i]+=flag;
        		if(digits[i]>9){
        			flag=1;
        			digits[i]=digits[i]%10;
        		}
        		else
        			flag=0;
        	}
        	return digits;
        } 	
    }
}
