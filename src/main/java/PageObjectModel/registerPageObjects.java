package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class registerPageObjects {

	public WebDriver driver;

	private By firstname = By.xpath("//input[@ name='firstname']");
	private By lastname = By.xpath("//input[@ name='lastname']");
	private By emailaddress = By.xpath("//input[@ name='email']");
	private By telephone = By.xpath("//input[@ name='telephone']");
	private By password = By.xpath("//input[@name='password']");
	private By pwdconfirm = By.xpath("//input[@name='confirm']");
	private By Buttoncontinue = By.xpath("//input[@ value='Continue']");
	private By checkboxbutton = By.xpath("//input[@ type='checkbox']");
	private By registersuccessful= By.xpath("//h1[text()='Your Account Has Been Created!']");
	
	private By FirstnameErrormsg= By.xpath("//div[text()='First Name must be between 1 and 32 characters!']");
	private By LastnameErrormsg= By.xpath("//div[text()='Last Name must be between 1 and 32 characters!']");
	private By EmailErrormsg =By.xpath("//div[text()='E-Mail Address does not appear to be valid!'] ");
	private By TelephoneErrormsg= By.xpath("//div[text()='Telephone must be between 3 and 32 characters!'] ");
	private By passwordErrormsg= By.xpath("//div[text()='Password must be between 4 and 20 characters!'] ");
	private By checkboxErrormsg= By.xpath("//div[text()=' Warning: You must agree to the Privacy Policy!'] ");
	
	

	public registerPageObjects(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement enterfirstname() {
		return driver.findElement(firstname);

	}

	public WebElement enterlastname() {
		return driver.findElement(lastname);
	}

	public WebElement enteremailaddress() {
		return driver.findElement(emailaddress);
	}

	public WebElement entertelephone() {
		return driver.findElement(telephone);
	}

	public WebElement enterpassword() {
		return driver.findElement(password);
	}

	public WebElement enterpwdconfirm() {
		return driver.findElement(pwdconfirm);
	}

	public WebElement enterbuttoncontinue() {
		return driver.findElement(Buttoncontinue);
	}

	public WebElement entercheckboxbutton() {
		return driver.findElement(checkboxbutton);
	}
	public WebElement enterregistrationsuccessful() {
		return driver.findElement(registersuccessful);
	}
	public WebElement enterfirstnamerror() {
		return driver.findElement(FirstnameErrormsg);
	}
	public WebElement enterlastnamerror() {
		return driver.findElement(LastnameErrormsg);
	}
	public WebElement enterEmailrror() {
		return driver.findElement(EmailErrormsg );
	}
	public WebElement enterTelephoneerror() {
		return driver.findElement(TelephoneErrormsg);
	}
	public WebElement enterPwderror() {
		return driver.findElement(passwordErrormsg);
	}
	public WebElement enterCheckboxerror() {
		return driver.findElement(checkboxErrormsg);
	}
	
	
}
