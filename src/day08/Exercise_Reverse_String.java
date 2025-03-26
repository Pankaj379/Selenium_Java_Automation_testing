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
		

	}

}
