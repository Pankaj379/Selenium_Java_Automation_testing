package day07;

import java.util.Arrays;
import java.util.Scanner;

public class Reading_writing_data_In_array {

	public static void main(String[] args) {
		//  Reading the data from array and print as array.
		
		int a[] = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<a.length ;i++) {
			
	 System.out.println("Enter the value for the position "+i+":");
	  a[i] = sc.nextInt();
			
		}
		
		System.out.print("Printing array elements:");
		
		System.out.print(Arrays.toString(a));
		

	}

}
