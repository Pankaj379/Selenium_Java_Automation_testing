package day03;

public class Decrement_Operator {

	public static void main(String[] args) {
		// Case01: simple decrement.
		
		int a=10;
		a--;  //a=a-1;
		System.out.println("Value of simple decrement is :"+a);
		
		
		// Case 02: Post decrement operator.
		int b = 10;
		int res = b--;
		System.out.println("Value of assigned decrement is :"+ res);
		System.out.println("Value of post-decrement is :"+ b);
		
		// Case03: Pre-decrement operator.
		int c=10;
		int res1= --c;
		System.out.println("Value of assigned decrement is :"+ res1);
		System.out.println("Value of pre-decrement is :"+ c);
		

	}

}
