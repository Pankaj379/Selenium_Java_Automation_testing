package day_15;

public class Animal {
	
	String colour = "White";
	
	void eat() {
		System.out.println("Eat...");
	}

}

class dog extends Animal{
	String colour = "Black";
	void eat() {
		//System.out.println("Eating bread......");// comment this one to user super.
		super.eat();// immediate parent mathod.
	}
	void display_color() {
		System.out.println(super.colour); // invoking parent variable using super ke
	}
}
