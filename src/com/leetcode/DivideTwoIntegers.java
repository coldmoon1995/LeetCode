package com.leetcode;

public class DivideTwoIntegers {
    public int divide(int dividend, int divisor) {
        if(divisor==0)
        	return Integer.MAX_VALUE;
        int flag;
        if((divisor>=0&&dividend>0)||(divisor<=0&&dividend<0))
        	flag=1;
        else
        	flag=-1;
        long divisor1,dividend1;
        divisor1=(long) Math.abs((double)divisor);
        dividend1=(long) Math.abs((double)dividend);
        long temp=0;
        long d1=dividend1,d2=divisor1;
        while(d1>=divisor1){
        	d2=divisor1;
        	int i=1;
        	while(d1>=d2){
        		d1=d1-d2;
        		temp+=i;
        		d2=d2+d2;
        		i=i+i;
        	}
        }
        if(flag>0){
        	if(temp>Integer.MAX_VALUE)
        		return Integer.MAX_VALUE;
        	else
        		return (int) temp;
        }
        else{
        	return (int) -temp;
        }
}}
