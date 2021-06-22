package JavaSessions;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HDFCBank hb= new HDFCBank(); 
		
		hb.loan();
		hb.credit();
		hb.debit();
		hb.funds();
		
		
		AbstractBankClass abc= new HDFCBank();  /* This is called DYNAMIC Polymorphism*/
		
		abc.loan();
		abc.credit();
		abc.debit();
		/* abc.funds()---> This is not accesible by the abc refeerence variable since funds() is only accessible by HDFCBank class only */
		
	}

}
