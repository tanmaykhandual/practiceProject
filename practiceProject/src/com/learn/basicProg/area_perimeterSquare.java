package com.learn.basicProg;

import java.util.Scanner;

public class area_perimeterSquare {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	      
	      System.out.print("Enter the Side Length of Square: ");
	      float s = scan.nextFloat();
	      
	      float a = s*s;
	      float p = 4*s;
	      System.out.println("Area of square = " +a);
	      System.out.println("Perimeter of square = " +p);

	}

}
