package day_15;

class bank{
	double roi() {

		return 0;
	}
}

class ICICI extends bank{
	double roi() {

		return 11.3; // changinig the implementation.
	}

}

class SBI extends bank{
	double roi() {

		return 12.5; // changinig the implementation only.
	}
}

// Note: Without inheritence the overriding is not possible.

public class Method_overriding {
	public static void main(String[] args) {
		// Method overriding conept.

		ICICI ic = new ICICI();
		System.out.println(ic.roi());

		SBI bak = new SBI();
		System.out.println(bak.roi());



	}

}
