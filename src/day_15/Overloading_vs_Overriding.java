package day_15;

class ABC{

	void m1(int a) {
		System.out.println(a);
	}
	
	void m2(int b) {
		System.out.println(b);
	}

}

class XYZ extends ABC{

	void m1(int a) {
		System.out.println(a*a);// Method overriding purely inheritence concept.
	}
	
	void m2(int b) {
		System.out.println(b*b);// Overriding.
	}
	
	void m2(int a, int b) {
		System.out.println(a*b);// Method overloading polymorphism concept.
	}

}
//Note: Totally there are 3 methods in class XYZ because m1 is overrided and m2 is overloaded and become new method.


public class Overloading_vs_Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		XYZ xyz = new XYZ();
		xyz.m1(20); // 400
		xyz.m2(30); // 900
		xyz.m2(20, 30); // 600

	}

}
