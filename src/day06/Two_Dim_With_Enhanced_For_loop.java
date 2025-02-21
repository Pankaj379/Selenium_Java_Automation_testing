package day06;

public class Two_Dim_With_Enhanced_For_loop {

	public static void main(String[] args) {
		// Enhanced For Loop.
		
		int a[][] = { {100,200},{300,400},{500,600}};
		
		for(int Arr[]:a) {// all row values are store in Arr.
			
			for(int d:Arr) {// all values run one by one of the row.
				
				System.out.print(d + " "); // to show in tabular form.
				
			}System.out.println();
		}

	}

}
