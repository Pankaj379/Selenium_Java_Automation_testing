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
	
	public void circle() { // use public infront of void because by default it's public in interface and without public it's default in class.
		
		System.out.println("This is a abstract method for circle...");
		
	}

	public static void main(String[] args) {
		
		// Scenario 1st.
		
		Interface_demo intDemo = new Interface_demo();
		intDemo.circle();  // abstract.
		intDemo.square();  // default.
		shape.rectangle(); // we can directly use static method within class but here it's used in implement so use implement name shape.rectangle();.
		
	}

}
