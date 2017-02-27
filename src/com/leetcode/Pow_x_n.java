package com.leetcode;

public class Pow_x_n {
    public double myPow(double x, int n) {  
     boolean flag=true;
     if(n<0){
    	 flag=false;
    	 n=-n;
     }
     StringBuffer s=new StringBuffer(Integer.toBinaryString(n));
     s.reverse();
     double result=1;
     double temp=x;
     for(int i=0;i<s.length();i++){
    	 if(s.charAt(i)=='1'){
    		 result*=temp;
    	 }
    	 temp=temp*temp;
     }
     if(flag)
    	 return result;
     else
    	 return 1.0/result;
    }
}
