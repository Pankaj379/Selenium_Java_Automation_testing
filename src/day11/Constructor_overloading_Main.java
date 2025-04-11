package day11;

public class Constructor_overloading_Main {

	public static void main(String[] args) {
		// Constructor overloading main.
		
		Constructor_overloading conOver = new Constructor_overloading(11.6,33620.8,336.25);
		Constructor_overloading conOver1 = new Constructor_overloading(55.6);
		
		System.out.println(conOver.Volume());
		System.out.println(conOver1.Volume());
		
		// overloading means polymorphism.

	}

}
