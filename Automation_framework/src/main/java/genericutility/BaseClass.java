package genericutility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import objectrepository.HomePage;
import objectrepository.LoginPage;
import objectrepository.WelcomePage;

public class BaseClass {
	public WebDriverUtility wUtil=new WebDriverUtility();
	public FileUtility fUtil=new FileUtility();
	
	public static WebDriver driver;
	
	@BeforeClass
	public void openBrowser() throws IOException {
		driver=new ChromeDriver();
		wUtil.maximize(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get(fUtil.getDataFromProperty("url"));
	}

	@BeforeMethod
	public void login() throws IOException {
		WelcomePage wp=new WelcomePage(driver);
		wp.getLoginLink().click();
		
		
		LoginPage lp=new LoginPage(driver);
		lp.getEmailTextField().sendKeys(fUtil.getDataFromProperty("email"));
		lp.getPasswordTextField().sendKeys(fUtil.getDataFromProperty("password"));
		lp.getLoginButton().click();
		
	}
	
	@AfterMethod
	public void logout() {
		HomePage hp=new HomePage(driver);
		hp.getLogoutLink().click();
	}
	
	
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}

	public void OnTestFailure() {
		// TODO Auto-generated method stub
		
	}
}
