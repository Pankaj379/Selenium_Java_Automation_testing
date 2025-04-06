package day10;

public class Greetings {
	
	
	// 1: no params and no return value.
	
	
	void m1() // Empty braces means no params and void means no return type.
	{
		System.out.println("Hello...");
	}
	
	// 2: no params and return value.
	
	String m2()  // String means return type.
	{
		return"Hello how are you??";// braces() are optional for return type.
	}
	
	// 3: Take params and no return type.
	
	void m3(String name)
	{
		System.out.println("Hello.. "+ name);
	}
	
	// 4: Take params and return value.
	
	String m4(String name)
	{
		return "Hello. "+name;
	}

}
