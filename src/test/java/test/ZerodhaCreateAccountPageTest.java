package test;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.BrowserForAccountPage;
import pom.ZerodhaCreateAccountPage;
import utility.Excel;

public class ZerodhaCreateAccountPageTest {
	WebDriver driver;
	
	@BeforeMethod 
	public void OpenBrowser() {
		driver=BrowserForAccountPage.ChromrBrowser();
	}
	
	@Test 
	public void CreateAccountTest() throws EncryptedDocumentException, IOException {
		
		ZerodhaCreateAccountPage zerodhaCreateAccountPage=new ZerodhaCreateAccountPage(driver);
		String No=Excel.getData("Credentials", 2, 1);
		
		zerodhaCreateAccountPage.enterMobileNo(No);
		zerodhaCreateAccountPage.clickOnContinue();
	}
	
	
	
	
	
	
	
}
