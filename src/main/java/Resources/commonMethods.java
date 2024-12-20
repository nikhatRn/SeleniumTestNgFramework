package Resources;

import org.testng.asserts.SoftAssert;

public class commonMethods {
	
	public static void handleAssertion(String actualResult,String expectedResult) {
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actualResult, expectedResult);
		sa.assertAll();
	}

}
