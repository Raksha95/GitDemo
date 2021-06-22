package testPackage;

public class FinallyConcept {

	public static void main(String[] args) {

		//test();
		//test1();
		interview();
	}

	/*
	 * 1) Finally is a reserved keyword is always used in association with the
	 * TRY-CATCH block
	 * 
	 * 2) Whatever code is written inside the finally block it will be executed only
	 * after executing the try-catch block
	 * 
	 * 3) Doesn't matter if any exception is coming or not, FINALLY block will be
	 * executed always.
	 * 
	 * 
	 * 4) In SELENIUM we use finally block - To QUIT the DRIVER 
	 * eg:- finally{
	 * 
	 * driver.quit();
	 * }
	 * 
	 */
	public static void test() {    // 1) With Exception method
		try {

			System.out.println("inside test1 method ");

			throw new RuntimeException("test");
		} catch (Exception e) {
			System.out.println("I am inside catch block ");

		}

		finally {
			System.out.println("I am inside finally block");

		}
	}
	   
	public static void test1() { // 2) Without Exception method
			try {

				System.out.println("inside test2 method ");

				
			} 

			finally {
				System.out.println("I am inside finally block-test2");

			}
	}
			public static void interview(){  // 3) With different Exception method
				
				int i=10;
				try {

					System.out.println("inside division-Try method ");
					
					int k=i/0;

					
				} catch (ArithmeticException e) {
					System.out.println("inside  division catch block ");
					System.out.println("Divide by zero error-Arithmetic exception ");
				}

				finally {
					System.out.println(" Inside division method's finally block");

				}
			}
			   
	
	
	}
