package resources;

import java.io.File;
import org.apache.commons.io.FileUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class base {
	public WebDriver driver; // driver - is made as Global object can be accessed in all the child classes as
								// well

	public Properties prop; // Can be accessed in all the child classes as well

	public WebDriver initializeDriver() throws IOException {
		prop = new Properties();

		// System.getproperty("user.dir")

		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\resources\\data.properties");

		prop.load(fis);
		// mvn test -Dbrowser=chrome ---> To Run the script through MAVEN COMMANDS

		//String browserName = System.getProperty("browser"); // This is to invoke the browser through the Maven command

		 String browserName = prop.getProperty("browser");

		if (browserName.contains("chrome")) {
			// execute in chrome browser
			// ChromeOptions options = new ChromeOptions(); ---> This part of the code is to
			// run the script without chrome driver being invoked but the script will run in
			// HEADLESS Mode
			// options.addArguments("--headless");

			System.setProperty("webdriver.chrome.driver", "D://drivers//chromedriver7.exe"); // Launch chrome driver

			ChromeOptions options = new ChromeOptions();

			options.setAcceptInsecureCerts(true);
			/*
			 * To run the script by invoking CHROME BROWSER in HEADLESS MODE i.e it will not
			 * display the chrome browser
			 */

			if (browserName.contains("headless")) {
				options.addArguments("headless");
			}
			driver = new ChromeDriver(options);
		}

		else if (browserName.equals("firefox")) {

			// execute in firefox browser

			System.setProperty("webdriver.gecko.driver", "D:\\drivers\\geckodriver-two.exe"); // Launch firefox driver
			driver = new FirefoxDriver();

		}

		else if (browserName.equals("Edge")) {

			// execute in Internet Explorer

			System.setProperty("webdriver.ie.driver", "D:\\drivers\\msedgedriver.exe"); // Launch Edge
																						// driver
			driver = new InternetExplorerDriver();

		}

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		return driver;
	}

	public String getScreenShotPath(String testCaseName, WebDriver driver) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destinationFile = System.getProperty("user.dir") + "\\reports\\" + testCaseName + ".png";
		FileUtils.copyFile(source, new File(destinationFile));
		return destinationFile;

	}

}
