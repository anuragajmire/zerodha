package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pojo.Browser;
import pom.ZerodhaLoginPage;
import utility.Excel;
import utility.ScreenShot;

public class ZrodhaLoginPageTest {

	WebDriver driver;
	
	@BeforeMethod
	public void openBrowser() {
		driver=Browser.ChromeBrowser();
	}
	@Test
	public void loginTest() throws EncryptedDocumentException, IOException, InterruptedException {
		ZerodhaLoginPage zerodhaLoginPage=new ZerodhaLoginPage(driver);
		String userID=Excel.getData("Credentials", 1, 1);
		String pass=Excel.getData("Credentials", 2, 1);
		String pin=Excel.getData("Credentials", 3, 1);
		boolean status=zerodhaLoginPage.isImageDisplayed();
		zerodhaLoginPage.enterUserId(userID);
		zerodhaLoginPage.enterPassword(pass);
		zerodhaLoginPage.clickOnLogin();
		
		//Assert.assertFalse(status);			//hard assert
		
		SoftAssert softAssert=new SoftAssert();
		softAssert.assertTrue(status);
		zerodhaLoginPage.enterPin(pin,driver);
		zerodhaLoginPage.clickOnSubmit();
		softAssert.assertAll();
	}
	@AfterMethod
	public void takePhoto() throws IOException {
		ScreenShot.takeScreenShot(driver, "zerodha");
	}
	
	
	
}
