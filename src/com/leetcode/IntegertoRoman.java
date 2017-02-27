package com.leetcode;

public class IntegertoRoman {
    public String intToRoman(int num) {
        StringBuilder sb=new StringBuilder();
        String[][] a={{"","I","II","III","IV","V","VI","VII","VIII","IX"},
        			{"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"},
        			{"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"},
        			{"","M","MM","MMM"}};
        String s1=String.format("%04d", num);
        for(int i=3;i>=0;i--){
        	sb.append(a[i][Integer.valueOf(s1.charAt(3-i)+"")]);
        }
        return sb.toString();
    }
}
