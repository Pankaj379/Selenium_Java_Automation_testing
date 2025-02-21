package day07;

public class Searching_Elements_in_Array {

	public static void main(String[] args) {
		
		// Searching elements in arrays.
		
		int a[]= {10,20,30,40,50,60,70};
		
		int f= 20;
		boolean status = false;
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]==f) {
				
				System.out.println("Element Found with value: "+ a[i]);
				status = true;
				break;
			}
			
		}
		
		
		if(status==false) {
			System.out.println("Element Not Found.");
		}

		
	}

}
