package day20;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// 1) DIclaration.
		
		//	Both can store all types of data homo and hetro but mainly used to store hetro.
		ArrayList myList = new ArrayList();
		//List myList1 = new ArrayList();
		
		// If want to store only Homo then below notations are used.
		//ArrayList <Integer> myList2 = new ArrayList<Integer>();
		//ArrayList <String> myList3 = new ArrayList<String>();
		//ArrayList <Employee> myList4 = new ArrayList<Employee>();
		
		// 2) Adding data into arrayList.
		myList.add(100);
		myList.add("welcome");
		myList.add('P');
		myList.add(10242.9802323);
		myList.add(100);
		myList.add(true);
		myList.add(null);
		myList.add(12.4);
		myList.add(10000000);
		myList.add(null);
		
		// 3) To find the size of the arraylist.
		System.out.println("The size of the arraylist is : " +myList.size()); // 10
		
		// 4) To print the arrayList.
		System.out.println("The Values of arraylist is : " +myList); // [100, welcome, P, 10242.9802323, 100, true, null, 12.4, 10000000, null]


		// Remove element(item,object) from arrayList.
		myList.remove(4);
		System.out.println("After Remove the size of the arraylist is : " +myList.size()); // 9
		System.out.println("After Remove an element of arraylist is : " +myList); // [100, welcome, P, 10242.9802323, true, null, 12.4, 10000000, null]

		// Insert element in arraylist.
		myList.add(3,"Java");
		System.out.println("After Insertion an element of arraylist is : " +myList); // [100, welcome, P, Java, 10242.9802323, true, null, 12.4, 10000000, null]
		
		// Replace(Change/Modify) the element.
		myList.set(3, "Python");
		System.out.println("After replacing an element of arraylist is : " +myList); // [100, welcome, P, Python, 10242.9802323, true, null, 12.4, 10000000, null]

		// Access specific element from the arraylist.
		System.out.println("After getting specific element :" +myList.get(3)); // python.
		
		
		// Reading all the element from the arraylist.
		
		// Using normal for loop.
		for(int i=0;i<myList.size();i++) {
			System.out.println("After reading data from array list : " + myList.get(i));
		}
		
		// Using for each loop.
		for(Object a : myList) {
			System.out.println("For each loop values: " + a);
		}
		
		
		// Using iterator specifically for the array list.
		Iterator it = myList.iterator(); // Here we are not creating object but storing value in an object.
		// Iterator<Object> it = myList.iterator();
		// Iterator<Employee> it = myList.iterator(); // For homogenious data.
		// while(it.hasNext()) {
    	// System.out.print(it.next()); // 100welcomePPython10242.9802323truenull12.410000000null
    	//	}
		
    	// Checking arraylist is empty or not?
	    //	System.out.println("Checking arraylist is empty or not : "+ myList.isEmpty()); // False.
		
		// Scenario1 remove 1 element or multipe one by one from arraylist.
		// System.out.println("Removing the 2nd element from array list :"+ myList.remove(1));
		// System.out.println("Removing the 2nd element from array list :"+ myList.remove(2));
		// System.out.println(myList);
		
		// To remove all the elements from the arraylist.
	//	myList.clear();
	//	System.out.println(myList);
    //	System.out.println("Checking arraylist is empty or not : "+ myList.isEmpty());
		
	//	To remove multiple elements in single shot.
		
		ArrayList myList2 = new ArrayList();
		myList2.add(true);
		myList2.add(null);
		myList2.add(null);
		myList2.add(10000000);
		myList.removeAll(myList2);
		System.out.println(myList); // [100, welcome, P, Python, 10242.9802323, 12.4]
		
	}

}
