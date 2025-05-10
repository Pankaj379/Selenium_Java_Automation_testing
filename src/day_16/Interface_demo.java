package day_16;

interface shape{

	int lenght = 20; // by default it's final and static.
	int width = 30;  // by default it's final and static.

	void circle(); // abstract method: by default it's public modifier.

	default void square() {
		System.out.println("This is a default method for square....");
	}

	static void rectangle() {
		System.out.println("This is a static method for rectangle....");
	}
}

public class Interface_demo implements shape{  // only allow implemeted methods so add implementation into abstracta: void circle method.
	int x =100 , y=200; // variables in class not accessible in interface.
	public void circle() { // use public infront of void because by default it's public in interface and without public it's default in class.

		System.out.println("This is a abstract method for circle...");

	}

	void triangle() {
		System.out.println("This is a test for the triangle void method...");

	}

	public static void main(String[] args) {

		// Scenario 1st.

		Interface_demo intDemo = new Interface_demo();
		intDemo.circle();  // abstract.
		intDemo.square();  // default.
		shape.rectangle(); // we can directly use static method within class but here it's used in implement so use implement name shape.rectangle();.
		intDemo.triangle();
		System.out.println(intDemo.x + intDemo.y); // variables of class not accessible in interface within the class.

		// Scenario 2nd.
		shape sh = new Interface_demo(); // interface can be use as reference.
		sh.circle(); // abstract.
		sh.square(); // default.
		shape.rectangle(); // Static method is diretly used.
		// sh.triangle(); don't have access to this variable.

		System.out.println(shape.lenght*shape.width); // We are accessing the variable directly.

		//	System.out.println(sh.x + sh.y); // variables of class not accessible with interface variable.



	}

}
