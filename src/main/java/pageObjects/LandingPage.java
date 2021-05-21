package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public WebDriver driver;

	By signin = By.xpath("//span[contains(text(),'Login')]");

	By title = By.cssSelector(".text-center>h2");

	By NavBar = By.cssSelector("div[class='navbar navbar-default navbar-static-top']");

	By header = By.xpath("//p[contains(text(),'Learn Hot tools like Selenium')]");

	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub

		this.driver = driver;
	}

	public LoginPage getLogin() {

		driver.findElement(signin).click();
		LoginPage lp = new LoginPage(driver);
		return lp;
	}

	public WebElement getTitle() {

		return driver.findElement(title);
	}

	public WebElement getNavigationBar() {

		return driver.findElement(NavBar);
	}

	public WebElement getHeader() {

		return driver.findElement(header);
	}

}
