package practiceProject;

//Private access modifier
	class Demo3 {
		private void display1(){
		System.out.println("Hello World 3");
		}
		}
	    class Test3  {
		public static void main(String[] args) {
			Demo3 d= new Demo3();
			d.display1();
			
		}

	}