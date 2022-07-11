package pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {

		public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.get("https://demo.guru99.com/test/web-table-element.php");
			List<WebElement> row=driver.findElements(By.xpath("//table//tbody//tr"));
			int rowSize=row.size();
			double maxPrice=0;
			for (int i=1;i<=rowSize;i++) {
			WebElement currentPrice=driver.findElement(By.xpath("//table//tbody//tr["+i+"]//td[4]"));
			String price=currentPrice.getText();
			double d=Double.parseDouble(price);
			if(d>maxPrice) {
				maxPrice=d;
			}
			}
			System.out.println("max number is"+maxPrice);
			
			for(int j=1;j<rowSize;j++) {
			WebElement currentPrice=driver.findElement(By.xpath("//table//tbody//tr["+j+"]//td[4]"));
			String price=currentPrice.getText();
			double d=Double.parseDouble(price);
			if(d<maxPrice) {
				maxPrice=d;
			}
			}
			System.out.println("Min price is"+maxPrice);
			
			
			
			
			
			
			
			
		}
}
