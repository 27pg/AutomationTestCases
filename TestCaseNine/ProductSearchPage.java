package TestCaseNine;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ProductSearchPage {
WebDriver driver;		

	public ProductSearchPage(WebDriver d) {
		// TODO Auto-generated constructor stub
		this.driver =d;
	}
	public void product() throws InterruptedException
	{
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)", "");	
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name=\"search\"]")).sendKeys("jeans");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id=\"submit_search\"]")).click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(150,450)", "");
		
	}
	
}
