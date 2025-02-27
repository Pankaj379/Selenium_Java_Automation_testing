package day07;

import java.util.Arrays;

public class Sorting_String_Char {

	public static void main(String[] args) {

		// Sorting the string and char values.

		char c[]= {'D','W','R','P','Y','G','M'};

		System.out.println("Characters Before Sorting: "+ Arrays.toString(c));

		Arrays.sort(c);

		System.out.println("Characters After Sorting: "+ Arrays.toString(c));

		String s[]= {"Amit","Ajay","Boby","Zora","Shavi","Gippy","Anand"};

		System.out.println("String Before Sorting: "+ Arrays.toString(s));

		Arrays.sort(s);

		System.out.println("String After Sorting: "+ Arrays.toString(s));


	}

}
