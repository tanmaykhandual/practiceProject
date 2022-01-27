package com.learn.basicProg;

import java.util.Scanner;

public class divisibleBy5 {

	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = number.nextInt();

        if(num % 5 == 0)
            System.out.println(num + " is divisible by 5");
        else
            System.out.println(num + " is not divisible by 5");


	}

}
