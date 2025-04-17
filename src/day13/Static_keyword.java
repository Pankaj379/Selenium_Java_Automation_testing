package day13;

public class Static_keyword {

	static int x = 10; // static variable.
	int y = 20; // Non-static variable.

	static void m1() // Static method.
	{
		System.out.println("This is a static method...");
	}

	void m2() // Non-static method.
	{
		System.out.println("This is a non-static method...");
	}
	
	void m3() // Non-static method.
	{
		System.out.println(x);
		System.out.println(y);
		m1();
		m2();
	}

	
		//3) Non-static methods can access everything directly without restriction.
	//	sk.m3();
//public static void main(String[] args) {

		//System.out.println(x);
		//m1(); 
		// 1) Means Static methods can access the static keywords stuff directly without creating object.
		
		// System.out.println(y); // not a static variable.(non-static)
		// m2(); // not a static method.

		// 2) Non static stuff is accessible only though object.
	//	Static_keyword sk = new Static_keyword();
		//System.out.println(sk.y);
		//sk.m2();
		


//	}

}
