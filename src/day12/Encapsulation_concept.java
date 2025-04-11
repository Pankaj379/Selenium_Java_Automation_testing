package day12;

public class Encapsulation_concept {
	// Encapsulation concept.
	private int accNo;
	private String name;
	private double amount;

	void setAccNo(int accNo){

		this.accNo = accNo;

	}

	int getAccNo() {

		return accNo;

	}
	
	// this keywords define that it's class variable if duplication is done.
	// most important manually generate get and set methods are very TTS task.
	// so user generate getters and setters from source option.

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}









}
