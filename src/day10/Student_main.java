package day10;

public class Student_main {

	public static void main(String[] args) {
		// 1
		// Student stu = new Student(); // Automatically invoked the constructor but due to no parameter assign it's giving error.
		
	//	stu.sname = "Pankaj Nath";
	//	stu.sid = 2322;
	//	stu.gr = 'A';
	//	stu.PrintStudentData();
		
		// 2: Using method.
	//	stu.SetStudentData(126, "Yudhveer Nath", 'A');
	//	stu.PrintStudentData();
		
		// 3: Using parametrized constructor. Most of the time constructor is used to assign the data.
		Student stu = new Student(423, "Qwerty", 'A');
		stu.PrintStudentData();
		
		
		

	}

}
