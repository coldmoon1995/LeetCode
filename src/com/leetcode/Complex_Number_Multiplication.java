package com.leetcode;

public class Complex_Number_Multiplication {
    public String complexNumberMultiply(String a, String b) {
    	int a1=0,a2=0,b1=0,b2=0;
        for(int i=0;i<a.length();i++){
        	if(a.charAt(i)=='+'){
        		a1=Integer.parseInt(a.substring(0, i));
        		b1=Integer.parseInt(a.substring(i+1,a.length()-1));
        	}
        }
        for(int i=0;i<b.length();i++){
        	if(b.charAt(i)=='+'){
        		a2=Integer.parseInt(b.substring(0, i));
        		b2=Integer.parseInt(b.substring(i+1,b.length()-1));
        	}
        }
        int resa=a1*a2-b1*b2,resb=a1*b2+a2*b1;
        return (resa+"+"+resb+"i");
        
    }
	public static void main(String[] args) {
		Complex_Number_Multiplication test=new Complex_Number_Multiplication();
		System.out.println(test.complexNumberMultiply("1+-1i", "1+-1i"));

	}

}
