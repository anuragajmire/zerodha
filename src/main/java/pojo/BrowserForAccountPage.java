package pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserForAccountPage {
	
	
	public static WebDriver ChromrBrowser() {
		System.setProperty("webdriver.chrome.driver","H:\\java\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://zerodha.com/open-account?c=RAINMT&utm_source=kite&utm_medium=web&utm_campaign=account");
		driver.manage().window().maximize();
		return driver;
	}

}
