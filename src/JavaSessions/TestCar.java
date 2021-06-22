package JavaSessions;

public class TestCar {

	public static void main(String[] args) {
		BMW b = new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.theftsafety();
		
		CarInterface c = new BMW(); // Dynamic polymorphism
		 c.start();
		 c.stop();
		 c.refuel();
		/* c.threftsafety() cannot be accessed because this method is only specific to  BMW class */
		
	}

}
