package JavaSessions;

public class ConstructorWithThisKeyword {

	String name;
	
	int age;
	
	public ConstructorWithThisKeyword(String name, int age) {
		
		this.name=name; // Global variable "name", "age" is initialized to the local variable  
	    this.age=age;
		 
		System.out.println(name);
		
		System.out.println(age);
	}
	
	public static void main(String[] args) {
		
		ConstructorWithThisKeyword obj = new ConstructorWithThisKeyword("Rakshaaa", 300);
		
		
	}

}
