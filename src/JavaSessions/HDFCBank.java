package JavaSessions;

public class HDFCBank extends AbstractBankClass {

	/*
	 * HDFC Bank is a child of AbstractClassBank 2) loan() is the abstract method
	 * which is present in the AbstractBankClass 3) It is HDFC Bank's responsibility
	 * to define the loan() method
	 */

	@Override
	public void loan() {
		// TODO Auto-generated method stub
		System.out.println("HDFC----Loan Method");
	}
	public void funds() {
		// TODO Auto-generated method stub
		System.out.println("HDFC----Funds");
	}
   
}
