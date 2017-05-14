package com.leetcode;

public class Total_Hamming_Distance {
	public int totalHammingDistance(int[] nums) {
        int res=0;
        if(nums==null||nums.length==0)
        	return res;
        int[] indexs=new int[nums.length];
        String[] strs=new String[nums.length];
        int maxLength=0;
        for(int i=0;i<nums.length;i++){
        	strs[i]=Integer.toBinaryString(nums[i]);
        	indexs[i]=strs[i].length()-1;
        	if(indexs[i]+1>maxLength)
        		maxLength=indexs[i]+1;
        }
        for(int i=0;i<maxLength;i++){
        	int temp=0;
        	for(int j=0;j<nums.length;j++){
        		if(indexs[j]>=0){
        			if(strs[j].charAt(indexs[j])=='1')
        				temp++;
        			indexs[j]--;
        		}
        	}
        	res+=temp*(nums.length-temp);
        }
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Total_Hamming_Distance test=new Total_Hamming_Distance();
		int[] nums={4,14,2};
		System.out.println(test.totalHammingDistance(nums));
	}

}
