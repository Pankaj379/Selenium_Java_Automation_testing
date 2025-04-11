package day11;

public class Constructor_overloading {
	
	double width, height, length;
	
	Constructor_overloading(){// default constructor.
		width = 0;
		height = 0;
		length = 0;
		
		width=height=length=0;
	}
	
	Constructor_overloading(double w,double h,double l)
	{
		
		width = w;
		height = h;
		length = l;
		
	}
	
	Constructor_overloading(double l)
	{
		
		width=length=height=l;
		
	}
	
	double Volume(){ // local variable
		return width*height*length;
	}
	
	

}
