package day06;

public class Single_Dimensional_Array {

	public static void main(String[] args) {
		// 1) Declare an array.
		// 2) Add values in array.
		// 3) Find size of an Array.
		// 4) Read single value from an array.
		// 5) Read multiple values from an array.
		
		// 1) Declarying an array.
		// Approach 01: If the array values is fixed and not change in future.
		
		//int a[] = new int [5];
		//int []a = new int [5]; // also correct.
		// Step2: Added values in array.
		//a[0] = 100;
		//a[1] = 200;
		//a[2] = 300;
		//a[3] = 400;
		//a[4] = 500;
		
		// 2) Approach: if in future you have to add the more values.
		// advantage of approach 2 is memory alloted not used before assigning value than the approach 1.
		
		int a[] = {100, 200, 300, 400, 500, 600, 700}; // step 1 and 2 is done.
		//System.out.println(a[0]); // 4) Read single value from an array.
		
		// 3) Find size of an Array.
		System.out.println("This is the length of an array: "+ a.length);
		
		// 5) Read multiple values from an array.
		// read all values.
		// 1) Normal for loop.
		//for(int i=0;i<a.length;i++) { // i<=4 or i<5 same i<=a.length-1 or i<a.length
		//	System.out.println(a[i]);
		//}
		
		// 2) Enhanced for loop for or for each loop.
		for(int A:a) {
			System.out.println(A);
		}
		
		
		
		
		
		
		

	}

}
