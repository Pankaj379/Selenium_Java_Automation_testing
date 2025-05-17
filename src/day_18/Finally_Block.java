package day_18;

public class Finally_Block {

	public static void main(String[] args) {
		
		System.out.println("Program Started...");
		
		// case1: exception occur and finally will execute.
		// String s = null; 
		
		// Case2: Exception occur catch block will not handle but finally with execute.
		//String s = null;
		
		// Case3: Exception does not occur catch block ognored but finally again execute.
		String s = "welcome";
		
		try {
		System.out.println(s.length());
		}
		//catch(NullPointerException e) { // case1
		catch(ArithmeticException e) { // case2
			System.out.println("Exception is handled successfully..");
			System.out.println(e.getMessage());
		}
		finally{
			System.out.println("You're executed the finally statement...");
		}
		
		System.out.println("Now the program is executed successfully and stoping now...");
		
	}

}
