package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ZerodhaLoginPage {
	
	@FindBy (xpath="//input[@id='userid']") private WebElement userId;
	@FindBy (xpath="//input[@id='password']") private WebElement password;
	@FindBy (xpath="//button[@class='button-orange wide']") private WebElement login;
	@FindBy (xpath="//a[text()='Forgot user ID or password?']") private WebElement forgot;
	@FindBy (xpath="//a[text()=\"Don't have an account? Signup now!\"]")private WebElement signUp;
	@FindBy (xpath= "//input[@id='pin']") private WebElement pin;
	@FindBy (xpath="//button[@class='button-orange wide']") private WebElement submit;
	@FindBy (xpath="//a[text()='Forgot 2FA?']")private WebElement forgot2FA;
	@FindBy (xpath="//img[@alt='Kite']") private WebElement logo;
	
	public ZerodhaLoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void enterUserId(String user) {
		userId.sendKeys(user);
	}
	public void enterPassword(String pass) {
		password.sendKeys(pass);
	}
	public void clickOnLogin() {
		login.click();
	}
	public void clickOnForgot() {
		forgot.click();
	}
	public void clickOnSignUp() {
		signUp.click();
	}
	public void enterPin(String user,WebDriver driver) {
		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver); //fluent wait
		wait.withTimeout(Duration.ofMillis(5000));  //total time duration
		wait.pollingEvery(Duration.ofMillis(1000));  // check after this time interval
		wait.ignoring(Exception.class);              // To handle/ignore exception
		wait.until(ExpectedConditions.visibilityOf(pin));  //until this element visibility
		
		
	//	WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(2000)); //explicit
		pin.sendKeys(user);
	// it will check visibility of element every 500milisecond
	}
	public void clickOnSubmit() {
		submit.click();
	}
	public void clickOnForgot2FA() {
		forgot2FA.click();
	}
	public boolean isImageDisplayed() {
		return logo.isDisplayed();
	}
	
}
