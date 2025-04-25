package day14;

class parent{

	void display(int a) {
		System.out.println(a);
	}
}

class child1 extends parent{
	void show(int b) {
		System.out.println(b);
	}
}

class child2 extends parent{
	void disp(int c) {
		System.out.println(c);
	}
}

public class Hirarchy_inheritence {

	public static void main(String[] args) {

		child1 ch = new child1();
		ch.display(100);
		ch.show(300);
		
		child2 ch2 = new child2();
		ch2.display(3000);
		ch2.disp(560);

	}

}
