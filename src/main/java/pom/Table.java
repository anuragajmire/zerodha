package pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Table {

	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		
//		WebElement cPrice=driver.findElement(By.xpath("//table//tbody//tr[6]//td[4]"));
//		String p=cPrice.getText();
//		System.out.println(p);
		
//		List<WebElement> heading =driver.findElements(By.xpath("//table//thead//tr//th"));
//		int column=heading.size();
//		for(int p=0;p<column;p++) {
//			System.out.println(heading.get(p).getText());
//		}
		
		List<WebElement> row=driver.findElements(By.xpath("//table//tbody//tr"));
		int rowSize=row.size();
		double maxPrice=0;
		for(int i=1;i<=rowSize ; i++) {
			
			WebElement currentPage=driver.findElement(By.xpath("//table//tbody//tr["+i+"]//td[4]"));
			String price=currentPage.getText();
			double d=Double.parseDouble(price);
			
			if(d>maxPrice) {
				maxPrice=d;
			}
		}
		System.out.println(maxPrice);
		
		
	}
}
