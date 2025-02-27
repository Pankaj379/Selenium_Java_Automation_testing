package day07;

import java.util.Scanner;

public class Taking_input_Keyboard {

	public static void main(String[] args) {
		// Taking the input from the keyboard.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int a = sc.nextInt();
		System.out.println("The Number is : "+ a);

	}

}
