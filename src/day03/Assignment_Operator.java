package day03;

public class Assignment_Operator {

	public static void main(String[] args) {

		// Assignment: = += -= *= /= %=. for assigning increment and decrement more than one.

		int a=10;
		int b=10;
		a+=5;     // a=a+5;
		b-=5;          // b=b-5;
		System.out.println(a);
		System.out.println(b);

		// For multiplication.
		int c=10;
		c*=2; //c= c*2;
		System.out.println("Multiplication value is :"+ c);

		// For Division Operator.
		int d=10;
		d/=2; //d=d/2;
		System.out.println("Division value is:" +d);// 5

		// For modulus Operator.(reminder)
		int e=10;
		e%=2; //d=d%2;
		System.out.println("Division value is:" +e); // 0
		
		
	//	Difference between == and = is == is used for comparison and = is to assign value.
		


	}

}
