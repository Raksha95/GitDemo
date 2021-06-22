
public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "madam";

		String revstring = "";

		for (int i = s.length() - 1; i >= 0; i--) {

			revstring = revstring + s.charAt(i);
		}

		System.out.println(revstring);
		
		if (revstring==s) {

			// Say if String s= "madam" then the reverse is also "madam" you can call that as palindrome
		System.out.println("It is a palindrome");	
			
		}
	}

}
