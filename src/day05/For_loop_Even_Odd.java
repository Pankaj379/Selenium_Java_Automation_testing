package day05;

public class For_loop_Even_Odd {

	public static void main(String[] args) {
		// for loop along with even and odd.
		
		for(int i=1; i<=10; i++) {
			
			if(i%2==0) {
				System.out.println(i + ":Even Number.");
			}else{
				System.out.println(i+ ":Odd Number.");
			}
		}

	}

}
