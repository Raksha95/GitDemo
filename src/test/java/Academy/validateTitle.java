package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.base;

public class validateTitle extends base {

	public WebDriver driver;

	public static Logger log = LogManager.getLogger(base.class.getName());

	LandingPage l;

	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();

		log.info("Driver is initialized");

		driver.get(prop.getProperty("url"));

		log.info("Navigated to the Home Page");

	}

	@Test

	public void basePageNavigation() throws IOException {

		l = new LandingPage(driver);

		// Here we will compare the actual text with the expected text in the landing
		// page

		l.getTitle().getText();

		Assert.assertEquals(l.getTitle().getText(), "FEATURED COURSES233");

		log.info("Successfully validated the Title -Featured Course");
	}

	@Test

	public void validateHeader() throws IOException {

		// Here we will compare the actual text with the expected text in the landing
		// page

		l.getTitle().getText();

		Assert.assertEquals(l.getHeader().getText(),
				"Learn Hot tools like Selenium, Appium, JMeter, SoapUI,Database Testing and more..");

		log.info(
				"Successfully validated the Header -Learn Hot tools like Selenium, Appium, JMeter, SoapUI,Database Testing and more.. ");
	}

	@AfterTest

	public void teardown() {

		driver.close();
	}
}
