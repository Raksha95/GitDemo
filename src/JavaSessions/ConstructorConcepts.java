package JavaSessions;

public class ConstructorConcepts {

	public ConstructorConcepts() {

		System.out.println("This is a Default constructor");
	}

	public ConstructorConcepts(int i) {

		System.out.println("This is a  single parameter constructor");

		System.out.println("The value of i:" + i);
	}

	public ConstructorConcepts(int i, String s) {

		System.out.println("This is a  double parameter constructor");

		System.out.println("The value of i:" + i);

		System.out.println("The value of String is:" + s);
	}

	public static void main(String[] args) {

		ConstructorConcepts obj = new ConstructorConcepts(300, "Raksha R"); // Calls the double param constructor

		ConstructorConcepts obj1 = new ConstructorConcepts(); // Calls the Default constructor----> Default constructor
																// is always hidden even you don't call it will always
																// be present
		ConstructorConcepts obj2 = new ConstructorConcepts(400); // Calls the single param constructor
	}

}
