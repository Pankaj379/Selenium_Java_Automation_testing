package day04;

public class Largest_Of_Three_Numbers {

	public static void main(String[] args) {
		// Main logic is if a>b and a>c then a is the largest same for all statements.
		
		int a=20, b=30, c=10;
		
		if(a>b && a>c) {
			System.out.println("A is a largest Number");
		}else if(b>a && b>c) {
			System.out.println("B is a largest Number");
		}else{
			System.out.println("C is a largest Number");
		}
		

	}

}
