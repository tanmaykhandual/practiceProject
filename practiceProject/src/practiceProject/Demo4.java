package practiceProject;

//protected access modifier
public class Demo4 {
		protected void display()
		{
		System.out.println(" Hello world 4");
		}
		}
class B extends Demo4 
   {
   public static void main(String args[])
   {
   B obj = new B();
   obj.display();
   }
   }
