package day08;

public class StringVSStringBufferVSStringBuilder {

	public static void main(String[] args) {
		//1)  string - Immutable

		String s="Welcome";
		System.out.println(s); // Welcome
		s.concat(" to java automation.");
		System.out.println(s); // Welcome Immutable.

		// 2) StringBuilder - Mutable.
		StringBuilder sBuild = new StringBuilder("Welcome");
		sBuild.append(" to java automation.");
		System.out.println(sBuild); // Mutable: Welcome to java automation.

		// 3) StringBuffer - Mutable.
		StringBuilder sBuff = new StringBuilder("Welcome");
		sBuff.append(" to java automation.");
		System.out.println(sBuff); // Mutable: Welcome to java automation.



	}

}
