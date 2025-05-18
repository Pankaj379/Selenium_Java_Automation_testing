package day19;

class parent{
	
	String name = "john";
	
	void m1() {
		System.out.println("This is m1 from parent class...");
	}
}

class child extends parent{
	int id = 192;
	void m2() {
		System.out.println("This is a m2 from child class....");
	}
}



public class Type_Casting_Object1 {

	public static void main(String[] args) {
		
//		child c = new child();
//		System.out.println(c.name);
//		c.m1();
//		System.out.println(c.id);
//		c.m2();
		
		// Upcasting:
		parent p = new child();
		System.out.println(p.name);
		p.m1();
	//	System.out.println(p.id); we can not access.
	//	p.m2(); we can not access.
		
		// downcasting:
		parent par = new parent();
		child ch = (child) par; 
		// Note: On runtime shows error but not when coding compile time error.
		System.out.println(ch.name); // java.lang.ClassCastException
		ch.m1();
		System.out.println(ch.id);
		ch.m2();
	
		
		
		
		
		
		

	}

}
