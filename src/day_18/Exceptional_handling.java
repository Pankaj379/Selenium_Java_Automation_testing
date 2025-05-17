package day_18;

import java.util.Scanner;

public class Exceptional_handling {

	public static void main(String[] args) {

		System.out.println("Program started...");
		Scanner sc = new Scanner(System.in);

		//Example:1
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		try {
		System.out.println(100/num);// for zero shows: Exception in thread "main" java.lang.ArithmeticException: / by zero
		}catch(ArithmeticException e1) {
			System.out.println("Invalid Data.....");
			System.out.println(e1.getMessage());
			// Now this time execute with zero value.
		}
		// Note: If don't know which line have exception then we can add multiples lines in try statement.
		System.out.println("User input is correct...");
		System.out.println("The program is executed successfully..");

	}

}
