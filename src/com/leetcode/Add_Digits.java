package com.leetcode;

public class Add_Digits {
    public int addDigits(int num) {
        return num%9==0&&num>0?9:num%9;
    }
}
