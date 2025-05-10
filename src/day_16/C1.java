package day_16;

public class C1 extends C2 implements I1,I2 { // With C1 it's already hybrid and only interfaces known as multiple inheritence.

	public void m1() {
		System.out.println(x);
	}

	public void m2() {
		System.out.println(y);
	}

	public static void main(String[] args) {
		// This is a for multiple inheritence one child multiple parents.

		C1 mulInh = new C1();
		mulInh.m1(); // 100
		mulInh.m2(); // 200
		mulInh.m3(); // 399
	}

}
