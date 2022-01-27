package com.learn.basicProg;

import java.util.Scanner; 

public class simpleIntrest {

	public static void main(String[] args) {
		Scanner numInput = new Scanner( System.in );
		
		// Data Input
		System.out.println("Enter the principle ammount");
		float p= numInput.nextFloat();
		
		System.out.println("Enter the Rate of intrest");
		float r= numInput.nextFloat();
		
		System.out.println("Enter the time");
		float t= numInput.nextFloat();
		
		//calculation part
		float  si; 
        p = 13000;  r = 12; t = 2;  
         si  = (p*r*t)/100;   
        System.out.println("Simple Interest is: " +si);

	}

}
