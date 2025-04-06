package day10;

public class Constructors {
	
	// Constructors;
	
	int x,y;
	
	// 1: Default constructor.
	Constructors() 
	{
		x= 100;
		y= 200;
	}
	
	// 2: Parameterized constructor.
	Constructors(int a, int b)
	{
		x = a;
		y = b;
	}
	
	void sum(){
		System.out.println(x+y);
	}
	
	
	

	public static void main(String[] args) {
		
		Constructors cd1 = new Constructors(); // 1st default will execute if no parameters are used.
		Constructors cd2 = new Constructors(10,29);// at a time only one will execute if variable is same.
		cd1.sum();

	}

}
