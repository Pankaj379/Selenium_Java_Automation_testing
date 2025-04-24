package day14;

class AB{
	int a;

	void disp_A() {

		System.out.println(a);

	}

}

class B extends AB{
	int b;

	void disp_B() {

		System.out.println(b);

	}

}

class C extends B{
	int c;
	void disp_C() {

		System.out.println(c);

	}

}

public class Multilevel_inheritence {
	// Multilevel inheritence.

	public static void main(String[] args) {
		// Multi-level Inheritence.
		C cObj = new C();
		cObj.a = 100;
		cObj.b = 200;
		cObj.c = 300;
		cObj.disp_A();
		cObj.disp_B();
		cObj.disp_C();




	}

}
