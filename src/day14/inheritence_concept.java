package day14;

// Single level Inheritence.

class A {
	int a = 199;

	void parent_Disp() {

		System.out.println(a);
	}
}

class BC extends A {
	int b = 300;

	void child_Disp() {
		System.out.println(b);
	}

}


public class inheritence_concept {
	public static void main(String[] args) {
		// Inheritence concepts.

		BC bObj = new BC();
		System.out.println(bObj.a);
		System.out.println(bObj.b);
		bObj.child_Disp();
		bObj.parent_Disp();


	}

}
