package TestCaseEight;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ProductPage {
	WebDriver driver;		
	
	public ProductPage(WebDriver d) {
		// TODO Auto-generated constructor stub
		this.driver =d;
	}
	public void product() throws InterruptedException
	{
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(150,450)", "");	
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='col-sm-9 padding-right']//div[2]//div[1]//div[2]//ul[1]//li[1]//a[1]")).click();
		Thread.sleep(3000);
	}
	
	
	
	
}
