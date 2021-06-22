package JavaSessions;

public interface CarInterface {

	final int wheels = 4;

	int windows = 5; // By default it will treated as Final & Static variable
	/*
	 * 1) In Interface - We need to achieve 100% ABSTRACTION --Strictly abstract
	 * methods only, no need to write "Abstract" keyword also
	 */

	/* 2) Interface- means Blueprint/prototype */

	/*
	 * 3) In Interface we need to have ONLY & ONLY Abstract Methods- NO METHOD BODY
	 */

	/* 4) Always Remember : WE CANNOT CREATE AN OBJECT OF INTERFACE Class */

	/* 5) In Interface - ONLY final & Static variables can be created */

	/* 6) Supports Multiple Inheritance */

	public void start();

	public void stop();

	public void refuel();
}
