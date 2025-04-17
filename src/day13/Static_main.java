package day13;

public class Static_main {

	// Execute static method from another main class. 

	public static void main(String[] args) {
		// 1) Means Static methods can access the static keywords stuff directly without creating object.
		// but if specified the main method in another class then specify the class name explicitely.

		//	System.out.println(Static_keyword.x);
		//	Static_keyword.m1(); 

		// System.out.println(y); // not a static variable.(non-static)
		// m2(); // not a static method.

		// 2) Non static stuff is accessible only though object.
		Static_keyword sk = new Static_keyword();
		System.out.println(sk.y);
		sk.m2();



	}

}


