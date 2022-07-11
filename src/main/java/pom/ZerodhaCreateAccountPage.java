package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaCreateAccountPage {

	@FindBy (xpath="//input[@type='text']") private WebElement mobileNo;
	@FindBy (xpath="//button[@type='submit']") private WebElement submit;
	
	
	
	
	public ZerodhaCreateAccountPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enterMobileNo(String number) {
		mobileNo.sendKeys(number);
	}
	
	public void clickOnContinue() {
		submit.click();
	}
	
	
}
