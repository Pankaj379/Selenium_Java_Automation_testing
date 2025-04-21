package all_assignments;

public class Printweeknumberfromweekname {

	public static void main(String[] args) {
		// To print week number from week name.
		
		String wName = "Monday"; // 2nd day of week.

		
		switch(wName) {
		case "Sunday":System.out.println("1st day of week.");break;
		case "Monday":System.out.println("2nd day of week.");break;
		case "Tuesday":System.out.println("3rd day of week.");break;
		case "Wednesday":System.out.println("4th day of week.");break;
		case "Thursday":System.out.println("5th day of week.");break;
		case "Friday":System.out.println("6th day of week.");break;
		case "Saturday":System.out.println("7th day of week.");break;
		default : System.out.println("Invalid week name...");
		
		}

	}

}
