package com.leetcode;

public class Hamming_Distance {
	public int hammingDistance(int x, int y) {
        String s1=Integer.toBinaryString(x);
        String s2=Integer.toBinaryString(y);
        int index1=s1.length()-1,index2=s2.length()-1;
        int res=0;
        while(index1>=0||index2>=0){
        	if(index1<0){
        		if(s2.charAt(index2)!='0')
        			res++;
        		index2--;
        	}
        	else if(index2<0){
        		if(s1.charAt(index1)!='0')
        			res++;
        		index1--;
        	}
        	else{
        		if(s1.charAt(index1)!=s2.charAt(index2))
        			res++;
        		index1--;index2--;
        	}
        
        }
        return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hamming_Distance test=new Hamming_Distance();
		System.out.println(test.hammingDistance(1, 3));
	}

}
