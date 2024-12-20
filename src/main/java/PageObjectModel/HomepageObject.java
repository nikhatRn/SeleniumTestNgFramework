package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomepageObject {

	public WebDriver driver;
	private By MyAccount = By.xpath("//a[@ title='My Account']");
	private By register = By.xpath("//a[text()='Register']");
	private By login = By.xpath("//a[text()='Login']");

	public HomepageObject(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement clickOnMyAccount() {
		return driver.findElement(MyAccount);
	}

	public WebElement clickOnregister() {
		return driver.findElement(register);
	}

	public WebElement clickOnlogin() {
		return driver.findElement(login);
	}

}
