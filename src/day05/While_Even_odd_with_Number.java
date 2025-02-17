package day05;

public class While_Even_odd_with_Number {

	public static void main(String[] args) {
		// Write even and odd with number.
		
		int i=1;
		
		while(i<=10) {
			
			if(i%2==0) {
			System.out.println(i+":Even Number.");
			}else {
				System.out.println(i+":Odd Number.");
			}
			i++;
		}

	}

}
