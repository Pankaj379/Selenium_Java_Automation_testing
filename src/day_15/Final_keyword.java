package day_15;

class test {
	
	 final int x = 100; // final keyword used to contant the value in a given class.
	
}

public class Final_keyword {

	public static void main(String[] args) {
		
		test t = new test();
	//	t.x = 200;// with final keyword mutable variable become immutable.
	System.out.println(t.x);

	}

}
