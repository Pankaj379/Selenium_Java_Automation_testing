package day19;

public class Type_Casting_Concept {

	public static void main(String[] args) {
		//1) Upcasting: Automatic process: low to high value conversion.
		
		int intValue = 100;
		long longValue = intValue;
		System.out.println(longValue);// automatic process to store the low space value in high space value.
		
		float fValue = 29.99f;
		double dValue = fValue;
		System.out.println(dValue); // same upcasting.
		
		// 2) Downcasting: Manually: Higher space value to lower space so some data will have to lose to fit in small size.
		
		long lValue = 1000000000;
		//int inValue = (int) lValue;
		//System.out.println(inValue);
		

	}

}
