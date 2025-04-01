package day08;

public class String_comparison {

	public static void main(String[] args) {
		//Case1:  String Comparisons.

		String s1 = "welcome";
		String s2 = "welcome";
		System.out.println(s1==s2); // true
		System.out.println(s1.equals(s2)); // true


		// Case2
		String sn1 = new String("welcome");
		String sn2 = new String("welcome");
		System.out.println(sn1==sn2);// false: == method compares the objects.
		System.out.println(sn1.equals(sn2));// true: equals() compares the value of object. 
		// Note: KT Screenshot: https://prnt.sc/L5fztpFzQNsm

		// Case3
		String ss = "welcome";
		String sb3 = new String("welcome");
		System.out.println(ss==sb3);// false
		System.out.println(ss.equals(sb3));// true

		// Case4
		String sn4 = "welcome";
		String sn5 = new String("welcome");
		String sn6=sn5;
		System.out.println(sn4==sn5);// false
		System.out.println(sn4.equals(sn5));// true
		System.out.println(sn6==sn5); // true because objects are same.


		// Note: KT screenshot: https://prnt.sc/PDdwfVQUcB4x


	}

}
