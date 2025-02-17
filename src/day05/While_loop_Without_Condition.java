package day05;

public class While_loop_Without_Condition {

	public static void main(String[] args) {
		// While loop without any condition.

		int i = 1;

		while(true) {
			System.out.println(i + " : Hello");
			i++; // or not user this i++.
			if(i>=10){
				break;
			}
		}

	}

}
