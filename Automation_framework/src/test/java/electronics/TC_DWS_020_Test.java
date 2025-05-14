package electronics;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericutility.BaseClass;
import objectrepository.HomePage;

public class TC_DWS_020_Test extends BaseClass {
	@Test
	public void clickOnElectronics() {
		HomePage hp=new HomePage(driver);
		hp.getElectronicsLink().click();
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Electronics", "Electronics page is not displayed");
		Reporter.log("Electronics page is displayed",true);
	}

}
