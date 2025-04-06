package day11;

public class Adder {
	
	int a =10 , b=20;
	
	// 1: Method name should be same.
	void sum() 
	{
		System.out.println(a+b);
	}
	
	// 2: Number of parameters should be different.

	void sum(int x, int y) 
	{
		System.out.println(x+y);
	}
	
	// 3: Data type of parameters should be different.

	void sum(int x, double y) 
	{
		System.out.println(x+y);
	}
	
	// 4: Order of parameters should be different.

	void sum(double x, int y) 
	{
		System.out.println(x+y);
	}
	
	
	void sum(double x, int y, int z) 
	{
		System.out.println(x+y+z);
	}



	

}

