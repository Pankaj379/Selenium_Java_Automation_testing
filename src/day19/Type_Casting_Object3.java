package day19;

public class Type_Casting_Object3 {
	
	// A b = C d;

	public static void main(String[] args) {
		// examples of type casting.
		
		// Ex1:
		//Object o = new String("Welcome");
		//StringBuffer sb = (StringBuffer) o;  //  Rule1-valid Rule2-valid  Rule3-Invalid.
		
		// Ex2:
		//String s = new String("Welcome");
		//StringBuffer sb = (StringBuffer) s;  // Rule1-Invalid.
		
		// Ex3:
		//Object o = new String("Welcome");
		//StringBuffer sb = (StringBuffer) o; // Rule1-Valid Rule2-valid Rule3-Invalid.
		
		// Ex4:
		//Object o = new String("Welcome");
		//StringBuffer sb = (String) o;         // Rule1-Valid  Rule2-invalid.
		
		// Ex5:
		// String s = new String("Welcome");
		// StringBuffer sb = (String) s;     // Rule1-Vaid  Rule2-invalid.
		
		// Ex6:
	//	Object o = new String("Welcome");
	//	StringBuffer sb = (StringBuffer) o;  // Rule1- Valid Rule2-Valid Rule3-Invalid.
		
		// Ex7:
		Object o = new String("Welcome");
		String s = (String) o;                // Rule1-Valid Rule2-Valid Rule3-Valid.
		System.out.println(s);

	}

}
