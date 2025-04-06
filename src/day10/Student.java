package day10;

public class Student {
	
	
	// 1: Using object reference variables.
	
	String sname;
	int sid;
	char gr;// These are class variables.
	
	void PrintStudentData() 
	{
		System.out.println(sname+"  "+sid+"  "+gr);
	}
	
	// 2: Using method to store data.
	
	void SetStudentData(int stu_id, String stu_name, char stu_gr) 
	// These are local variable only aplicable for this method only.
	{
		sid = stu_id;
		sname = stu_name;
		gr = stu_gr;
		
	}
	
	// Constructor vs method: 1) Same name as class name.
	// 2) constructor never return any value so don't mention void before constructor, if using then not compulsory.
	// 3) But constructor take parameters.
	// 4) Construct purpose is to initializing the data only.
	
	Student(int id, String name, char ch)
	{
		sid = id;
		sname = name;
		gr = ch;
		// always assign class variable in left side and local on right side otherwise it gives error.
	}

}
