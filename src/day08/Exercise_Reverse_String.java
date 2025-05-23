package day08;

public class Exercise_Reverse_String {

	public static void main(String[] args) {
		// 1) Reverse string using: length() and charAt().

		String s = "Playwright";
		String rev = "";

		for(int i=s.length()-1;i>=0; i--) {

			rev = rev+s.charAt(i);

		}

		System.out.println("Reverse value of string is: "+ rev);


		// 2) 2nd approach without using string methods.

		String st = "Welcome";
		String rev1 = "";

		char a[] = st.toCharArray();

		for(int i= a.length-1;i>=0;i--) {

			rev1 = rev1+a[i];

		}
		System.out.println("Reverse String without using string methods : "+ rev1);

		// Approach 3rd using StringBuffer class.
		StringBuffer sb1 = new StringBuffer("Welcome");
		// StringBuffer s1= “Welcome”; // This is not acceptable because String method is immutable but string builder and stringbuffer class is a mutable object.

		System.out.println("Reverse String using StringBuffer class : "+ sb1.reverse());


		// Approach 4th using StringBuilder class.
		StringBuilder sb2 = new StringBuilder("Welcome");
		System.out.println("Reverse String using StringBuilder class : "+ sb2.reverse());



		// Note: In code lang: Mutable: We Can Change and Immutable: means which we can’t change.
		// For interview they will expect the login not the shortcut method like string Builder/buffer method of reverse().







	}

}
