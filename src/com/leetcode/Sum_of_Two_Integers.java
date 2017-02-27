package com.leetcode;

public class Sum_of_Two_Integers {
    public int getSum(int a, int b) {
        while (b != 0) {
            int c = a ^ b;
            b = (a & b) << 1;
            a = c;
        }
        return a;
    }
//    public int getSum(int a, int b) {
//        int r = 0, c = 0, p = 1;
//        while ((a | b | c) != 0) {
//            if (((a ^ b ^ c) & 1) != 0)
//                r |= p;
//            p <<= 1;
//            c = (a & b | b & c | a & c) & 1;
//            a >>>= 1;
//            b >>>= 1;
//        }
//        return r;
//    }

}
