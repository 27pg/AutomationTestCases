package TestCaseThirteen;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class addItemsInCart {
	WebDriver driver;

	public addItemsInCart(WebDriver d) {
		// TODO Auto-generated constructor stub
	this.driver=d;
	}
	public void addToCart() throws InterruptedException
	{
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(250,500)", "");	
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='col-sm-9 padding-right']//div[5]//div[1]//div[2]//ul[1]//li[1]//a[1]")).click();//third item click
		Thread.sleep(3000);
		 driver.findElement(By.name("quantity")).clear();
		 driver.findElement(By.name("quantity")).sendKeys("4");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class=\"btn btn-default cart\"]")).click();
		Thread.sleep(2000);
	 	driver.findElement(By.xpath("//div[@class=\"modal-content\"]//div[2]//p[2]//u")).click();//view cart
	 	Thread.sleep(2000);
		
	}

}
