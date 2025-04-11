package day11;

public class Adder_main {

	public static void main(String[] args) {
		// Adder main method.
		
		Adder addObj = new Adder();
		// method overloading called polymorphism.
		addObj.sum(); // 1
		addObj.sum(100,400); //2
		addObj.sum(13.658744, 66); // 3
		addObj.sum(66,13.66); // 4
		addObj.sum(13,62,77); //5
		// addObj.sum(13.2,66.6,76.3); // Invalid.
		

	}

}
