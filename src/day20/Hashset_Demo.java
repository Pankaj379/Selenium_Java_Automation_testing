package day20;

import java.util.HashSet;
import java.util.Set;

public class Hashset_Demo {

	public static void main(String[] args) {
		// Hashset collections.
		
		HashSet hs = new HashSet();
		//Set st = new HashSet();  // Set is a parent claas.
		//HashSet<String> name = new HashSet<String>(); // for homogenious data.
		
		
		// Adding value in the Hashset.
		hs.add(100);
		hs.add(198.090);
		hs.add("Java and Selenium");
		hs.add("J");
		hs.add(true);
		hs.add(100);
		hs.add(null);
		hs.add(1004284.323242);
		hs.add(null);
		
		System.out.println("Hashset values : "+ hs); // [null, Java and Selenium, 100, J, 198.09, 1004284.323242, true]

	}

}
