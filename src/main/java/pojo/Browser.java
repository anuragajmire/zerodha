package pojo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {

	public static WebDriver ChromeBrowser() {
		
		//System.setProperty("webdriver.chrome.driver","H:\\java\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		return driver;	
	}
	
	
	
}
