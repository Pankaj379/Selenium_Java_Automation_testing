package day20;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hashset_Demo {

	public static void main(String[] args) {
		// Hashset collections.
		
		HashSet hs = new HashSet();
		//Set hs = new HashSet();  // Set is a parent claas.
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

		// Size of hashset.
		System.out.println("Size of Hashset : "+hs.size()); // 7
		
		// Remove value from hashset.
		hs.remove(100); // directly removed the value.(Not index)
		System.out.println("After removing value : "+ hs); // [null, Java and Selenium, J, 198.09, 1004284.323242, true]
	
		// Inserting Elemet - not possible becuase it's not in proper order like array.
		
		// Access specific element is also not possible.
		// But alternative way is we can user arraylist to access specific element.
		// For interview the answer is clearly no for access element directly but alternatively by converting hashset into array list.
		
		// Convert Hashset into arraylist.
		ArrayList al = new ArrayList(hs);
		System.out.println(al.get(1)); // Java and Selenium
		
		// Read data from hashset.
		// Note only possible with enhanced for loop not with simple for loop because indexing is needed for normal for loop.
		for(Object h:hs) {
			System.out.print(h);  // nullJava and SeleniumJ198.091004284.323242true
		}
		
		
		// By using Iterator.
		Iterator<Object> it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next()); // with ln loop run with line space.
		}
		
		
		// Remove all elements from the hashset.
		hs.clear();
		System.out.println("After clearing all elements :"+hs); // []
		System.out.println(hs.isEmpty()); // true
		
		
		
	}
}
