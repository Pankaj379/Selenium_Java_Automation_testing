package day08;

import java.util.Arrays;

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

		System.out.println(s.contains("wel"));
		System.out.println(s.contains("me"));
		System.out.println(s.contains("Wel"));
		System.out.println(s.contains("COM"));
		System.out.println(s.contains("wlcm")); // not in sequence.

		// 6) equals() and equalsIgnoreCase() used for comparison strings.
		String st1 = "welcome";
		String st2 = "welcome";

		System.out.println("---------companrison methods-----------------");
		System.out.println(st1==st2);// true.
		System.out.println(st1.equals(st2));// true.
		System.out.println(st1.equals("Welcome"));// false.
		System.out.println(st1.equalsIgnoreCase("Welcome"));// true.

		// 7) Replacing single and multiple characters/words in a string.

		String stt = "Lets start automation testing by using java language.";

		String numb = "%23,45,64,55";
		// 	Note: In single character the ('%', '') empty char value is not allowed but in String it's possible("%", "").
		System.out.println(numb.replace("%", "").replace(",", ""));

		System.out.println(stt.replace("a", "r").replace("t", "v")); // Lets strrt rutomrtion testing by using hrvr lrngurge.

		System.out.println(stt.replace("java", "Python")); // Lets start automation testing by using Python language.

		// 8)  Extract the sub string from main string: https://prnt.sc/iLgtsuHTQjR3  / https://prnt.sc/datzH_TidZNT

		// Note: for single character user and directly user charAt method.
		// Substring(): Extract substring from main string.
		// Starting Index-0
		// Ending Index-1
		String ss = "Welcome";
		System.out.println(ss.substring(0, 3));
		System.out.println(ss.substring(0, 1));

		// 9) Convert string to upper and lower case.

		System.out.println(ss.toLowerCase()); // welcome
		System.out.println(ss.toUpperCase()); // WELCOME

		// 10) Split(): to split the string from delimeter(,.@$%^#@%^).
		// Note: split method is better than substring() method because it extract data dynamically(abc232) than substring method(abc).

		String em = "abc24@gmail.com";
		String a[] = em.split("@");
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(em.split("@")));

		String sp = "abc,xyz@123";
		String ar1[] = sp.split(",");
		System.out.println(Arrays.toString(ar1)); // [abc,  xyz@123]
		String ar2[] = ar1[1].split("@");
		System.out.println(Arrays.toString(ar2));
		System.out.println(ar1[0]);
		System.out.println(ar2[0]);
		System.out.println(ar2[1]);

		// Note: * % ^ & ( ) - is not used as delimeters.
		
		String de = "abc xyz 123 456";
		String d[] = de.split(" ");
		System.out.println(Arrays.toString(d)); // [abc, xyz, 123, 456]
		
		
		// Practice:use combination or method to use in real time practice.
		
		String sn = "john kenndy";
	System.out.println(sn.replace('j','J').contains("John")); // true.
	
		
			

	}

}
