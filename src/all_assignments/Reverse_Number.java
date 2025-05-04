package all_assignments;
/*We can reverse a number in Java using three main methods as mentioned below:
Using While Loop
Using Recursion
Using StringBuilder class*/
public class Reverse_Number {
	public static void main(String[] args) {
		// M1: Using StringBuilder class.
		int num1 = 123456;
		String stNum = "" +num1;
		StringBuilder stBuild = new StringBuilder(stNum);
		StringBuilder st = stBuild.reverse();
		System.out.println("Reversed value is : " + st.toString());
		// M2: Using Loops.
		// While loop:
		int num = 123456789, reversed = 0;
		System.out.println("Original Number is : " + num);
		// run loop until num becomes 0
		while(num > 0) {// 12345678,1234567,123456....
			// get last digit from num
			int digit = num % 10; // 9,8,7,6
			reversed = reversed * 10 + digit;//9,98,987,9876....
			// remove the last digit from num
			num= num / 10;// 12345678,1234567,123456,12345......
		}
		System.out.println("Reversed Number: " + reversed);
		
	    for( ;num > 0; num /= 10) {
	      int digit = num % 10;
	      reversed = reversed * 10 + digit;
	    }
	    System.out.println("Reversed Number: " + reversed);
	  }
}
