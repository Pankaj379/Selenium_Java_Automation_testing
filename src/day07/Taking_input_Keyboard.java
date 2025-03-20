package day07;

import java.util.Scanner;

public class Taking_input_Keyboard {

	public static void main(String[] args) {
		// Taking the input from the keyboard.
		
		Scanner sc = new Scanner(System.in);
		// Int data type.
		System.out.println("Enter a number: ");
		int a = sc.nextInt();
		System.out.println("The Number is : "+ a);
		
		// Double data type.
		System.out.println("Double number is :");
		double d = sc.nextDouble();
		System.out.println("Double number is :"+ d);
		
		System.out.println("Enter your city name: ");
		String city = sc.next();
		System.out.println("City is :"+ city);
		
		

	}

}
