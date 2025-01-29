package day03;

public class Ternary_Operators {

	public static void main(String args[]) {

		//	Ternary Operator.
		//	var = exp? result1 : result2;
		int 	q=100, w=200;

		int ter= (q<w)? q : w;
		System.out.println("The ternary operator value is :"+ter);//200 if q>w and 100 if q<w.


		//Example:2:
		int x = (1==1)?200:100; // if condition is true then 200 if false then 100.
		System.out.println("Value of X is: "+x); // 200

		//Example:3:
		int y = (1==2)?200:100; // if condition is true then 200 if false then 100.
		System.out.println("Value of Y is: "+y);// 100
		
		// Example:4
		int person_Age = 15;
		String res = (person_Age>=30)?"Eligible":"Not-Eligible";
		System.out.println(res);
		
		//Unary Operators:++,--,+=,-=,%=,/=, *=, =, !.
		//Binary Operators: + - * / % > >= < <= != == && || 
		//Ternary Operators:?



	}
}