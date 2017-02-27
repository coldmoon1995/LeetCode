package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Bulls_and_Cows {
    public String getHint(String secret, String guess) {
        Map<Character,Integer> secretMap=new HashMap<Character,Integer>();
        boolean[] bools=new boolean[secret.length()];
        int bulls=0,cows=0;
        for(int i=0;i<secret.length();i++){
        	if(secret.charAt(i)==guess.charAt(i)){
        		bulls++;
        		bools[i]=true;
        	}
        	else{
        		if(secretMap.get(secret.charAt(i))==null){
        			secretMap.put(secret.charAt(i), 1);
        		}
        		else{
        			secretMap.put(secret.charAt(i), secretMap.get(secret.charAt(i))+1);
        		}
        	}
        }
        for(int i=0;i<bools.length;i++){
        	if((!bools[i])&&(secretMap.get(guess.charAt(i))!=null)){
        		cows++;
        		if(secretMap.get(guess.charAt(i))>1){
        			secretMap.put(guess.charAt(i), secretMap.get(guess.charAt(i))-1);
        		}
        		else{
        			secretMap.remove(guess.charAt(i));
        		}
        	}
        }
        return bulls+"A"+cows+"B";
    }
}
