package com.leetcode;

public class Perfect_Number {
    public boolean checkPerfectNumber(int num) {
        int sum=1;
        for(int i=2;i<Math.sqrt(num);i++){
//        	System.out.println(sum);
        	if(num%i==0)
        		sum+=i+num/i;
        }
        if(num%Math.sqrt(num)==0)
        	sum+=Math.sqrt(num);
        
        if(sum==num)
        	return true;
        else
        	return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Perfect_Number test=new Perfect_Number();
		System.out.println(test.checkPerfectNumber(28));
	}

}
