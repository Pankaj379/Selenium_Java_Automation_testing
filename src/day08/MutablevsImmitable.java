package day08;

import java.util.Arrays;

public class MutablevsImmitable {

	public static void main(String[] args) {
		// 1) Mutable Feature: can change.
		
		int a[] = {12,32,11,332,12,22,10,7,5};
		
		System.out.println(Arrays.toString(a));
		
		Arrays.sort(a); // mutable
		System.out.println(Arrays.toString(a));
		
		// 2) Immutable Feature: can't change original value of variable.
		
		String s = "Welcome";
		
		System.out.println(s);// Welcome
		
		// we have to store the value in other variable to get concatinated string.
		s.concat("to java automation");// Immutable.
		
		
		System.out.println(s);// welcome

		

		

	}

}
