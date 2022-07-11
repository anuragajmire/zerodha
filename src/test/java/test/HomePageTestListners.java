package test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.Browser;
import utility.BaseClass;

public class HomePageTestListners extends BaseClass {

	@BeforeMethod
	public void OpenBrowserZerodha() {
	driver=Browser.ChromeBrowser();
	
	}
	
	
	@Test (timeOut=1000)
	public void BuyShare() throws InterruptedException {
	Thread.sleep(500);	
	}
	
	@Test(timeOut=5000)
	public void test() throws InterruptedException {
	Thread.sleep(6000);
	}
	
	@Test
	public void  demo01() {
		
	}
	
	
}
