package genericutility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtility {
	
	

	public void maximize(WebDriver driver) {
		driver.manage().window().maximize();
	}
	
	
	public void mouseHover(WebDriver driver,WebElement element) {
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();
	}
	
	
	public void clickAndHold(WebDriver driver,WebElement element) {
		Actions act=new Actions(driver);
		act.moveToElement(element).clickAndHold();
	}
	
	
	public void dragAndDrop(WebDriver driver,WebElement element) {
		Actions act=new Actions(driver);
		act.dragAndDrop(element, element).perform();
	}
	
	
	public void doubleClick(WebDriver driver,WebElement element) {
		Actions act=new Actions(driver);
		act.doubleClick(element).perform();
	}
	
	
	public void scroll(WebDriver driver,WebElement element) {
		Actions act=new Actions(driver);
		act.scrollToElement(element).perform();
	}
	
	
	public void selectDropdown(WebElement element, int index) {
		Select s=new Select(element);
		s.selectByIndex(index);
	}
	
	
	public void selectDropdown(WebElement element, String value) {
		Select s=new Select(element);
		s.selectByValue(value);
	}
	
	
	public void selectDropdownByText(WebElement element, String text) {
		Select s=new Select(element);
		s.selectByVisibleText(text);
	}
	
	
	public void SwitchToFrame(WebDriver driver,int index) {
		driver.switchTo().frame(index);
	}
	
	
	public void SwitchToFrame(WebDriver driver,String nameOrId) {
		driver.switchTo().frame(nameOrId);
	}
	
	
	public void SwitchToFrame(WebDriver driver,WebElement frameElement) {
		driver.switchTo().frame(frameElement);
	}
	
	
	public void switchToAlertAndAccept(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	
	
	public void switchToAlertAndCancel(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}
	
	public Alert switchToAlert(WebDriver driver) {
		return driver.switchTo().alert();
	}
	
	
	 public void getPhoto(WebDriver driver) throws IOException {
		 JavaUtility jUtil=new JavaUtility();
		 TakesScreenshot ts=(TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshots/"+jUtil.getSystemtTime()+".png");
		FileHandler.copy(temp, dest);
	 }
}
