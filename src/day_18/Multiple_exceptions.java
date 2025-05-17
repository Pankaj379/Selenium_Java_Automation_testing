package day_18;

public class Multiple_exceptions {

	public static void main(String[] args) {

		System.out.println("Program started...");
		String s = null;
		try {
			System.out.println(s.length());// java.lang.NullPointerException
		}
		/*
		 * catch(NullPointerException e){
		 * System.out.println("Exception is handled successfully...");
		 * System.out.println(e.getMessage()); // to get detailed error messege. }
		 * catch(ArithmeticException e){
		 * System.out.println("Exception is handled successfully...");
		 * System.out.println(e.getMessage()); // to get detailed error messege. }
		 * catch(NumberFormatException e){
		 * System.out.println("Exception is handled successfully...");
		 * System.out.println(e.getMessage()); // to get detailed error messege. }
		 */
		catch(Exception e) { 
			// All in one exception handling statement because the Exception is the parent class of all other exceptions.
			System.out.println("Exception is handled successfully...");
			System.out.println(e.getMessage()); // to get detailed error messege.
		}
		System.out.println("Program is executed...");
		System.out.println("Exception is handled or input is correct...");

	}

}
