package com.leetcode;

public class Add_Strings {
    public String addStrings(String num1, String num2) {
        int[] nums=new int[Math.max(num1.length(), num2.length())+1];
        StringBuilder sb=new StringBuilder(num1);
        num1=sb.reverse().toString();
        sb=new StringBuilder(num2);
        num2=sb.reverse().toString();
        int flag=0;
        for(int i=0;i<Math.max(num1.length(), num2.length());i++){
        	if(i<Math.min(num1.length(), num2.length())){
        		int sum=(num1.charAt(i)-'0')+(num2.charAt(i)-'0')+flag;
        		flag=sum/10;
        		nums[i]=sum%10;
        	}
        	else{
        		int sum=0;
        		if(num1.length()>num2.length())
        			sum=(num1.charAt(i)-'0'+flag);
        		else
        			sum=(num2.charAt(i)-'0'+flag);
        		flag=sum/10;
        		nums[i]=sum%10;
        	}
        }
        StringBuilder res=new StringBuilder();
        if(flag!=0)
        	res.append(flag+"");
        for(int i=nums.length-2;i>=0;i--)
        	res.append(nums[i]);
        return res.toString();
        	
    }
}
