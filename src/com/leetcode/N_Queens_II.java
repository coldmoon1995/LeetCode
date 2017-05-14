package com.leetcode;

public class N_Queens_II {
	int count=0;
	
	public int totalNQueens(int n) {
        boolean[] colFlag=new boolean[n];
        boolean[] pieFlag=new boolean[2*n-1];
        boolean[] naFlag=new boolean[2*n-1];
        backtract(colFlag, pieFlag, naFlag, 0, n);
        return count;
        
    }
	public void backtract(boolean[] colFlag,boolean[] pieFlag,boolean[] naFlag,int row,int n){
		if(row>=n){
			count++;
			return;
		}
		for(int i=0;i<n;i++){
			if((!colFlag[i])&&(!pieFlag[row+i])&&(!naFlag[i-row+n-1])){
				colFlag[i]=true;
				pieFlag[row+i]=true;
				naFlag[i-row+n-1]=true;
				backtract(colFlag, pieFlag, naFlag, row+1, n);
				colFlag[i]=false;
				pieFlag[row+i]=false;
				naFlag[i-row+n-1]=false;
			}
		}
			
	}
	public static void main(String[] args) {
		N_Queens_II test=new N_Queens_II();
		System.out.println(test.totalNQueens(8));
	}

}
