package JavaSessions;

public abstract class AbstractBankClass {

	/*1) In ABSTRACT Class - At least 1 method should be there---> which is abstract in
	nature--> ONLY METHOD DECLARATION & No METHOD BODY*/
	 

	/* 2) Abstraction means---> TO HIDE THE IMPLEMENTATION DETAILS */

	/* 3) We are achieving PARTIAL ABSTRACTION */
	
	/* 4) Always remember WE CANNOT CREATE AN OBJECT of ABSTRACT Class */
	
	/* 5) In Abstract Class - we can have Final, Non-Final, Static & Non-static variables */
	
	/* 6) Does not support Multiple Inheritance */
	
	/* 7) Performance wise - Abstract class is FASTER compared to Interface */
	
	int amount;
	final int rate=100;
	static int loanrate= 5;
	public abstract void loan();

	/* This is the ABSTRACT METHOD loan () - No method body is present */

	public void credit() {

		/* This credit() method - is NON-ABSTRACT method */
		System.out.println("Bank---Credit");
	}

	public void debit() {

		/* This debit() method - is NON-ABSTRACT method */
		System.out.println("Bank---Debit");
	}

}
