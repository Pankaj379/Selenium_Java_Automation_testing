package day04;

public class IF_Else {

	public static void main(String[] args) {
		// iF else Statement.

		int age = 25;

		if(age>=18) {
			System.out.println("Person is eligible for vote.");// true.
		}
		else {
			System.out.println("Not eligible for vote.");// false.

		}
		
	//	Note: If only one condition is used then curly braces not needed.
		// Only needed for multiple conditions.
		
		if(age>=18) 
			System.out.println("Person is eligible for vote.");// true.
		
		else 
			System.out.println("Not eligible for vote.");// false.

		
	}

}
