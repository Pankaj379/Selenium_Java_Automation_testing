package day13;

public class This_Keyword {
	// Where to use this keyword.
	
	int x , y; // Class variable and instance variables.
	
	//This_Keyword(int a, int b) { // constructor.
		This_Keyword(int x, int y) { // this keyword defines class variables.
		this.x=x; this.y=y; // without this keyword it should o,o because it is not defined clearly that who is class variables and local variables.
	
	}
	
	void display(){
		System.out.println(x);
		System.out.println(y);
	}
	
	
	public static void main(String[] args) {
		
		This_Keyword tk = new This_Keyword(100,200);
		tk.display();
		
	}

}
