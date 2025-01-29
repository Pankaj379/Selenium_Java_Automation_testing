package day03;

public class Increment_Operators {

	public static void main(String[] args) {

		// 4) Increment and Decrement Operators: ++ - -.
		int q = 10;
		System.out.println(q);

		q++; //q=q+1; instead of writing all expression we can use q++.
		System.out.println(q);


		// Case02: Post-increment operator.
		int a=10;
		int res = a++; // res is first assign the variable then increment.
		System.out.println("Value of post increment is: "+ res);
		System.out.println("Post increment value is :"+a);


		// Case03: Pre-increment operator.
		int b = 10;
		int res1=++b;// first it will increment then It'll assign to res1.
		System.out.println("Value of pre increment is :"+ res1);
		System.out.println("Pre-increment value of  is :"+ b);
		
		// Note: ++ means increase by one.

	}

}
