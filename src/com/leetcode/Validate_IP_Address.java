package com.leetcode;

import java.util.regex.Pattern;

public class Validate_IP_Address {
    public String validIPAddress(String IP) {
        if(isIPV4(IP))
        	return "IPv4";
        else if(isIPV6(IP))
        	return "IPv6";
        else
        	return "Neither";
    }
	public boolean isIPV6(String IP){
		String regex="([0-9a-fA-F]?[0-9a-fA-F]?[0-9a-fA-F]?[0-9a-fA-F]:){7}([0-9a-fA-F]?[0-9a-fA-F]?[0-9a-fA-F]?[0-9a-fA-F])";
		if(Pattern.matches(regex, IP))
			return true;
		return false;
	}
	public boolean isIPV4(String IP){
		String regex=  "(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)){3}";
		if(Pattern.matches(regex, IP))
			return true;
		return false;
	}

}
