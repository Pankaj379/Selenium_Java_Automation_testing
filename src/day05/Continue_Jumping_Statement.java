package day05;

public class Continue_Jumping_Statement {

	public static void main(String[] args) {
		// Continue jumping statement.
		
		for(int i=1 ; i<=10; i++) {
			
			if(i==3 || i==5 || i==8) {
				continue; // After this the loop directly go to i<=10.
				
			}
			
			System.out.println(i);
		}

	}

}
