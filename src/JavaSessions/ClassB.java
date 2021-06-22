package JavaSessions;

public class ClassB extends ClassA {
/* Super keyword can be used only once in the constructor & it should be the first statement
 * SUPER KEYWORD--> is used to call PARENT CLASS Constructor
 * 
 * */
	
	public ClassB() {
		super();
		//System.out.println("Child Class contructor");
	}
	
	public ClassB(int i) {
		super(i);
		//System.out.println("Child Class contructor");
	}
	
	public ClassB(int i, int j) {
		super(i, j);
		//System.out.println("Child Class contructor");
	}
	public static void main(String[] args) {
		ClassB b= new ClassB();
		
		ClassB b1= new ClassB(10);
		
		ClassB b2= new ClassB(3000,5000);
	}

}
