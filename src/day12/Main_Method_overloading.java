package day12;

public class Main_Method_overloading {

	void main(int sal) {
		System.out.println(sal);
	}

	void main (double x) {
		System.out.println(x);
	}
	
	void main(String s) {
		System.out.println(s);
	}
	
	void main(String s1 , String s2) {
		System.out.println(s1+s2);
	}

	public static void main(String[] args) { 
		// args means simply x or any value of argument.
		// Overloading of main method.
		
		Main_Method_overloading ovMain = new Main_Method_overloading();
		ovMain.main(135);
		ovMain.main(23574);
		ovMain.main("Pankaj");
		ovMain.main("Pankaj", "Bhardwaj");

	}

}
