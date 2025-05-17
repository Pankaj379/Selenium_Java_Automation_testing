package day_18;

import java.util.Scanner;

public class Exceptions {


	public static void main(String[] args) {
		// Exceptions types.

		System.out.println("Program started...");
		Scanner sc = new Scanner(System.in);
		
		//Example:1
		//		System.out.println("Enter the number: ");
		//		int num = sc.nextInt();
		//		System.out.println(100/num);// for zero shows: Exception in thread "main" java.lang.ArithmeticException: / by zero

		// Example:2
//		int a[] = new int[5];
//		System.out.println("Enter a number(0-4): ");
//		int pos = sc.nextInt();
//
//		System.out.println("Enter a value: ");
//		int value = sc.nextInt();
//
//		a[pos] = value;
//		// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5.

		// Example:3
	//	String st = "Welcome";// not for string.
	//	int val = Integer.parseInt(st);
	//	System.out.println(val);// work for 233233.
		// java.lang.NumberFormatException: For input string: "Welcome"
		
		// Example :4
		String s = null; // null means unknown value.
		System.out.println(s.length());//  java.lang.NullPointerException.
		
		System.out.println("User input is correct...");
		System.out.println("The program is executed successfully..");
		
	}

}
