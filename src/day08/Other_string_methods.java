package day08;

public class Other_string_methods {

	public static void main(String[] args) {

		// Different string methods.

		String s = "welcome"; // Pre-defined class.
		String s1= " to java ";
		String s2= "Programming.";

		// 1) Length method.
		int l = s.length();

		System.out.println(l); // m1
		System.out.println(s.length()); // m2
		System.out.println("Technology".length()); // m3


		// 2) concat() method for joining two strings.

		System.out.println(s+s1+s2);
		System.out.println(s.concat(s1).concat(s2));
		System.out.println(s.concat(s1+s2));
		System.out.println("Welcome"+" to java ");// without variable
		System.out.println("Welcome".concat(" to java "));// without variable

		// 3) Trim() Method: remove space from left and right side.
		String str= "   Welcome    ";
		
		System.out.println(str);
		System.out.println("Before Trim method :"+str.length());
		System.out.println("After Trim method :"+str.trim().length());
		
		
		// 4) charAt() method: to find the character at desired position of the word.
		// Note: charAt() method always take index values.
		
		System.out.println("Character at position 1st : "+ s.charAt(0));
		System.out.println("Character at position 6th : "+ s.charAt(5));
		
		// 5) Contains() method is widely used in automation script. (Imp.)
		



	}

}
