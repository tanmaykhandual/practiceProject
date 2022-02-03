package com.simplilearn.regx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegxDemo2 {

	public static void main(String[] args) {
		
		String regex="[987]{3}[0-9]{7}";
		String input="9871234565";
		
		Pattern pattern= Pattern.compile(regex);
		
		Matcher match= pattern.matcher(input);
		
		if(match.matches())
		{
			System.out.println("Pattern Matched");
		}
		else
		{
			System.out.println("invalid input");
		}
	}
	

}
