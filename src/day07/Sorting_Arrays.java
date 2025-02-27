package day07;

import java.util.Arrays;

public class Sorting_Arrays {

	public static void main(String[] args) {
		// Sort the arrays.

		int a[]= {100,400,800,200,900,300,500};

		//for(int A:a) {
		//	System.out.println(A);
		//}
		// alternate way to get array values.


		System.out.println(Arrays.toString(a)); 	// Before sorting.
		
		Arrays.sort(a); // Sorting.

		System.out.println(Arrays.toString(a));   // After sorting.


	}

}
