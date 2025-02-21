package day06;

public class Two_Dimensional_Array {

	public static void main(String[] args) {

		// Two Dimensional Array.

		// 1) Declare an array.
		// 2) Add values in array.
		// 3) Find size of an Array.
		// 4) Read single value from an array.
		// 5) Read multiple values from an array.
		
		// Approach: 1-Static.
		//int a[][] = new int[3][2];  // int []a[], [][]a: is also correct.

	//	a[0][0]=100;
	//	a[0][1]=200;

	//	a[1][0]=300;
	//	a[1][1]=400;

	//	a[2][0]=500;
	//	a[2][1]=600;
		
		
		// Approach: 2-Dynamic.
		int a[][] = { {100,200},{300,400},{500,600}};
		
		// 3) Find size of an Array.
	//	System.out.println("Number of rows :"+ a.length);
	//	System.out.println("Number of column :"+ a[0].length);
		
		
		// 4) Read single value from an array.
		// System.out.println(a[1][0]); // 300
		
		// 5) Read multiple values from an array.(Imp.)
		
 		for(int r=0; r<=a.length-1; r++) { // hard code: r<=2
			
			// inner for loop repeats 2 time in one time outer for loop.
			for(int c=0; c<=a[r].length-1; c++) { // hard code: c<=1
				System.out.print(a[r][c] + " "); // used Sysout without ln to show in tabular form.
			}
			System.out.println();
			
		}
		
		
		
	}

}
