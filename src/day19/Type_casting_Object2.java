package day19;

class animal{}

class Dog extends animal{}
class Cat extends animal{}

// Cat ct = (Cat) an;
//  A   b     C    d
public class Type_casting_Object2 {

	public static void main(String[] args) {
		// Rule1: Conversion is valid or not.
		// The type of d and C must have realation ship.(Either parent child or vise versa.)
		
		animal an = new Dog();
		Cat ct = (Cat) an; // valid as per rule 1.
		
		Dog dg = new Dog();
		// Cat ct1 = (Cat) dg; // Invalid as per the rule 1.
		
		//Rule2: Assignment is valid or not.
		// C must be either same or child or A.
		
		animal an1 = new Dog();
		Cat ct2 = (Cat) an1; // Valid as per the rule-2.
		// Cat ct3 = (Dog) an2; // Invalid as per the rule-2.
		
	//	Note: For all three rules of rules are valid then the run time error occur: ClassCastException.
	//	but if rule are not valid then the it shows compile time error.
		
		// Rule3: The underlying object(Dog()) type of d must be must be either same or child or C.
		animal an2 = new Dog();
		Cat ct3 = (Cat) an2; // Invalid as per the rule number 3 in this rule only run time error will show.
		
		
		// Now check the validation of type casting rules.
		animal an3 = new Dog();
		Dog dg1 = (Dog) an3;  // Rule1=Yes     Rule2=Yes       Rule3=Yes. if these three rules satisfies then typecasting is possible otherwise not.
		
		
		
		
		

	}

}
