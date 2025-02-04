package day04;

public class Week_No_Using_Switch {

	public static void main(String[] args) {
		// Note: Switch statement reduce code than else if condition.
		
		int weekNo=4;
		
		switch(weekNo)
		{
		case 1:System.out.println("Monday"); break;
		case 2:System.out.println("Tuesday"); break;	
		case 3:System.out.println("wednesday"); break;	
		case 4:System.out.println("Thursday"); break;
		case 5:System.out.println("Friday"); break;
		case 6:System.out.println("Saturday"); break;
		case 7:System.out.println("Sunday"); break;
		default:System.out.println("Invalid Week Number");
		}

	}

}
