package day07;

public class Searching_Elements_With_Enhanced_for {

	public static void main(String[] args) {
		// Searching elements in arrays with enhanced for loop.
		
				int a[]= {10,20,30,40,50,60,70};
				
				int f= 90;
				
				boolean status = false;
				
				for(int x:a) {
					if(x==f) {
						System.out.println("Element found.");
						status=true;
						break;
					}
				}
				
				
				
				if(status==false) {
					System.out.println("Element not found.");
				}
				

	}

}
