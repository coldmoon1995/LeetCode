package com.leetcode;


public class Integer_to_English_Words {
    public String numberToWords(int num) {
    	if(num==0)
    		return "Zero";
    	String[] strs={"Billion","Million","Thousand",""};
    	
    	int index=0;
        if(num>=1000000000)
        	index=0;
        else if(num>=1000000)
        	index=1;
        else if(num>=1000)
        	index=2;
        else 
        	index=3;
        int[] nums=new int[4-index];
        for(int i=nums.length-1;i>=0;i--){
        	nums[i]=num%1000;
        	num=num/1000;
        }
        String s="";
        for(int i=0;i<nums.length;i++){
        	if(nums[i]!=0)
        		s=s+" "+threeNumsToWords(nums[i])+" "+strs[index];
        	index++;
        }
        s=s.trim();
        return s;
    }
    public String threeNumsToWords(int num){
    	String[] strs1={"One","Two","Three","Four","Five","Six","Seven","Eight","Nine",
    			"Ten" ,"Eleven" ,"Twelve","Thirteen" ,"Fourteen" ,"Fifteen" ,"Sixteen" ,
    			"Seventeen" ,"Eighteen","Nineteen" };
    	String[] strs2={"Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy",
    			"Eighty", "Ninety" };
    	String s="";
    	if(num>=100){
    		s=s+strs1[num/100-1]+" Hundred";
    		num=num%100;
    	}
    	if(num>=20){
    		s+=" "+strs2[num/10-1];
    		num=num%10;
    		if(num!=0)
    			s+=" "+strs1[num-1];
    	}
    	else{
    		if(num>0&&num<20)
    			s=s+" "+strs1[num-1];
    	}
    	
    	s=s.trim();
    	return s;
    }
}
