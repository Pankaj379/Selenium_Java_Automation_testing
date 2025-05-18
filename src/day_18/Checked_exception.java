package day_18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Checked_exception {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException {
		// Checked Exception.
		System.out.println("Program is started...");
		System.out.println("Program is in progress...");
		
		// Method1: Using try catch.
		/*
		 * try { Thread.sleep(5000); } catch(InterruptedException e) {
		 * System.out.println("Handled the exception with try and catch...");
		 * System.out.println(e.getMessage()); }
		 */
		
		// Method2: Using throws keyword.
		Thread.sleep(5000);
		FileInputStream file = new FileInputStream("C:\\FileUpload\\students.json");
		
		System.out.println("Program is executed....");
		System.out.println("Program is finished..");

	}

}
