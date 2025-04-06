package day10;

public class Greetings_Main {

	public static void main(String[] args) {
		// Main method of greeting class.

		Greetings gr = new Greetings();
		// 1
		gr.m1();

		// 2  
		gr.m2();// we have to hold the value of return.
		System.out.println(gr.m2());
		//or
		String s = gr.m2();
		System.out.println(s);
		
		// 3
		gr.m3("Pankaj Nath");
		
		// 4
		String st = gr.m4("Yudhveer Nath");
		System.out.println(st);


	}

}
