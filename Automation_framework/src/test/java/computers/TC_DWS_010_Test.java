package computers;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericutility.BaseClass;
import objectrepository.HomePage;

public class TC_DWS_010_Test extends BaseClass {
	@Test
	public void clickOnComputers() {
		HomePage hp=new HomePage(driver);
		hp.getComputersLink().click();
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Computers", "Computers page is not displayed");
		Reporter.log("computers page is displayed",true);
	}
		
		
	}


