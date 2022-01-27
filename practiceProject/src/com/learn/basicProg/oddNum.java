package com.learn.basicProg;

import java.util.Scanner;

public class oddNum {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the range ");
		int n = scan.nextInt();
		System.out.print("Odd Numbers from 1 to "+n+" are: ");
		for (int i = 1; i <= n; i++) {
		   if (i % 2 != 0) {
			System.out.print(i + " ");
		   }
		}

	}

}
