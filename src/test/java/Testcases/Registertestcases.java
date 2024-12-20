package Testcases;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.HomepageObject;
import PageObjectModel.registerPageObjects;
import Resources.BaseClass;
import Resources.commonMethods;
import Resources.constants;

public class Registertestcases extends BaseClass {
	@Test
	public void verifywithvalidcredentials() throws IOException {
		// initalizeDriver(); shifted to base class as it will be used by every testcase
		// driver.get("https://naveenautomationlabs.com/opencart/index.php?");
		HomepageObject hpo = new HomepageObject(driver);
		hpo.clickOnMyAccount().click();
		hpo.clickOnregister().click();
		// hpo.clickOnlogin().click();

		registerPageObjects rpo = new registerPageObjects(driver);
		rpo.enterfirstname().sendKeys(constants.FirstName);
		rpo.enterlastname().sendKeys(constants.LastName);
		rpo.enteremailaddress().sendKeys(emailAddress);
		rpo.entertelephone().sendKeys(constants.telephone);
		rpo.enterpassword().sendKeys(constants.Pwd);
		rpo.enterpwdconfirm().sendKeys(constants.ConPwd);
		rpo.entercheckboxbutton().click();
		rpo.enterbuttoncontinue().click();
		// rpo.enterregistrationsuccessful().getText();

		String ExpectedResult = constants.ExpectedResult;
		String ActualResult = rpo.enterregistrationsuccessful().getText();
		commonMethods.handleAssertion(ActualResult, ExpectedResult);

	}

	@Test
	public void VerifywiththeBlankData() {
		
		HomepageObject hpo = new HomepageObject(driver);
		hpo.clickOnMyAccount().click();
		hpo.clickOnregister().click();

		registerPageObjects rpo = new registerPageObjects(driver);
		rpo.enterbuttoncontinue().click();
		//SoftAssert sa = new SoftAssert();
		String FirstNameexpected=constants.FirstnameErrormsg;
		String FirstnameActualResult= rpo.enterfirstnamerror().getText();
		commonMethods.handleAssertion(FirstnameActualResult, FirstNameexpected);
		//sa.assertEquals( FirstnameActualResult, FirstNameexpected);
		String LastnameExpected=constants.LastNameErrormsg;
		String LastnameActual=rpo.enterlastnamerror().getText();
		//sa.assertEquals(LastnameExpected, LastnameActual);
		commonMethods.handleAssertion(LastnameActual,LastnameExpected);
		String  emailExpectedresult=constants.EmailRegistraionError;
		String emailActualResult=rpo.enterEmailrror().getText();
		commonMethods.handleAssertion(emailActualResult, emailExpectedresult);
		//sa.assertEquals(emailActualResult, emailExpectedresult);
		String telephoneExpectedResult=constants.TelephoneError;
		String telephoneActualresult=rpo.enterTelephoneerror().getText();
		commonMethods.handleAssertion(telephoneActualresult, telephoneExpectedResult);
		//sa.assertEquals(telephoneExpectedResult, telephoneActualresult);
		String pwdExpectedResult=constants.Pwderrormsg;
		String pwdActualResult=rpo.enterPwderror().getText();
		commonMethods.handleAssertion(pwdActualResult, pwdExpectedResult);
		//sa.assertEquals(pwdExpectedResult, pwdActualResult);
		String checkboxExpectedResult=constants.checkboxerrormsg;
		String checkboxActualResult=rpo.enterCheckboxerror().getText();
		commonMethods.handleAssertion(checkboxActualResult, checkboxExpectedResult);
		//sa.assertAll();
		
	}

}
