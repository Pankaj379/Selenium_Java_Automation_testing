package day03;

public class Operators_Concept {

	public static void main (String args[]) {

		// 1. Arithmetic Operators: + - * / %.

		int a=20 , b = 10;

		int result = a+b;

		System.out.println("Sum of a and b is :"+(a+b));
		System.out.println("Sum of a and b is :"+result);
		System.out.println("Substraction of a and b is :"+(a-b));
		System.out.println("Multiplication of a and b is :"+(a*b));
		System.out.println("Division of a and b is :"+(a/b));// Quotient value.
		System.out.println("Modulus division of a and b is :"+(a%b));// Remainder value.

		// 2. Relational/ Comparison Operators: > >= < <= != ==.
		// Return boolean value: true/false.

		System.out.println(a>b);// true.
		System.out.println(a<b);// False.
		System.out.println(a>=b);// true.
		System.out.println(a<=b);// False.
		System.out.println(a>=b);// true.
		b = 20;
		System.out.println(a>=b);// true.
		System.out.println(a<=b);// true.
		System.out.println(a!=b);// False.
		System.out.println(a==b);// true.

		boolean res = a>b;
		System.out.println(res);// False.

		// 3. Logical Operators: && || !.

		// Main difference between relation and logical operator is logical operator is the difference in only boolean value.
		// But for relation operator we use any data type for comparison.
		// Screenshots: https://prnt.sc/VvDiXW4JbXA4

		boolean x= true;
		boolean y= false;

		System.out.println("Value of and operatior is :" + (x && y));// false
		System.out.println("Value of or operatior is :" + (x || y));// true
		System.out.println("Value of not-x(!x) operatior is :" + !x);// false
		System.out.println("Value of and operatior is :" + !y);// true

		boolean b1 = 10>20;
		System.out.println(b1);// false

		boolean b2 = 20>10;
		System.out.println(b2);// true

		System.out.println(b1&&b2);// false
		System.out.println(b1||b2);// true
		System.out.println((10<20)&&(20>10));// true.
		
	










	}

}
