package day09;

// import day100.Employee; // This should be done if main method is in another package.

public class Main_employee {

	public static void main(String[] args) 
	
	{
		// Main method in separate class.
		
		Employee emp1 = new Employee();
		emp1.ename = "Rahul";
		emp1.eid = 100001;
		emp1.esalary= 100000;
		emp1.edesig = "Manager";
	    emp1.display(); // without display method we have to user sysout multiple times.
		//System.out.println(emp1.ename);
		//System.out.println(emp1.eid);
		//System.out.println(emp1.edesig);
		//System.out.println(emp1.esalary);
	    
	    // ||ly for 2nd object.
	    
	    Employee emp2 = new Employee();
	    emp2.ename = "Pankaj";
	    emp2.eid = 100002;
	    emp2.esalary = 1000000;
	    emp2.edesig = "Senior Manager";
	    emp2.display();

	}

}
