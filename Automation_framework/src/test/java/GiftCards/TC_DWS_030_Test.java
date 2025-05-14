package GiftCards;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericutility.BaseClass;
import genericutility.WebDriverUtility;
import objectrepository.HomePage;

public class TC_DWS_030_Test extends BaseClass {
	@Test
	public void clickOnGiftCards() {
	HomePage hp=new HomePage(driver);
	hp.getGiftcardsLink().click();
	Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Gift Cards", "gift cards is not displayed");
	Reporter.log("Gift cards is displayed",true);
	}

}
