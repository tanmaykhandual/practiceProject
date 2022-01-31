package com.simplilearn.annonymousinner;

public class AnnonymousInner {
	public static void main(String[]args)
	{
		Car bmwCustom= new Car()
				{
			
			public void stop()
			{
				System.out.println("Stop the car");
			}
			public void start()
			{
				System.out.println("Start the car");
			}
			
				};
				bmwCustom.start();
				bmwCustom.stop();
	}

}
