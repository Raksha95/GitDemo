package JavaSessions;

public class BMW implements CarInterface {

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("BMW ---Start");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("BMW ---Stop");
	}

	@Override
	public void refuel() {
		// TODO Auto-generated method stub
		System.out.println("BMW ---Refuel");
	}

	//theftsafety()---> this is a non-overridden method specific to BMW class only 
	public void theftsafety() {
		System.out.println("BMW ---Theft Safety");
		
	}

}
