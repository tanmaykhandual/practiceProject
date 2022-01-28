package com.simplilearn.methods;

public class Methodoverload {
	
	int add(int a,int b)
	{
		return a+b;
	}
	
	int add(int a, int b,int c)
	{
		return a+b+c;
	}
	
	float add(float a, float b)
	{
		return a+b;
		
	}

	public static void main(String[] args) {
		Methodoverload m = new Methodoverload();
		System.out.println("Addition of 2 int\n"+m.add(2,3));
		System.out.println("Addition of 3 int\n"+m.add(2,3,5));
		System.out.println("Addition of 2 float\n"+m.add(2.5f,3.6f));

	}

}
