package practiceProject;

public class constuctorEg {
	
	int number;
	String name;
	
	// no arg const
	constuctorEg(){
		System.out.println("no argument");
	}
	//Parameterized constructor
	constuctorEg(int no,String name){
		number=no;
		this.name=name;
		System.out.println("number1="+number+"name="+name);
		
	}

	public static void main(String[] args) {
		constuctorEg obj= new constuctorEg();
		constuctorEg obj1= new constuctorEg(5,"Tanmay");
	}

}
