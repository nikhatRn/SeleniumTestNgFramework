package Testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObjectModel.HomepageObject;
import PageObjectModel.loginPageObject;
import Resources.BaseClass;
import Resources.commonMethods;
import Resources.constants;

public class Logintestcases extends BaseClass {
	@Test
	public void verifyloginwithvalidcredentials() throws IOException {
		
		HomepageObject hpo = new HomepageObject(driver);
		hpo.clickOnMyAccount().click();
		hpo.clickOnlogin().click();

		loginPageObject lpo = new loginPageObject(driver);
		lpo.enterloginemail().sendKeys(emailAddress);
		lpo.enterloginpwd().sendKeys(constants.loginpwd);
		lpo.enterloginbutton().click();
        String Expectedresult=constants.expectedmsg;
        String actualResult=lpo.enterloginsuccessful().getText();
        commonMethods.handleAssertion(actualResult, Expectedresult);
        
        // added changes by nikhatnewtest
	}

}
