package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPageObject {

	public WebDriver driver;

	private By loginemail = By.xpath("//input[@ name='email']");
	private By loginpwd = By.xpath("//input[@ name='password']");
	private By loginbutton = By.xpath("//input[@ value='Login']");
	private By loginsuccessful=By.xpath("//a[text()='Account']");

	public loginPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement enterloginemail() {
		return driver.findElement(loginemail);

	}

	public WebElement enterloginpwd() {
		return driver.findElement(loginpwd);
	}

	public WebElement enterloginbutton() {
		return driver.findElement(loginbutton);
	}
	public WebElement enterloginsuccessful() {
		return driver.findElement(loginsuccessful);
	}
}
