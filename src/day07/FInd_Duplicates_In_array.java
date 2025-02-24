package day07;

public class FInd_Duplicates_In_array {

	public static void main(String[] args) {
		// Find the duplicates in array.
		
		int a[] = {10, 20, 30, 40, 20, 30, 10, 20, 30, 10};
		int b = 10;
		int count = 0;
		
		for(int value:a) {
			if(value==b) {
				count++;
				//System.out.println(count);
			}
			// System.out.println(count);
		}
		System.out.println(count);

	}

}
