package day_17;

public class Wrapper_class_concept {

	public static void main(String[] args) {
		// To convert the primitive data type to non-primitive data type and vise-versa.

		//	String s = "Welcome"; // not possible to convert into int.
		String s = "12"; // now possible
		String s1 = "23";
		System.out.println(s+s1); // 1223
		// Only concade but addition not possible.
		System.out.println(Integer.parseInt(s)+Integer.parseInt(s1)); // 35
		// now addition is possible.

		// 2) convert into double.

		String s3 = "233.543433";
		System.out.println(Double.parseDouble(s3)); // 233.543433

		//	3) Convert the boolean value.
		String s4 = "false";
		System.out.println(Boolean.parseBoolean(s4)); // false.
		String s5 = "welcome to java";
		System.out.println(Boolean.parseBoolean(s5)); // by default is false.
		String s6 = "True";
		System.out.println(Boolean.parseBoolean(s6)); // True case sensitive also allowed.

		
		// Scenario 2: convert from primitive to string type.
		int i = 92;
		double d = 234.43;
		char c = 'K';
		boolean b = true;

		String sv = String.valueOf(i);
		System.out.println(sv);

		sv= String.valueOf(d);
		System.out.println(sv);

		sv = String.valueOf(c); 
		// We can convert char to string variable but not string to char.
		System.out.println(sv);

		sv = String.valueOf(b);
		System.out.println(sv);

	}

}
