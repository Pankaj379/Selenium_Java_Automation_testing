package day08;

public class Strings_Variable {

	public static void main(String[] args) {
		// String variable.
		
		String s = "welcome"; // Pre-defined class.
		String s1= " to java ";
		String s2= "Programming.";
		
		String st = new String("welcome");
		
		System.out.println(s);
		System.out.println(st);  // same.
		
		// Different string methods.
		
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
		
		

	}

}
