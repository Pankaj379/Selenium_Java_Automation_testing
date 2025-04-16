package all_assignments;

public class Smallest_of_three_Number {

	public static void main(String[] args) {
		// Smallest of three numbers.
		
		int a=100,b=200,c=49;
		
		if(a<b&&a<c) {
			System.out.println("The value of a variable is the smallest : "+ a);
		}else if(b<a&&b<c){
			System.out.println("The value of b variable is the smallest : "+ b);
		}else {
			System.out.println("The value of c variable is the smallest : "+ c);
		}

	}

}
